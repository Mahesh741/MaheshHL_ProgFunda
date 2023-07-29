package com.gradedproject.q1;

public class SuperDepartment {

	String departmentName;
	String todayswork;
	String deadLine;

	public SuperDepartment(String departmentName, String todayswork, String deadLine) {
		super();
		this.departmentName = departmentName;
		this.todayswork = todayswork;
		this.deadLine = deadLine;
	}

	public String departmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todayswork;
	}

	public String getWorkDeadline() {
		return deadLine;
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}
