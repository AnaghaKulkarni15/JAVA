package com.app.validation;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;

import com.app.entity.Status;
import com.app.entity.Task;
import com.app.exception.customException;

public class ValidationRule {

	public static Task addTask(String taskName, String description, LocalDate taskDate, Status status, boolean active)
			throws customException {
		return new Task(taskName, description, taskDate, status, active);

	}
	
	public static void deleteTask(int id,Map<Integer, Task> taskmap) throws customException{
		taskmap.values()
		.stream()
		.filter(map -> map.getTaskid()==id)
		.findFirst()
		.map(entry -> {taskmap.remove(entry.getTaskid());return entry;})
		.orElseThrow(()-> new customException("Invalid Id!!!"));	
	}
	
	public static Task updatetask(int id,Status status, Map<Integer, Task> taskmap) throws customException {
		 Task task =taskmap.values()
		.stream()
		.filter(map -> map.getTaskid()==id)
		.findFirst()
		.orElseThrow(()->new customException("given id is invalid"));
		task.setStatus(status);
		return task;
	}
	
	public static void displayPendingTask(Map<Integer, Task> taskmap)throws customException{
		boolean ispendingTask=taskmap.values()
				.stream()
				.filter(map->map.getStatus()==map.getStatus().PENDING)
				.peek(map->System.out.println(map))
				.count()>0;
				if(!ispendingTask) {
					System.out.println("no task with PENDING status found");
				}
	}
	
	public static void displayPendingTasksToday(Map<Integer, Task> taskmap)throws customException{
		boolean isPendingTaskToday=taskmap.values()
				.stream()
				.filter(map-> map.getStatus()==map.getStatus().PENDING&&map.getTaskDate().equals(LocalDate.now()))
				.peek(map->System.out.println(map))
				.count()>0;
				if(!isPendingTaskToday) {
					System.out.println("no pending task today");
				}
	}
	
	public static void displayTasksSortedByTaskDate(Map<Integer,Task> taskmap) {
		if(taskmap.isEmpty()) {
			System.out.println("task is empty");
		}
		Comparator<Task> taskDateComparetor =Comparator.comparing(Task::getTaskDate);
		taskmap.values()
		.stream()
		.sorted(taskDateComparetor)
		.forEach(map->System.out.println(map));
	}
	
	
	

}
