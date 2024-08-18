package contact;

import java.util.ArrayList;


import contact.Contact;
public class ContactService {
	//Array list for contacts 
		public ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		//display list of contacts
		//public void displaycontactList() {
			//for(int counter = 0; counter < contacts.size(); counter++) {
				//System.out.println("Contact ID: " + contacts.get(counter).getcontactId());
				//System.out.println("First name: " + contacts.get(counter).getfirstName());
				//System.out.println("Last name: " + contacts.get(counter).getlastName());
				//System.out.println("Phone number: " + contacts.get(counter).getphoneNumber());
				//System.out.println("Contact address: " + contacts.get(counter).getcontactAddress());
			//}
		//}
		
		//Add new contact with the contact constructor and assign new contact to list
		public void addContact(String firstName, String lastName, String phoneNumber, String contactAddress) {
			//create new contact
			Contact contact = new Contact(firstName, lastName, phoneNumber, contactAddress);
			contacts.add(contact);
		
		}
		
		//return a contact object using contact ID
		public Contact getContact(String contactId) {
			Contact contact = new Contact("firstName", "lastName", null, "contactAddress");
			for (int counter = 0; counter<contacts.size(); counter++) {
				if (contacts.get(counter).getcontactId().contentEquals(contactId)) {
					contact = contacts.get(counter);
				}
			}
			return contact;
		}
		

		//delete contact using contactId 
		public void deleteContact(String contactId) {
			for (int counter = 0; counter< contacts.size();) {
				contacts.remove(counter);
				break;
			}
			int counter = 0;
			if (counter ==contacts.size()-1) {
				System.out.println("Contact ID: " + contactId + " not found.");
			}
			
		}

	//update first name 
	public void updatefirstName(String updatedString, String contactId) {
		for(int counter = 0; counter< contacts.size(); counter++) {
			if(contacts.get(counter).getcontactId().equals(contactId)) {
				contacts.get(counter).setfirstName(updatedString);;
				break;
			}
			
			if (counter == contacts.size() -1) {
				System.out.println ("Contact ID: " + contactId + " not found.");
			}
		}
	}

	//Update Last Name
	public void updatelastName(String updatedString, String contactId) {
		for (int counter = 0; counter< contacts.size(); counter++) {
			if (contacts.get(counter).getcontactId().equals(contactId)) {
				contacts.get(counter).setlastName(updatedString);
				break;
			}
			if (counter == contacts.size() -1) {
				System.out.println("Contact ID: " + contactId + " not found.");
			}
		}
	}

	//Update phone number
	public void updatephoneNumber(String updatedString, String contactId) {
		for(int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getcontactId().equals(contactId)) {
				contacts.get(counter).setphoneNumber(updatedString);
				break;
			}
			if (counter == contacts.size() -1) {
				System.out.println("Contact ID: " + contactId + " not found.");
			}
		}
	}

	//update contact address
	public void updatecontactAddress(String updatedString, String contactId) {
		for (int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getcontactId().equals(contactId)) {
				contacts.get(counter).setcontactAddress(updatedString);
				break;
			}
			if (counter == contacts.size() -1) {
				System.out.println("Contant ID:" + contactId + " not found.");
			}
		}
	  }
}
		
	
	

