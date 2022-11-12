package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentBusiness {
	public List<Student> getStudentList(){
		List<Student> listStudent = new ArrayList<>();
			
		listStudent.add(new Student("611100","Marry John"));
		listStudent.add(new Student("611102","Ja John"));
		listStudent.add(new Student("611103","Bob Matin"));
			
		return listStudent;
	}
}
