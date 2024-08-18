package appointment;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Appointment {
	
	private final String apptId; //cannot be null or more than 10 characters
	private Date apptDate;//cannot be null or in the past
	private String apptDesc;//cannot be null or longer than 50 characters
	private static AtomicLong idGenerator = new AtomicLong();
	
	
		
	@SuppressWarnings("deprecation")
	public Appointment(Date apptDate, String apptDesc) {
           this.apptId = String.valueOf(idGenerator.getAndIncrement());
		
		//verify not null or in the past
		if (apptDate == null) { 
			this.apptDate = new Date(2024, Calendar.AUGUST, 1);
		}
		else if (apptDate.before(new Date())) {
		   throw new IllegalArgumentException ("Invalid appointment date.");
		}
		   else {
			   this.apptDate = apptDate;
		   }
		//verify not null or more than 50 chars
		if (apptDesc == null || apptDesc.isEmpty()) {
			this.apptDesc = "Null";
		}
		else if (apptDesc.length() > 50) {
			this.apptDesc = apptDesc.substring(0, 50);
		}
		else {
			this.apptDesc = apptDesc;
		}
		}
		
	
	//getters
	public String getapptId() {
		return apptId;
	}
	
	public Date getapptDate() {
		return apptDate;
	}
	public String getapptDesc() {
		return apptDesc;
	}
	//setters
	public void setapptDate(Date apptDate) {
		if (apptDate == null|| apptDate.before(new Date())) {
			throw new IllegalArgumentException ("Invalid appointment date");
		}
		this.apptDate = apptDate;
	}
	
	public void setapptDesc(String apptDesc) {
		if(apptDesc == null || apptDesc.length() > 50) {
			throw new IllegalArgumentException(apptDesc + " is not a valid description.");
		}
		this.apptDesc = apptDesc;
	}
	
	

}
