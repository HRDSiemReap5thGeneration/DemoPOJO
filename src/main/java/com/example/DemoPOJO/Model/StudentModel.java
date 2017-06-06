package com.example.DemoPOJO.Model;

public class StudentModel {

	private int id;
	private String name;
	public StudentModel( int id, String name){
		this.id=id;
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Id="+this.id+"\tName:"+this.name;
//	}
}
