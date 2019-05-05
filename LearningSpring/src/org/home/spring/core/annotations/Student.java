package org.home.spring.core.annotations;

import org.springframework.stereotype.Component;

@Component(value="myStudent")
public class Student {
	private String studentName;

	public String getStudentName() {
		return "Srijit";
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
