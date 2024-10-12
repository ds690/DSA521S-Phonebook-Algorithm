Here the pseudocode is listed down with some comments for it.

###1. Insert Contact
Pseudocode:
Start
  # Step 1: Prompt user for contact name
  Prompt user for "Enter contact name"
  Get name

  # Step 2: Prompt user for contact number
  Prompt user for "Enter contact number"
  Get number

  # Step 3: Create a new contact using the inputs
  Create new contact as (name, number)

  # Step 4: Append the contact to the phonebook list
  Append contact to phonebook list

  # Step 5: Confirm successful addition
  Display "Contact added successfully"
End

###2. Search Contact
Pseudocode:
Start
  # Step 1: Prompt user for the contact name to search
  Prompt user for "Enter contact name"
  Get name

  # Step 2: Iterate through the phonebook list to find the contact
  For each contact in phonebook
    # Step 3: Check if the contact's name matches the input
    If contact.name equals name
      # Step 4: Display the contact's details if found
      Display contact details
      Exit

  # Step 5: If contact not found, display a message
  Display "Contact not found"
End

###3. Delete Contact
Pseudocode:
Start
  # Step 1: Prompt user for the contact name to delete
  Prompt user for "Enter contact name"
  Get name

  # Step 2: Iterate through the phonebook list
  For each contact in phonebook
    # Step 3: Check if the contact's name matches the input
    If contact.name equals name
      # Step 4: Remove the contact from the phonebook list
      Remove contact from phonebook list
      Display "Contact deleted"
      Exit

  # Step 5: If contact not found, display a message
  Display "Contact not found"
End

###4. Update Contact
Pseudocode:
Start
  # Step 1: Prompt user for the contact name to update
  Prompt user for "Enter contact name"
  Get name
  # Step 2: Iterate through the phonebook list
  For each contact in phonebook
    # Step 3: Check if the contact's name matches the input
    If contact.name equals name
      # Step 4: Prompt user for the new number
      Prompt user for "Enter new contact number"
      Get new number
       # Step 5: Update the contact's number
       Update contact number
        # Step 6: Confirm the update was successful
        Display "Contact updated"
        Exit
    # Step 7: If contact not found, display a message
      Display "Contact not found"
   End

###5. Display All Contacts
Pseudocode:
Start
  # Step 1: Check if the phonebook is empty
  If phonebook is empty
    # Step 2: Display message if there are no contacts
    Display "No contacts to display"
  Else
    # Step 3: Iterate through the phonebook and display each contact
    For each contact in phonebook
      Display contact details
End

###6. Sort Contacts (Optional)
Pseudocode:
Start
  # Step 1: Check if the phonebook is not empty
  If phonebook is not empty
    # Step 2: Sort the contacts by name in ascending order
    Sort contacts by name (ascending)

  # Step 3: Confirm the contacts are sorted
  Display "Contacts sorted"
End

###7. Efficiency Analysis (Search Algorithm)
Pseudocode:
Start
  # Step 1: Count the number of contacts in the phonebook as n
  Count contacts in phonebook as n

  # Step 2: Analyze the time complexity of the search operation
  If search is linear (unsorted)
    Time complexity = O(n)

  # Step 3: Analyze time complexity if sorting is applied
  If contacts are sorted (optional)
    Time complexity of binary search = O(log n)
End


