package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String e_Name;
	public double salary;
	public String designation;
	public String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_Name() {
		return e_Name;
	}
	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
}
