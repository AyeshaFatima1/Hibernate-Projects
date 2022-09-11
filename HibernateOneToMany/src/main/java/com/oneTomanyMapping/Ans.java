package com.oneTomanyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans {
      @Id
      private int id;
      private String solution;
      
      @ManyToOne
      private Que qu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Que getQu() {
		return qu;
	}

	public void setQu(Que qu) {
		this.qu = qu;
	}

	public Ans(int id, String solution, Que qu) {
		super();
		this.id = id;
		this.solution = solution;
		this.qu = qu;
	}

	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ans [id=" + id + ", solution=" + solution + ", qu=" + qu + "]";
	}      
      
}
