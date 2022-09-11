package com.one2oneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Que {
	@Id
	private int id;
	private String Q_name;
	
	@OneToOne
	@JoinColumn(name="A_id")
	private Ans A_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQ_name() {
		return Q_name;
	}

	public void setQ_name(String q_name) {
		Q_name = q_name;
	}

	public Ans getA_id() {
		return A_id;
	}

	public void setA_id(Ans a_id) {
		A_id = a_id;
	}
	
	
	
}
