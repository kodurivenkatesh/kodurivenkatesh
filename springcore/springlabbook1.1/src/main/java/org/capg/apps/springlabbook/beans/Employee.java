package org.capg.apps.springlabbook.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${employeeID}")
	private int id;
	@Value("${employeeName}")
	private String name;
	@Value("${employeeSalary}")
	private double salary;
	@Value("${employeeBu}")
	private String businessUnit;
	@Value("${employeeAge}")
	private int age;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, double salary, String businessUnit, int age)
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

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}