package appointment;

import java.util.Date;
import java.util.ArrayList;

public class AppointmentService {
	
	//use an array list to hold appointments on a list
	public ArrayList<Appointment>apptList = new ArrayList<Appointment>();
	
	//add new appointment using constructor and add to the list
	public void addAppt (Date apptDate, String apptDesc) {
		Appointment appointment = new Appointment (apptDate, apptDesc);
		apptList.add(appointment);
	}
	
	//return appointment object using the appointment ID
	public Appointment getAppt(String apptId) {
		Appointment appointment = new Appointment (null, null);
		for (int counter = 0; counter < apptList.size(); counter ++) {
			if (apptList.get(counter).getapptId().contentEquals(apptId)) {
				appointment = apptList.get(counter);
			}
		}
		return appointment;
	}
		//Use appointment ID to delete the correct appointment
		public void deleteAppt (String apptId) {
			for (int counter = 0; counter< apptList.size(); counter++) {
				if (apptList.get(counter).getapptId().equals(apptId)) {
					apptList.remove(counter);
					break;
				}
				if (counter == apptList.size() -1) {
					System.out.println (apptId + " not found.");
				}
			}
		}
		
		public void displayapptList() {
			for (int counter = 0; counter < apptList.size(); counter ++) {
				System.out.println("Appointment ID: " + apptList.get(counter).getapptId());
				System.out.println("Appointment date: " + apptList.get(counter).getapptDate());
				System.out.println("Appointment description: " + apptList.get(counter).getapptDesc());
			}
		}
		public void updateApptDate (Date updatedDate, String apptId) {
			for (int counter = 0; counter < apptList.size(); counter++) {
				if (apptList.get(counter).getapptId().equals(apptId)) {
					apptList.get(counter).setapptDate(updatedDate);
					break;
				}
				if(counter == apptList.size() -1) {
					System.out.println("Appointment ID:" + apptId + " was not found.");
				}
			}
		}
		public void updateApptDesc(String updatedString, String apptId) {
			for (int counter = 0;counter< apptList.size(); counter ++) {
				if(apptList.get(counter).getapptId().equals(apptId)) {
					apptList.get(counter).setapptDesc(updatedString);
					break;
				}
				if (counter == apptList.size() -1) {
					System.out.println("Appointment ID: " + apptId + " was not found.");
				}
			}
		}
		
	}
	
