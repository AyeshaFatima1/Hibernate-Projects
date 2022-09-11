package com.hibernate.namedqueries;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="findEmployee1ByName",query="from Employee1 e where e.e_Name=:Empname"),
    @NamedQuery(name="findEmployee1ByCity",query="from Employee1 e where e.city=:Empcity")})
@Entity
@Table(name="Employee1")
//public class Employee1 implements java.io.Serializable{
public class Employee1 {
	@Id
	public int id;
	public String e_Name;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", e_Name=" + e_Name + ", city=" + city + "]";
	}
}
