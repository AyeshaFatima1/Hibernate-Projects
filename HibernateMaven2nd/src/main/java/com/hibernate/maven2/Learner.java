package com.hibernate.maven2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Learner")
public class Learner {
	
@Id
@Column(name="L_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int lid;

@Column(name="l_name",length=128,nullable=false)
private String lname;

@Column(name="l_course")
private String lcourse;

public int getLid() {
	return lid;
}

public void setLid(int lid) {
	this.lid = lid;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getLcourse() {
	return lcourse;
}

public void setLcourse(String lcourse) {
	this.lcourse = lcourse;
}


}
