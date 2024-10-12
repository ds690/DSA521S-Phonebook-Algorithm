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
- ![Flow Chart Phonebook](https://github.com/user-attachments/assets/d1f22a1a-d022-45bf-8c01-b9fc4235af42)


---

## Documentation

The project is fully documented with clear descriptions of each module and function. Well-organized files in the repository are provided, along with necessary flowcharts, ensures the project is easy to understand and use.

---

## Conclusion

This project provides a fully functional phonebook application using linear data structures and modular design principles. All key operations such as inserting, searching, deleting, and updating contacts are supported, and the efficiency of the search operation is analyzed.

---
