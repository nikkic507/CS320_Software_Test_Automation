package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;
import appointment.Appointment;
import appointment.AppointmentService;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
	
	private Date Date(int i, int august, int j) {
		return null;
	}
	
	@Test
	void testUpdateApptDate() {
		AppointmentService apptService = new AppointmentService();
		apptService.addAppt(Date(2024, Calendar.AUGUST, 1), "apptDesc");
		apptService.updateApptDate(Date (2026, Calendar.SEPTEMBER, 1), "3");
		apptService.displayapptList();
		assertEquals(Date(2026, Calendar.SEPTEMBER, 1), apptService.getAppt("3").getapptDate(), "Date was not updated");
	}
	
	@Test 
	void testUpdateApptDesc() {
		AppointmentService apptService = new AppointmentService();
		apptService.addAppt(Date (2024, Calendar.AUGUST, 1), "apptDesc");
		apptService.updateApptDesc("Updated apptDesc", "5");
		apptService.displayapptList();
		assertEquals("Updated apptDesc", apptService.getAppt("5").getapptDesc(), "Appointment description could not be updated.");
	}
	//test for adding appointment
		@Test
		void testAddAppt() {
			AppointmentService apptService = new AppointmentService();
			apptService.addAppt(Date(2024, Calendar.AUGUST, 1), "Dentist appointment");
			apptService.displayapptList();
			assertNotNull(apptService.getAppt("4"), "Could not add appointment");
		}
	
	//test for deleting appointment
		@Test
		void testDeleteAppt() {
			AppointmentService apptService = new AppointmentService();
			apptService.addAppt(Date(2024, Calendar.AUGUST, 1), "Dentist Appointment");
			apptService.deleteAppt("2");
			ArrayList<Appointment>apptListEmpty = new ArrayList<Appointment>();
			apptService.displayapptList();
			assertEquals(apptService.apptList, apptListEmpty, "Appointment could not be deleted");
		}
		
	
	
	
	

}
