package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {

	public HrDepartment(String departmentName, String todayswork, String deadLine) {
		super(departmentName, todayswork, deadLine);

	}

	public String doActivity() {
		return "team Lunch";
	}
}
