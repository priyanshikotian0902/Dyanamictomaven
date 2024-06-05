package com.javatpoint;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

public class Employee {

	@NotEmpty(message="First name cannot be null and should be greater than 0")
	private String name;

	@Size(min=1, message="Required password")
	private String password;

	@Min(value=18, message="Age must be greater than or equal to 18")
	@Max(value=25, message="Age must be less than or equal to 25")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
