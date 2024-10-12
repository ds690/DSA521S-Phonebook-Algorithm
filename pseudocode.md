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
