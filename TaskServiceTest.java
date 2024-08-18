package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import task.Task;
import task.TaskService;

class TaskServiceTest {

	@Test
	void testTaskNameUpdate() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task Name", "Task Description");
		taskService.updateTaskName("taskName", "3");
		taskService.displaytaskList();
		assertEquals("taskName", taskService.getTask("3").gettaskName(), "Task name could not be updated.");
}
 
	@Test
	void testTaskDescUpdate() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task Name", "Task Description");
		taskService.updateTaskDesc("taskDesc", "1");
		taskService.displaytaskList();
		assertEquals("taskDesc", taskService.getTask("1").gettaskDesc(), "Task description could not be updated.");
	}
	
	@Test 
	void testDeleteTask() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task name", "Task Description");
		taskService.deleteTask("4");
		ArrayList<Task>taskListEmpty = new ArrayList<Task>();
		taskService.displaytaskList();
		assertEquals(taskService.taskList, taskListEmpty, "The task was not deleted.");
		
	}
	@Test
	void testAddTask() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task Name", "Task Description");
		taskService.displaytaskList();
		assertNotNull(taskService.getTask("0"), "Task was not added");
	}
}


