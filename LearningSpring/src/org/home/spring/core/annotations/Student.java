package org.home.spring.core.annotations;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
