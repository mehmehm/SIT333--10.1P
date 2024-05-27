package edu.deakin;

import java.util.List;

import org.junit.*;

public class testInbox {

	@Test
	public void testGetTaskInbox()
	{
		taskInbox inbox = new taskInbox();
		List<task> tasklist = inbox.getTaskList();
		for(int i = 0; i < tasklist.size(); i++)
		{
			Assert.assertTrue(tasklist[i].containsKey("taskNumber"));
			Assert.assertTrue(tasklist[i].containsKey("description"));
			Assert.assertTrue(tasklist[i].containsKey("taskType"));
			Assert.assertTrue(tasklist[i].containsKey("status"));
			Assert.assertTrue(tasklist[i].containsKey("time left"));
		}
	}
	
	
}
