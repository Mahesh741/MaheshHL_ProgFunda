package com.gradedproject.q1;

public class TechDepartment extends SuperDepartment {

	public TechDepartment(String departmentName, String todayswork, String deadLine) {
		super(departmentName, todayswork, deadLine);

	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
