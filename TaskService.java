package task;

import java.util.ArrayList;





public class TaskService {
	
	public ArrayList<Task> taskList = new ArrayList<Task>();
	
	
	//listing tasks
	public void displaytaskList() {
		for (int counter = 0; counter < taskList.size(); counter ++) {
			System.out.println("Task ID: " + taskList.get(counter).gettaskId());
			System.out.println("Task Name: " + taskList.get(counter).gettaskName());
			System.out.println("Task Description: " + taskList.get(counter).gettaskDesc());
		}
	}
	


	//add task
	public void addTask(String taskName, String taskDesc) {
		Task task = new Task (taskName, taskDesc);
		taskList.add(task);
	}
	//taskId is used to return task object
	public Task getTask(String taskId) {
		Task task = new Task(null, null);
		for (int counter = 0; counter <taskList.size(); counter ++) {
			if(taskList.get(counter).gettaskId().contentEquals(taskId)){
				task = taskList.get(counter);
			}
		}
		return task;
	}
	//Delete task using taskId
	public void deleteTask(String taskId) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if(taskList.get(counter).gettaskId().equals(taskId)) {
				taskList.remove(counter);
				break;
			}
			if (counter == taskList.size() -1) {
				System.out.println("Task ID: " + taskId + " was not found.");
			}
		}
	}
	public void updateTaskName(String updatedString, String taskId) {
		for (int counter = 0; counter < taskList.size(); counter ++) {
			if (taskList.get(counter).gettaskId().equals(taskId)) {
				taskList.get(counter).settaskName(updatedString);
				break;
			}
			if (counter == taskList.size() -1) {
				System.out.println("Task ID: " + taskId + " was not found.");
			}
		}
	}
	public void updateTaskDesc(String updatedString, String taskId) {
		for(int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).gettaskId().equals(taskId)) {
				taskList.get(counter).settaskDesc(updatedString);
				break;
			}
			if (counter == taskList.size() -1) {
				System.out.println("Task ID: " + taskId + " was not found.");
			}
		}
	}
}
	


