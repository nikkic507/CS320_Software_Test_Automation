package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import task.Task;

class TaskTest {
	//tests for length restrictions
	@Test
	void testTaskIdTooLong() {
		Task task = new Task ("taskName", "taskDesc");
		if(task.gettaskId().length() > 10) {
			fail("Task ID cannot have more than 10 characters");
		}
	}
	
	@Test
	void testTaskNameTooLong() {
		Task task = new Task("MMaacckkeennzziieeeee","taskDesc");
		if(task.gettaskName().length()>20) {
			fail("Task name has more than 20 characters");
		}
	}
	@Test
	void testTaskDescTooLong() {
		Task task = new Task("taskName", "We need a task description that is more than fifty characters long to throw an exception ");
		if(task.gettaskDesc().length()>50) {
			fail("Task description has more than 50 characters.");
		}
	}
	//test for null values
	@Test
	void testTaskNameNotNull() {
		Task task = new Task(null, "Steps to final project number 1");
		assertNotNull(task.gettaskName(), "Task name cannot be null");
	}
	
	@Test
	void testTaskDescNotNull() {
		Task task = new Task ("taskName", null);
		assertNotNull(task.gettaskDesc(), "Task description cannot be null");
	}
	//test task getters
	@Test
	void testTaskAndGetters(){
		Task task = new Task("Project4", "Steps to final project number 1");
		assertTrue(task.gettaskName().equals("Project4"));
		assertTrue(task.gettaskDesc().equals("Steps to final project number 1"));
	}
	//test setters
	@Test
	void testTaskSetters() {
		Task task = new Task("Project4", "Steps to final project number 1");
		task.settaskName("Project4");
		task.settaskDesc("Steps to final project number 1");
		assertTrue(task.gettaskName().equals("Project4"));
		assertTrue(task.gettaskDesc().equals("Steps to final project number 1"));
	}

}
