package edu.deakin;

import java.util.ArrayList;
import java.util.List;

public class taskInbox {
	
	public List<task> getTaskList(){
		
		List<task> taskList = new ArrayList<>();
		
		task task1 = new task("P1", "intro to coding", "pass", "completed", "-");
		task task2 = new task("P2", "hello world", "pass", "completed", "-");
		task task3 = new task("C1", "if-else statement", "credit", "discuss", "2 weeks");
		task task4 = new task("D1", "algorithms", "distinction", "resubmit", "3 weeks");
		
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		
		return taskList;
	}
 }
