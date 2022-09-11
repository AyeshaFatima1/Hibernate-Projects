package com.hibernate.main;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Learner;
import com.hibernate.entity.Trainer;

public class AppMain {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		/*Trainer t=new Trainer();
		t.setT_Name("Sneha");
		t.setT_Subject("Core Java");
		
		Learner l=new Learner();
		l.setL_Id(1);
		l.setL_Name("Ayesha");
		l.setL_Course("JFS");
		l.setTrainer(t);
		
		Learner l1=new Learner();
		l1.setL_Id(2);
		l1.setL_Name("Vashnavi");
		l1.setL_Course("JFS");
		l1.setTrainer(t);
		
		Learner l2=new Learner();
		l2.setL_Id(3);
		l2.setL_Name("Sanvi");
		l2.setL_Course("JFS");
		l2.setTrainer(t);
		
		Learner l3=new Learner();
		l3.setL_Id(4);
		l3.setL_Name("Hafsa");
		l3.setL_Course("C++");
		l3.setTrainer(t);
		
		ses.save(t);
		ses.save(l);	 
		ses.save(l1);
		ses.save(l2);
		ses.save(l3);*/
		
		
		Query query = ses.createQuery("from Learner");
	   	 List<Learner>list1=query.list();
	   	  for(Learner lear:list1)
	   	  {
	   	  System.out.println("lear Id:"+lear.getL_Id()+",lear Name:"+lear.getL_Name()+",lear course:"+lear.getL_Course());
	   	  }
	   	Query query1 = ses.createQuery("select count(*) from Learner");
	   	 Iterator count = query1.iterate();
	   	  System.out.println("No. of rows : "+count.next());

	    Query query2 = ses.createQuery("select count(l_name) from Learner where l_course='C++'");
	   	 Iterator count1 = query2.iterate();
	   	  System.out.println("No. of rows : "+count1.next());
	   	  
	   	Query query3 = ses.createQuery("select distinct count(distinct l_course) from Learner");
	   	 Iterator count2 = query3.iterate();
	   	  System.out.println("No. of rows : "+count2.next());
	   	  
	    Query query4 = ses.createQuery("select min(l_Id) from Learner");
	   	 Iterator count3 = query4.iterate();
	   	  System.out.println("Minnimum id : "+count3.next());

	   	Query query5= ses.createQuery("select max(l_Id) from Learner");
	   	 Iterator count4 = query5.iterate();
	   	  System.out.println("Maximum id : "+count4.next());

	   	Query query6= ses.createQuery("select sum(l_Id) from Learner");
	   	 Iterator count5 = query6.iterate();
	   	  System.out.println("sum of id : "+count5.next());
	   	  
	   	Query query7= ses.createQuery("select avg(l_Id) from Learner");
	   	 Iterator count6 = query7.iterate();
	   	  System.out.println("Avg id : "+count6.next());

	    Query query8= ses.createQuery("from Learner");
	   	query8.setFirstResult(3);
	  	query8.setMaxResults(2);
	  	List<Learner> l=query8.list();
	  	for(Learner lear:l)
	   	 {
	   	 System.out.println("learner Id:"+lear.getL_Id()+",learner Name:"+lear.getL_Name()+",learner course:"+lear.getL_Course());
	   	 }
	   	
	  	Query query9= ses.createQuery("update Learner set L_Name= :name where L_Id=:id");
	  	query9.setParameter("name", "Pavani");
        query9.setLong("id", 4);
        int result=query9.executeUpdate();
        System.out.println("Leraner update status"+result);
	  	
        Query query10= ses.createQuery("delete Learner where L_Id=:id");
        query10.setLong("id", 4);
        int result1=query10.executeUpdate();
        System.out.println("Leraner delete status"+result1);

        Query query11 = ses.createQuery("from Learner order by l_Name asc");
	   	 List<Learner>list2=query11.list();
	   	  for(Learner lear:list2)
	   	  {
	   	  System.out.println("learner Id:"+lear.getL_Id()+",learner Name:"+lear.getL_Name()+",learner course:"+lear.getL_Course());
		  } 

	   	query=ses.createQuery("from Learner where id=1");
		Learner ln=(Learner) query.uniqueResult();
	    System.out.println("learner Id:"+ln.getL_Id()+",learner Name:"+ln.getL_Name()+",learner course:"+ln.getL_Course());
	    

	   /* Query query12 = ses.createQuery("from Learner");
	    Iterator itr=query12.iterate();
	   	while(itr.hasNext()) {
	    System.out.println("lear Id:"+ln.getL_Id()+",lear Name:"+ln.getL_Name()+"lear course:"+ln.getL_Course());
	   	System.out.println(itr.next()); 
	   	}*/
	   	
	   	tx.commit();
		//ses.getTransaction().commit();
		ses.close();
		sf.close();
	
	}
	

}
