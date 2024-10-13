# DSA521S-Phonebook-Algorithm
A simple phonebook application for a Namibian telecommunications company using basic linear data structures.
# Phonebook Algorithm - DSA521S Group Project

## Project Summary

This project is a phonebook application developed as part of the DSA521S Data Structures and Algorithms group assignment. The application supports basic operations such as **Insert**, **Search**, **Delete**, **Update**, and **Display** contacts, designed using simple linear data structures like arrays and linked lists.

The project aims to create an efficient phonebook algorithm for a Namibian telecommunications company.

---

## Features

# Section A: Pseudocode for Phonebook Application

# Module 1: Insert Contact
# Adds a new contact to the phonebook
Start
  Prompt user with "Enter contact name"
  Get name
  Prompt user with "Enter contact number"
  Get number
  Create a new contact with (name, number)
  Append contact to the phonebook list
  Display "Contact added successfully"
End

# Module 2: Search Contact
# Searches for a contact by name in the phonebook
Start
  Prompt user with "Enter contact name to search"
  Get name
  Set found to False
  For each contact in the phonebook
    If contact.name equals name
      Display contact details (name, number)
      Set found to True
      Exit loop
  If found is False
    Display "Contact not found"
End

# Module 3: Delete Contact
# Deletes a contact by name from the phonebook
Start
  Prompt user with "Enter contact name to delete"
  Get name
  Set found to False
  For each contact in the phonebook
    If contact.name equals name
      Remove contact from the phonebook list
      Display "Contact deleted successfully"
      Set found to True
      Exit loop
  If found is False
    Display "Contact not found"
End

# Module 4: Update Contact
# Updates the phone number of an existing contact
Start
  Prompt user with "Enter contact name to update"
  Get name
  Set found to False
  For each contact in the phonebook
    If contact.name equals name
      Prompt user with "Enter new contact number"
      Get newNumber
      Update contact.number to newNumber
      Display "Contact updated successfully"
      Set found to True
      Exit loop
  If found is False
    Display "Contact not found"
End

# Module 5: Display All Contacts
# Displays all the contacts in the phonebook
Start
  If phonebook is empty
    Display "No contacts to display"
  Else
    For each contact in the phonebook
      Display contact.name and contact.number
End

# Module 6: Sort Contacts (Optional)
# Sorts the contacts alphabetically by name to improve search performance
Start
  If phonebook is not empty
    Sort contacts in phonebook by contact.name in ascending order
    Display "Contacts sorted successfully"
  Else
    Display "No contacts to sort"
End

# Module 7: Efficiency Analysis (Search Algorithm)
# Analyzes the time complexity of the search algorithm
Start
  Count the number of contacts in the phonebook as n
  If using linear search (unsorted)
    Time complexity is O(n)
  If using binary search (after sorting)
    Time complexity is O(log n)
End

---

## Group Members

| Name             | Student Number |
|------------------|----------------|
| Llewelyn H Kole  |   222006765    |
| John Mitchell    |   223116173    |
| Danielle Riddles |   201056496    |
| Lleni C Nangombe |   224097989    |

Each member contributed to different parts of the project, including coding, flowchart design, and documentation.

---

## Modules and Functions

### 1. Insert Contact
- **Purpose**: Adds a new contact to the phonebook.
- **Function**: `InsertContact(name, number)`

### 2. Search Contact
- **Purpose**: Searches for a contact by name and displays the contact information.
- **Function**: `SearchContact(name)`

### 3. Delete Contact
- **Purpose**: Deletes a contact from the phonebook.
- **Function**: `DeleteContact(name)`

### 4. Update Contact
- **Purpose**: Updates an existing contact's phone number.
- **Function**: `UpdateContact(name, newNumber)`

### 5. Display Contacts
- **Purpose**: Displays all contacts in the phonebook.
- **Function**: `DisplayContacts()`

### 6. Sort Contacts (Optional)
- **Purpose**: Sorts contacts by name to optimize search performance.
- **Function**: `SortContacts()`

