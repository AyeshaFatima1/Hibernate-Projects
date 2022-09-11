package com.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Prod {
     private int id;
     
     private String pName;
     
     private Supp s;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Supp getS() {
		return s;
	}

	public void setS(Supp s) {
		this.s = s;
	}

	}
