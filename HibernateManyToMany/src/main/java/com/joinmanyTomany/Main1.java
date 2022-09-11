package com.joinmanyTomany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main1 {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Prjt1 p1=new Prjt1();
		p1.setP_Id(1);
		p1.setP_Title("Banking Application");

		Prjt1 p2=new Prjt1();
		p2.setP_Id(2);
		p2.setP_Title("Online Book store");
		
		Emp1 e1=new Emp1();
		e1.setE_Id(101);
		e1.setE_Name("Ayesha");

		Emp1 e2=new Emp1();
		e2.setE_Id(102);
		e2.setE_Name("Hafsa");
		
	    Set<Emp1>set1=new HashSet<Emp1>();
		Set<Prjt1>set2=new HashSet<Prjt1>();
		set1.add(e1);
		set1.add(e2);
		
		set2.add(p1);
		set2.add(p2);

		e1.setProj(set2);
		p2.setEmp(set1);
        
		ses.save(e1);
		ses.save(e2);
		ses.save(p1);
		ses.save(p2);
		
		tx.commit();
		ses.close();
		sf.close();

	}

}
