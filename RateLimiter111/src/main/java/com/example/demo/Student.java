package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static List<Student> ll=new ArrayList<>();
	
	private int age;
	private String name;
	private String gender;
	public Student(int age, String name, String gender) {
		super();//it is a reference variable which is used to refer immediate parent class object. 
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	}

