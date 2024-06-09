package com.app.entity;

import java.time.LocalDate;
import java.util.Date;

public class Task {
	//taskId, taskName, description, taskDate, status, active.
	private static int counter;
	private int taskid;
	private String name;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	static {
		counter=0;
	}
	
	public Task() {
		super();
	}

	public Task(String name, String description, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskid = ++counter;
		this.name = name;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", name=" + name + ", description=" + description + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}
	
	
	
	
	
	
	
}
