package com.hibernate.maven2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain2 {

	public static void main(String[] args) {
		
			SessionFactory factory =new Configuration().configure().buildSessionFactory();
			Session ses=factory.openSession();
			Transaction tr=ses.beginTransaction();
			
			Learner l=new Learner();
			
			l.setLname("Vashnavi");
			l.setLcourse("JFS");
			
			ses.save(l);
			tr.commit();
			
			ses.close();
			factory.close();
			
	}

}
