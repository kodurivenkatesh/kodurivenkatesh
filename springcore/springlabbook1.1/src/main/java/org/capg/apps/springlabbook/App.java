package org.capg.apps.springlabbook;

import org.capg.apps.springlabbook.beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


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
		System.out.println(employee.getName()+"-"+employee.getId()+"-"+employee.getSalary()+"-"+employee.getBusinessUnit()+"-"+employee.getAge());
	}
}