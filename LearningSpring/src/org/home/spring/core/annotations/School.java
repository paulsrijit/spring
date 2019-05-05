package org.home.spring.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Autowired
	private Student myStudent;

	public Student getMyStudent() {
		return myStudent;
	}

	public void setMyStudent(Student myStudent) {
		this.myStudent = myStudent;
	}

	@Override
	public String toString() {
		return "School [myStudent=" + myStudent.getStudentName() + "]";
	}
	
}
