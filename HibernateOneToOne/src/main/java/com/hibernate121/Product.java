package com.hibernate121;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	private int Pid;
	
	private String Pname;
	
	private float price;

	@OneToOne
	@JoinColumn(name="Sid")
	private Supplier Sid;

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Supplier getSid() {
		return Sid;
	}

	public void setSid(Supplier sid) {
		Sid = sid;
	}

	
}
