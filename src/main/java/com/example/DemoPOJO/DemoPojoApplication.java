package com.example.DemoPOJO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.DemoPOJO.controller.StudentController;

@SpringBootApplication
public class DemoPojoApplication {

	public static void main(String[] args) {
		StudentController c= SpringApplication.run(DemoPojoApplication.class, args).getBean("studentController",StudentController.class);
		c.showStudent();
	}
}
