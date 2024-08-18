package contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	
	//fields shall not be null
	private final String contactId; //no longer than 10 characters 
	private String firstName; //no longer than 10 characters
	private String lastName; //no longer than 10 characters
	private String phoneNumber; //must be exactly 10 digits
	private String contactAddress; //no longer than 30 characters
    private static AtomicLong idGenerator = new AtomicLong();
	
	//constructor
	public Contact (String firstName, String lastName, String phoneNumber, String contactAddress) {
		this.contactId = String.valueOf(idGenerator.getAndIncrement());
		
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = firstName;
		}
		else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		}
		else {
			this.firstName = firstName;
		}
			
		
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = lastName;
		}
		else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		}
		else {
			this.lastName =lastName;
		}
		
		if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() != 10) {
			this.phoneNumber = "3216549871";
		}
		else {
			this.phoneNumber = phoneNumber;
		}
		
		if (contactAddress == null || contactAddress.isEmpty()) {
			this.contactAddress = contactAddress;
		}
		else if (contactAddress.length() > 30) {
			this.contactAddress = contactAddress.substring(0, 30);
		}
		else {
			this.contactAddress = contactAddress;
		}
		
		
	}
	
	//getters
	public String getcontactId(){
		return contactId;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public String getcontactAddress() {
		return contactAddress;
	}
	
	//setters

	
	public void setfirstName (String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException ("Invalid first name");
	}
		else {
		this.firstName = firstName;
		}
		
	}
	
	public void setlastName (String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException ("Invalid last name");
		}
		else {
		this.lastName = lastName;
	}
}
	public void setphoneNumber(String phoneNumber) {
		if(phoneNumber== null|| phoneNumber.length()>10 || phoneNumber.length()<10) {
			throw new IllegalArgumentException ("Invalid phone number");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public void setcontactAddress  (String contactAddress) {
		if (contactAddress == null || contactAddress.length()>30) {
			throw new IllegalArgumentException ("Invalid contact address");
		}
		else {
		this.contactAddress = contactAddress;
	}
}
}