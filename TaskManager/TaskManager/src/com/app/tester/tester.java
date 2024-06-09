package com.app.tester;

import static com.app.validation.ValidationRule.*;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Status;
import com.app.entity.Task;
import com.app.exception.customException;

//a. Add New Task                       
//b. Delete a task                         
//c. Update task status               
//d. Display all pending tasks     
//e. Display all pending tasks for today           
//f. Display all tasks sorted by taskDate 

//fields like taskId, taskName, description, taskDate, status, active    

public class tester {

	public static void main(String[] args) throws customException {
		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;
			Map<Integer,Task> taskmap=new HashMap<Integer, Task>();
			taskmap.put(1, new Task("Task1","Description 1",LocalDate.now(),Status.PENDING,true));
			taskmap.put(2, new Task("Task2","Description 2",LocalDate.now(),Status.COMPLETED,true));
			taskmap.put(3, new Task("Task3","Description 3",LocalDate.parse("2024-01-01"),Status.PROGRESS,true));
			taskmap.put(4, new Task("Task4","Description 4",LocalDate.parse("2020-03-04"),Status.PENDING,true));
			while (!exit) {
				System.out.println("0.exit\n1.add new task\n2.display\n3.Delete task\n4.Update Status\n5.Display all pending tasks\n6.displayPendingTasksToday\n7.displayTasksSortedByTaskDate");
				System.out.print("Choose: ");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;
					case 1:
						System.out.println("Enter taskName description taskDate (yyyy-mm-dd): status (e.g., completed): active (true/false):");
						Task task =addTask(sc.next(), sc.next(), LocalDate.parse(sc.next()), Status.valueOf(sc.next().toUpperCase()),sc.nextBoolean());
						taskmap.put(task.getTaskid(), task);
						System.out.println("Nw Task added successfully");
						break;
					case 2:
						System.out.println("Displaying tasks:");
						boolean isTask = taskmap.values()
						.stream()
						.peek(entry -> System.out.println(entry))
						.count() > 0;
						if(isTask) {
							taskmap.forEach((k,v) -> System.out.println(v));
						}
						else
							System.out.println("Map is empty");
						break;
						
					case 3:
						System.out.println("Enter task id");
						deleteTask(sc.nextInt(),taskmap);
						System.out.println("task deleted successfully");
						break;
					case 4:
						System.out.println("enter id and status");
						updatetask(sc.nextInt(),Status.valueOf(sc.next().toUpperCase()), taskmap);
						System.out.println("update successful");
					case 5:
						displayPendingTask(taskmap);
						break;
					case 6:
						displayPendingTasksToday(taskmap); 
						break;
					case 7:
						displayTasksSortedByTaskDate(taskmap);
						break;	
					}
				}catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}
		}
	}

	
}

