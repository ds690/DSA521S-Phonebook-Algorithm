import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Phonebook {
    private final ArrayList<Contact> contacts;
    private final String FILENAME = "contacts.txt";  

    public Phonebook() {
        contacts = new ArrayList<>();
        loadContactsFromFile();  
    }

    public void insertContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("\u001B[31mError: Contact name cannot be empty!\u001B[0m");
            return;
        }

        System.out.print("Enter contact number: ");
        String number = scanner.nextLine().trim();

        if (number.isEmpty()) {
            System.out.println("\u001B[31mError: Contact number cannot be empty!\u001B[0m");
            return;
        }

        contacts.add(new Contact(name, number));
        System.out.println("\u001B[32mContact added successfully.\u001B[0m");
        saveContactsToFile();  
    }

    public void searchContact() {
        if (contacts.isEmpty()) {
            System.out.println("\u001B[31mNo contacts to search.\u001B[0m");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name to search: ");
        String name = scanner.nextLine().trim();

        sortContacts();

        int index = binarySearch(name);
        if (index != -1) {
            Contact contact = contacts.get(index);
            System.out.println("\u001B[32mContact found: " + contact.getName() + " - " + contact.getNumber() + "\u001B[0m");
        } else {
            System.out.println("\u001B[31mContact not found.\u001B[0m");
        }
    }

    private int binarySearch(String name) {
        int low = 0, high = contacts.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Contact midContact = contacts.get(mid);
            int comparison = midContact.getName().compareToIgnoreCase(name);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void updateContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name to update: ");
        String name = scanner.nextLine().trim();

        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new contact number: ");
                String newNumber = scanner.nextLine().trim();
                contact.setNumber(newNumber);
                System.out.println("\u001B[32mContact updated successfully.\u001B[0m");
                found = true;
                saveContactsToFile();  
                break;
            }
        }

        if (!found) {
            System.out.println("\u001B[31mContact not found.\u001B[0m");
        }
    }

    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name to delete: ");
        String name = scanner.nextLine().trim();

        boolean found = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("\u001B[32mContact deleted successfully.\u001B[0m");
                found = true;
                saveContactsToFile();  
                break;
            }
        }

        if (!found) {
            System.out.println("\u001B[31mContact not found.\u001B[0m");
        }
    }

    public void sortContacts() {
        if (contacts.isEmpty()) {
            System.out.println("\u001B[31mNo contacts to sort.\u001B[0m");
            return;
        }

        Collections.sort(contacts, Comparator.comparing(Contact::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("\u001B[32mContacts sorted successfully.\u001B[0m");
    }

    private void saveContactsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Contact contact : contacts) {
                writer.write(contact.getName() + "," + contact.getNumber());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("\u001B[31mError saving contacts to file.\u001B[0m");
        }
    }

    private void loadContactsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    contacts.add(new Contact(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("\u001B[31mNo previous contacts found.\u001B[0m");
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\u001B[34mPhonebook Menu:\u001B[0m");
            System.out.println("1. Insert Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Sort Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("\u001B[31mInvalid choice. Please enter a number.\u001B[0m");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> phonebook.insertContact();
                case 2 -> phonebook.searchContact();
                case 3 -> phonebook.updateContact();
                case 4 -> phonebook.deleteContact();
                case 5 -> phonebook.sortContacts();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("\u001B[31mInvalid choice. Please try again.\u001B[0m");
            }
        } while (choice != 6);
    }
}
