package com.va.week4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week4SpringJpaExampleApplication implements CommandLineRunner {

	/*
	 * Add the autowired dependency.. for the Database objects to be invoked
	 * remotely.. via dependency injection..
	 */

	@Autowired
	private EmployeeRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Week4SpringJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// call ur repo/jpa methods via object.

		repo.save(new Employee(10000, "Mr Tom", "Sr. Software Developer..", 100000.00, 2));
		// adding data.. running insert into table.. qury. 

		// retrieve all the employees from employee table
		Iterable<Employee> iterator = repo.findAll();
		// running select .... from table. where ..id ..

		System.out.println("All the Employees: ");
		iterator.forEach(item -> System.out.println(item));

		// count how many employees in the employee table
		System.out.println("# of employees:" + repo.count());

		// Deleting an exiting employee
		System.out.println("Deleting employee with id 12");
		// repository.deleteById(12);

		System.out.println("# of employees:" + repo.count());

		// searching an employee using either findById or existsById methods
		System.out.println("ID exits : " + repo.existsById(12));
		System.out.println("ID exits : " + repo.findById(12));

	}

}
