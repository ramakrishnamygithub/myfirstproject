package com.app.bean;


public class EmployeeBean {
	private int empId;
	private String empName;
	private double empSal;
	public EmployeeBean() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
		System.out.println("setter method called ");
	}
	public String getEmpName() {
		return empName;
		
	}
	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("setter method called ");
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
		System.out.println("setter method called ");
	}
	

}
