package com.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Supp {

	private int sId;
	
	private String sName;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

		
}
