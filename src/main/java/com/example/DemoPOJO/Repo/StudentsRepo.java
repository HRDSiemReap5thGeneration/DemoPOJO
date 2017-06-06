package com.example.DemoPOJO.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DemoPOJO.Model.StudentModel;

@Repository
public class StudentsRepo {
	public List<StudentModel> getAllStudents(){
		StudentModel s1=new StudentModel(1, "L'bong" );
		StudentModel s2=new StudentModel(2, "Ly boung");
		List<StudentModel> arr=new ArrayList();
		arr.add(s1);
		arr.add(s2);
		return arr;		
	}
}
