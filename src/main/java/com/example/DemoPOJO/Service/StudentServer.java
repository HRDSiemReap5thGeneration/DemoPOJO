package com.example.DemoPOJO.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.DemoPOJO.Model.StudentModel;
import com.example.DemoPOJO.Repo.StudentsRepo;

@Service
public class StudentServer {
	@Autowired
	private StudentsRepo students;
	public void displayStudentList(){
		List<StudentModel> list=students.getAllStudents();
		list.forEach(stu-> System.out.println(stu.getName()));
	}
}
