package edu.deakin;

import java.util.List;

import org.junit.*;

public class testInbox {

	@Test
	public void testGetTaskInbox()
	{
		 taskInbox inbox = new taskInbox();
	        List<task> tasklist = inbox.getTaskList();
	        for(task currentTask : tasklist) {
	            Assert.assertNotNull(currentTask.getTaskNumber());
	            Assert.assertNotNull(currentTask.getDescription());
	            Assert.assertNotNull(currentTask.getTaskType());
	            Assert.assertNotNull(currentTask.getStatus());
	            Assert.assertNotNull(currentTask.getTimeLeft());
	        }
	}
	
	
}
