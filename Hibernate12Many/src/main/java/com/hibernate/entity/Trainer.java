package com.hibernate.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int t_Id;
	private String t_Name;
	private String t_Subject;
	
	@OneToMany(mappedBy="trainer")
	private List<Learner> learner;

	public int getT_Id() {
		return t_Id;
	}

	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}

	public String getT_Name() {
		return t_Name;
	}

	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}

	public String getT_Subject() {
		return t_Subject;
	}

	public void setT_Subject(String t_Subject) {
		this.t_Subject = t_Subject;
	}

	public List<Learner> getLearner() {
		return learner;
	}

	public void setLearner(List<Learner> learner) {
		this.learner = learner;
	}

		
}
