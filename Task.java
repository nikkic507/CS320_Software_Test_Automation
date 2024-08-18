package task;

import java.util.concurrent.atomic.AtomicLong;

public class Task {
	private final String taskId; //cannot be longer than 10 characters
	private String taskName;//cannot be longer than 20 characters
	private String taskDesc;//cannot be longer than 50 characters
	private static AtomicLong idGenerator = new AtomicLong();
	//constructor
	public Task(String taskName, String taskDesc) {
		
		this.taskId = String.valueOf(idGenerator.getAndIncrement());
		
		//task name no longer than 20 characters and not null
		if(taskName == null || taskName.isEmpty()) {
			this.taskName = "taskName";
		}
		else if (taskName.length() > 20) {
			this.taskName = taskName.substring (0, 20);
		}
		else {
			this.taskName = taskName;
		}
		//task description no longer than 50 characters 
		if(taskDesc == null || taskDesc.isEmpty()) {
			this.taskDesc = "taskDesc";
		}
		else if (taskDesc.length() > 50) {
			this.taskDesc = taskDesc.substring(0, 50);
		}
		else {
			this.taskDesc = taskDesc;
		}
	}
	// getter task ID
	public String gettaskId() {
		return taskId;
	}
	//getter task Name
	public String gettaskName() {
		return taskName;
	}
	//getter task description
	public String gettaskDesc() {
		return taskDesc;
	}
	
	
	
	//setter task name
	public void settaskName(String Name) {
		if(taskName == null || taskName.isEmpty()) {
			this.taskName = "taskName";
		}
		else if (taskName.length() > 20) {
			this.taskName = taskName.substring(0, 20);
		}
		
	}
	//setter task description
	public void settaskDesc(String Desc) {
		if(taskDesc == null || taskDesc.isEmpty()) {
			this.taskDesc = "taskDesc";
		}
		else if (taskDesc.length() > 50) {
			this.taskDesc = taskDesc.substring(0, 50);
		}
		
		
	}
	

}	
		

