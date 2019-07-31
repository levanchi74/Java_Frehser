package practice;

import java.text.SimpleDateFormat;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private int year;
	private double salary;
	private String address;
	
	public Employee(String name,int year,double salary,String address) {
		this.name = name;
		this.year = year;
		this.salary = salary;
		this.address = address;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Employee {");
		sb.append(" name =" +	this.name);
		sb.append(" year =" +	this.year);
		sb.append(" salary =" +	this.salary);
		sb.append(" address ="+ this.salary);
		sb.append("}");
		return sb.toString();		
	} 
	
	@Override
	public int compareTo(Employee e) {
		return this.getName().compareTo(e.getName());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
