package org.sergeyneuymin.spring.rest;

import org.sergeyneuymin.spring.rest.configuration.MyConfig;
import org.sergeyneuymin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        Communication communication = context.getBean("communication", Communication.class);
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1900);
        employee.setId(5);
        communication.saveEmployee(employee);
    }
}
