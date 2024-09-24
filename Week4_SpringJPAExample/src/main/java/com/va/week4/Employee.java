package com.va.week4;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column
	private int empId;
	// pk is empId
	
	@Column(name="empname")
	private String empName;
	

	@Column(name="jobtitle")
	private String jobTitle;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="deptno")
	private int deptNo;
	
	public Employee(int empId, String empName, String jobTitle, double salary, int deptNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	public Employee() {
	
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jobTitle=" + jobTitle + ", salary=" + salary
				+ ", deptNo=" + deptNo + "]";
	}


}
