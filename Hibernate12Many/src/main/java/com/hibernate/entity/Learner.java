package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Learner {

	@Id
	private int l_Id;
	private String l_Name;
	private String l_Course;
	@ManyToOne
	private Trainer trainer;
	public int getL_Id() {
		return l_Id;
	}
	public void setL_Id(int l_Id) {
		this.l_Id = l_Id;
	}
	public String getL_Name() {
		return l_Name;
	}
	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}
	public String getL_Course() {
		return l_Course;
	}
	public void setL_Course(String l_Course) {
		this.l_Course = l_Course;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
}