### 7. Efficiency Analysis
- **Purpose**: Analyzes the time complexity of the search algorithm.

---

## Pseudocode

The pseudocode is added to pseudocode.md file in the repository.

  
---

## Flowchart

- Flowchart: A detailed flowchart representing each of the phonebook operations is included below.
- ![Flow Chart Phonebook drawio (1)](https://github.com/user-attachments/assets/5601bcb5-39a4-4140-9148-ecaa6e9e7ee6)




---

## Documentation

The project is fully documented with clear descriptions of each module and function. Well-organized files in the repository are provided, along with necessary flowcharts, ensures the project is easy to understand and use.

---

## Conclusion

This project provides a fully functional phonebook application using linear data structures and modular design principles. All key operations such as inserting, searching, deleting, and updating contacts are supported, and the efficiency of the search operation is analyzed.

---
# Phonebook Java Project(Part B)

## Description
This is a Java-based Phonebook application that allows users to manage a list of contacts. The project includes features such as inserting, searching, updating, deleting, and sorting contacts. Additionally, the application saves contacts to a file and loads them when the program starts.

This project was implemented as part of the **Part B** assignment, following the design from **Part A**.

## Features
- **Insert Contact**: Add a new contact with a name and phone number.
- **Search Contact**: Search for a contact by name using binary search after sorting.
- **Update Contact**: Update the phone number of an existing contact.
- **Delete Contact**: Remove a contact by name.
- **Sort Contacts**: Sort the list of contacts alphabetically by name.
- **File I/O**: 
  - **Save contacts** to a file (`contacts.txt`).
  - **Load contacts** from the file when the program starts.

## How to Run

### Prerequisites
- **Java Development Kit (JDK)** installed on your machine.
- **Apache NetBeans IDE** (or any other IDE of your choice).

### Steps to Run the Program:
1. **Download or Clone the Repository**:
   - You can clone the repository using:
     ```bash
     git clone https://github.com/yourusername/Phonebook-Java-Project.git
     ```
     or download the ZIP file and extract it to your preferred location.
  
2. **Open the Project in Apache NetBeans**:
   - Open **NetBeans**.
   - Navigate to **File > Open Project**.
   - Select the `Phonebook Project` folder and click **Open**.

3. **Run the Program**:
   - Right-click on the `Phonebook.java` file inside the **src** folder.
   - Select **Run File** to execute the application.
   - The program will display a menu in the console for the phonebook operations.

4. **Using the Phonebook**:
   - You will be prompted with the following menu in the console:
     ```
     Phonebook Menu:
     1. Insert Contact
     2. Search Contact
     3. Update Contact
     4. Delete Contact
     5. Sort Contacts
     6. Exit
     ```
   - Choose the desired operation by typing the corresponding number and following the prompts.

### Example Usage:
1. To **insert a contact**, choose option `1`, then enter the contact name and number.
2. To **search for a contact**, choose option `2`, then enter the contact name to search.
3. To **update a contact**, choose option `3` and provide the contact name and new phone number.
4. To **delete a contact**, choose option `4` and provide the contact name.
5. To **sort contacts**, choose option `5` and the contacts will be sorted alphabetically.
6. Choose option `6` to exit the program.

## File I/O (contacts.txt)
- The application automatically saves all contacts to `contacts.txt` when any changes are made (adding, updating, deleting).
- When the application starts, it loads the contacts from this file, ensuring data persistence across sessions.

## Project Structure
- **src**: Contains the main Java files (`Phonebook.java` and `Contact.java`).
- **build.xml**: The build configuration for NetBeans.
- **contacts.txt**: The file where contacts are stored.

## Future Enhancements
Possible future improvements could include:
- Implementing a graphical user interface (GUI) using Java Swing or JavaFX.
- Adding validation to ensure that phone numbers only contain digits.
- Adding the ability to export contacts to other formats, such as CSV.


