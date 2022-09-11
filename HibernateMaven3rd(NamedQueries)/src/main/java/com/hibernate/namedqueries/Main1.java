package com.hibernate.namedqueries;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import com.hibernate.namedqueries.Employee1;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		/*Employee1 emp=new Employee1();
		emp.setId(1);
		emp.setE_Name("Ayesha");
		emp.setCity("Hyderabad");
		
		Employee1 emp1=new Employee1();
		emp1.setId(2);
		emp1.setE_Name("Hafsa");
		emp1.setCity("Mumbai");
		
		Employee1 emp2=new Employee1();
		emp2.setId(3);
		emp2.setE_Name("Saba");
		emp2.setCity("Hyderabad");
		
		ses.save(emp);
		ses.save(emp1);
		ses.save(emp2);*/
		
		/*Query query=ses.getNamedQuery("findEmployee1ByID");
		query.setInteger("ID", 2);
		List<Employee1> list=query.list();
		for(int i=0; i<list.size(); i++) {
			System.out.println("Name:"+list.get(i).getE_Name());
		}
		System.out.println(">>>>>"+list.size());
		if(!list.isEmpty()) {
		Employee1 e=(Employee1) list.get(0);
		System.out.println(e);
		}*/
	
	    Query query=ses.getNamedQuery("findEmployee1ByName");
		query.setParameter("Empname", "Hafsa");
		List<Employee1> list=query.list();
		for(Employee1 emp:list) {
			System.out.println(emp);
		}

	    query=ses.getNamedQuery("findEmployee1ByCity");
		query.setParameter("Empcity", "Hyderabad");
		List<Employee1> list1=query.list();
		for(Employee1 emp:list1) {
			System.out.println(emp);
		}
		// tx.commit();
		 //ses.close();
		 //sf.close();		

	}
}