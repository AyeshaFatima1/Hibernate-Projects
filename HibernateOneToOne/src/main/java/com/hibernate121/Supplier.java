package com.hibernate121;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {

	@Id
	private int Sid;
	@Column(name="Sname",length=10,unique=true,nullable=false)
	private String Sname;
	
	private String address;
	
	private int Ph_No;

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPh_No() {
		return Ph_No;
	}

	public void setPh_No(int ph_No) {
		Ph_No = ph_No;
	}
	
}
