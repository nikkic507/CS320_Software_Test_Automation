package Test;



import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contact.Contact;


public class ContactTest {
	//testing for character lengths of no more than 10 for first and last names, and phone number
	// testing for character length of no more than 30 for address
	//testing for null values, getters and setters	
	@Test
	void testContactIdWithMoreThanTenCharacters() {
		Contact contact = new Contact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		if(contact.getcontactId().length()> 10) {
			fail("Contact ID can have no more than 10 characters");
		}
	}
	
	@Test
	void testContactFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		if (contact.getfirstName().length()> 10) {
			fail ("First name can have no more than 10 characters");
		}
	}
	
	@Test
	void testContactLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact ("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		if (contact.getlastName().length()> 10) {
			fail("Last name can have no more than 10 characters");
		}
	}
	
	@Test
	void testContactPhoneNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		if (contact.getphoneNumber().length()!= 10) {
		fail("Phone number can have now more than 10 characters");
	}
	}
	
	@Test
	void testContactAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
			if (contact.getcontactAddress().length() > 30) {
				fail("Address can have no more than 30 characters");
			}
		}
	
	@Test 
	void testFirstNameNullArgument() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact (null, "lastName", "phoneNumber", "contactAddress");
		});
	}
	
	@Test
	void testLastNameNullArgument() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("Mackenzie", null, "2703508588", "151 Walnut Street");
		});
	}
	
	@Test
	void testContactPhoneNumberArgument() {
		new Contact("Mackenzie", "Alfonz", "phoneNumber", "151 Walnut Street");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			
		});
	}
	
	@Test
	void testContactAddressArgument() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Contact ("Mackenzie", "Alfonze", "2703508588", null);
		});
	}
	@Test
	void testContactAndGetters() {
		Contact contact = new Contact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		assertTrue(contact.getfirstName().equals("Mackenzie"));
		assertTrue(contact.getlastName().equals("Alfonz"));
		assertTrue(contact.getphoneNumber().equals("2703508588"));
		assertTrue(contact.getcontactAddress().equals("151 Walnut Street"));
		
	}
	
	@Test
	void testSettersFirstAndLastName() {
		Contact contact = new Contact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		contact.setfirstName("Mackenzie");
		contact.setlastName("Alfonze");
		assertTrue(contact.getfirstName().equals("Mackenzie"));
		assertTrue(contact.getlastName().equals("Alfonze"));
		
	}
	
	@Test
	void testSettersPhoneNumberAndContactAddress() {
		Contact contact = new Contact("Mackenzie", "Alfonz", "2703508588", "151 Walnut Street");
		contact.setphoneNumber("2703508588");
		contact.setcontactAddress("151 Walnut Street");
		assertTrue(contact.getphoneNumber().equals("2703508588"));
		assertTrue(contact.getcontactAddress().equals("151 Walnut Street"));
		
	}
	
	
}
