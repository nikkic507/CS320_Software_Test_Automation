package Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;
import contact.Contact;
import contact.ContactService;

class ContactServiceTest {
	
	
	@Test
	void testUpdateFirstName() {
		ContactService contactService = new ContactService();
		contactService.addContact("first name", "lastName", "phoneNumber", "contactAddress");
		contactService.updatefirstName("firstName", "3");
		assertEquals("firstName", contactService.getContact("3").getfirstName(), "First name not updated.");
	}
	
	@Test
	void testUpdateLastName() {
		ContactService contactService = new ContactService();
		contactService.addContact("first name", "last name", "phone number", "contact address");
		contactService.updatelastName("lastName", "1");
		assertEquals("lastName", contactService.getContact("1").getlastName(), "Last name was not updated.");
	}
	
	@Test
	void testUpdatePhoneNumber() {
		ContactService contactService = new ContactService();
		contactService.addContact("first name", "last name", "phone number", "contact address");
		contactService.updatephoneNumber("3216549871", "3");
		assertEquals("3216549871", contactService.getContact("3").getphoneNumber(), "Phone number was not updated.");
	}
	
	@Test
	void testUpdateContactAddress() {
		ContactService contactService = new ContactService();
		contactService.addContact("first name", "last name", "phone number", "contact address");
		contactService.updatecontactAddress("contactAddress", "9");
		assertEquals("contactAddress", contactService.getContact("9").getcontactAddress(), "Contact address was not updated.");
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		contactService.deleteContact("9");
		ArrayList<Contact> myContactsEmpty = new ArrayList<Contact>();
		assertEquals(contactService.contacts, myContactsEmpty, "The contact was not deleted.");
	}
	@Test
	void testAddContactToList() {
		ContactService contactService = new ContactService();
		contactService.addContact("firstName", "lastName", "phoneNumber", "contactAddress");
		assertNotNull(contactService.getContact("5"), "Contact not added correctly.");
	}

	}


