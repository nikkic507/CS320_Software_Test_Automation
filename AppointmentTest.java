package Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import appointment.Appointment;

class AppointmentTest {
	
	private Date Date(int i, int august, int j) {
		return null;
	}

	//appointment ID cannot be longer than 10 chars
	@Test
	void testApptIdLength() {
		Appointment appointment = new Appointment (Date(2024, Calendar.AUGUST,1), "Description");
		if (appointment.getapptId().length() > 10) {
		fail("Appointment ID has more than 10 characters");
	}
	}
	//appointment description cannot be longer than 50 chars
	@Test
	void testApptDescLength() {
		Appointment appointment = new Appointment (Date(2024, Calendar.AUGUST, 1), "We need an appointment description with more than fifty characters to throw and error" );
		if (appointment.getapptDesc().length() > 50 ) {
			fail ("Appointment description is more that fifty characters");
		}
	}
	//appointment date cannot be in the past
	@Test
	void testApptPastDate() {
		Appointment appointment = new Appointment (Date(2023, Calendar.AUGUST, 1), "Dentist Appointment");
		if (appointment.getapptDate().before(new Date())) {
			fail ("The appointment date needs to be on or after current date");
		}
	}
	//appointment date cannot be null
	@Test
	void testNoNullApptDate() {
		Appointment appointment = new Appointment(null, "Description");
		assertNotNull(appointment.getapptDate(), "Appointment date is null.");
	}
	//Appointment description cannot be null
	@Test
	void testNoNullApptDesc(){
		Appointment appointment = new Appointment (Date(2024, Calendar.AUGUST, 1), null);
		assertNotNull(appointment.getapptDesc(), "Null Description");
	}
	@Test 
	void testApptSetters() {
		Appointment appointment = new Appointment( new Date(), "apptDesc");
		appointment.setapptDate(new Date());
		appointment.setapptDesc("apptDesc");
		assertTrue(appointment.getapptDate().equals(new Date()));
		assertTrue(appointment.getapptDesc().equals("apptDesc"));
	}

}
