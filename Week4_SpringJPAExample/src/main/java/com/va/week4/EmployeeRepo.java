package com.va.week4;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Creating this for extending the JPA methods.. from the Library/framework!. 
 * 
 */

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
