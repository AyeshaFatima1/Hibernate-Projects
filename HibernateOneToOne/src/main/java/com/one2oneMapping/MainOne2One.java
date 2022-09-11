package com.one2oneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOne2One {

	public static void main(String[] args) {
		
		SessionFactory fc=new Configuration().configure().buildSessionFactory();
		Session se=fc.openSession();
		Transaction tx=se.beginTransaction();
				
		Que q=new Que();
		q.setId(23);
		q.setQ_name("What is JRE");
		
		Ans a=new Ans();
		a.setA_id(503);
		a.setA_solution("Java Run Environment");
		q.setA_id(a);
		
		//se.update(q);
		//se.update(a);
		se.save(q);
		se.save(a);
		  /*Que q1 = (Que)se.load(Que.class, 23);
	  	  se.delete(q1);
	  	  System.out.println("Deleted Successfully");
	      Ans a1 = (Ans)se.load(Ans.class, 503);
  	      se.delete(a1);
  	      System.out.println("Deleted Successfully");
  	      se.getTransaction().commit();*/
		
		
		tx.commit();
		se.close();
		fc.close();
		
	}

}
