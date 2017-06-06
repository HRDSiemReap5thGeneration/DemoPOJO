package com.example.DemoPOJO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.DemoPOJO.Service.StudentServer;

@Controller
public class StudentController {
	@Autowired
	private StudentServer stuService;
	public void showStudent(){
		stuService.displayStudentList();
	}
}
