package com.many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Project p1=new Project();
		p1.setP_Id(1);
		p1.setP_Name("Banking Application");
		
		Project p2=new Project();
		p2.setP_Id(2);
		p2.setP_Name("ATM Interface");
		
		Employee e1=new Employee();
		e1.setId(121);
		e1.setE_Name("Ayesha");
        
		Employee e2=new Employee();
		e2.setId(122);
		e2.setE_Name("Sanvi");
		
		List<Employee>list1	=new ArrayList<Employee>();
		List<Project>list2	=new ArrayList<Project>();

		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		//p1.setEmp(list1);
		e1.setProject(list2);
		p2.setEmp(list1);
		//e2.setProject(list2);
		
		ses.save(e1);
		ses.save(e2);
		ses.save(p1);
		ses.save(p2);
		
		tx.commit();
		ses.close();
		sf.close();

	}

}
