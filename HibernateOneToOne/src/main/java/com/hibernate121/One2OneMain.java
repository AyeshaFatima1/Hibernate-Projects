package com.hibernate121;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2OneMain {

	public static void main(String[] args) {
		SessionFactory fc=new Configuration().configure().buildSessionFactory();
		Session s=fc.openSession();
		Transaction tx=s.beginTransaction();
		
		Product p=new Product();
		p.setPid(1);
		p.setPname("Horlicks");
		p.setPrice(850);
		
		Product p1=new Product();
		p1.setPid(2);
		p1.setPname("Boost");
		p1.setPrice(750);

		Product p2=new Product();
		p2.setPid(3);
		p2.setPname("Pediasure");
		p2.setPrice(950);

		
		Supplier su=new Supplier();
		su.setSid(1597);
		su.setSname("Rahul");
		su.setAddress("Hyderabad");
		su.setPh_No(963054684);
		p.setSid(su);
		
		Supplier su1=new Supplier();
		su1.setSid(2397);
		su1.setSname("Suresh");
		su1.setAddress("Delhi");
		su1.setPh_No(989344684);
		p1.setSid(su1);
		
		Supplier su2=new Supplier();
		su2.setSid(7834);
		su2.setSname("Saman");
		su2.setAddress("Mumbai");
		su2.setPh_No(963054684);
		p2.setSid(su2);
		
	    s.save(p);
	    s.save(p1);
		s.save(p2);
		
		s.save(su);
		s.save(su1);
		s.save(su2);
		
		tx.commit();
		s.close();
		fc.close();
	}

}
