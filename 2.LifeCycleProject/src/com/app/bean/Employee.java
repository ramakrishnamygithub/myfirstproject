package com.app.bean;

public class Employee {
	private int empId;
	private String empName;
	public Employee() {
		super();
	}
	private double empSal;
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	public void initMethod()
	{
		System.out.println("this is init method");
	}
	public void destroyMethod()
	{
		System.out.println("this is destroy method");
	}

}
