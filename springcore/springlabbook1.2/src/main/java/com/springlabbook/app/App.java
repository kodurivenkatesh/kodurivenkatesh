package com.springlabbook.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springlabbook.beans.Employee;
import com.springlabbook.beans.SBU;


public class App {

	public static void main(String args[])
	{
		App app = new App();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee employee = context.getBean(Employee.class);
		app.display(employee);
	}
	public void display(Employee employee)
	{
		SBU businessUnit = employee.getBusinessUnit();
		System.out.println("Employee Id: "+employee.getId());
		System.out.println("Employee Name: "+employee.getName());
		//System.out println("Employee Id: "+employee.getId());
		System.out.println("Employee Salary: "+employee.getSalary());
		//System.out.println("Employee BusinessUnit:"+employee.getBusinessUnit());
		System.out.println("Employee Age:"+employee.getAge());
		System.out.println("SBU Id: "+businessUnit.getSbuId());
		System.out.println("SBU Name: "+businessUnit.getSbuName());
		System.out.println("SBU Head: "+businessUnit.getSbuHead());
		
	}
}
