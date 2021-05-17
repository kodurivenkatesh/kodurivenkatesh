package com.springlabbook.beans;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;

@Component
public class Employee {
	
	@Value("${id}")
	private int id;
	@Value("${name}")
	private String name;
	@Value("${salary}")
	private double salary;
	
	@Value("${age}")
	private int age;
	
	private SBU businessUnit;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, double salary, SBU businessUnit, int age)
	{
		this.name = name;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}

	@Autowired
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	

	
}
