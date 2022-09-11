package com.oneTomanyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Que {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qId;
	private String qName;
	
	@OneToMany(mappedBy = "qu")
	private List<Ans> an;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public List<Ans> getAn() {
		return an;
	}

	public void setAn(List<Ans> an) {
		this.an = an;
	}

	public Que(int qId, String qName, List<Ans> an) {
		super();
		this.qId = qId;
		this.qName = qName;
		this.an = an;
	}

	public Que() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Que [qId=" + qId + ", qName=" + qName + ", an=" + an + "]";
	}	

}
