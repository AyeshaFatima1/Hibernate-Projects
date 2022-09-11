package com.oneTomanyMapping;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory fc=new Configuration().configure().buildSessionFactory();
		Session se=fc.openSession();
		Transaction tx=se.beginTransaction();
		
		Que q=new Que();
		q.setqName("Features of java");
		
		Ans a=new Ans();
		a.setId(1);
		a.setSolution("Platform Independent");
		a.setQu(q);
		
		Ans a1=new Ans();
		a1.setId(2);
		a1.setSolution("Object Oriented Langauge");
		a1.setQu(q);
		
		Ans a2=new Ans();
		a2.setId(3);
		a2.setSolution("Multithreaded");
		a2.setQu(q);
		
		List<Ans> list=new ArrayList<Ans>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
		q.setAn(list);
		
		se.save(q);
		se.save(a);
		se.save(a1);
		se.save(a2);
		Query query=se.createQuery("from Que");    
	    List<Que> list1=query.list();    
	     
	    Iterator<Que> itr1=list1.iterator();    
	    while(itr1.hasNext()){    
	        Que que=itr1.next();    
	        System.out.println("Que Id"+que.getqId()+"Que Name: "+que.getqName());    
	    }    
	        //printing answers
	     Query query1=se.createQuery("from Ans");     
	     List<Ans> list2=q.getAn();  
	     
	     Iterator<Ans> itr2=list2.iterator();    
	     while(itr2.hasNext()){  
	        Ans ans=itr2.next();  
	        System.out.println("Ans Id: "+ans.getId()+",  Ans solution: "+ans.getSolution());  
	        }
	     /*Query query = se.createQuery("from Que");
	   	  List<Ans>list1=query.list();
	   	  for(Ans ques:list)
	   	  {
	   	  System.out.println("Que Id"+q.getqId()+",Que Name:"+q.getqName());
	   	  }
  	    Query query1 = se.createQuery("from Ans");
  	      List<Ans>list2=query1.list();
  	      for(Ans answer:list)
  	      {
  	      System.out.println("Ans Id: "+answer.getId()+",  Ans solution: "+answer.getSolution()+" ");
  	      }*/
		
		tx.commit();
		se.close();
		fc.close();
		
	}
	}