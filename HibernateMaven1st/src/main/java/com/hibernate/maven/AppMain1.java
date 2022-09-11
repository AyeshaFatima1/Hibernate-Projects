package com.hibernate.maven;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AppMain1 {
	
	/*public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	Item item1=new Item();
    	item1.setItem_id(1);
    	item1.setItem_desc("pencil");
    	item1.setItem_price(10);
    	
    	Item item2=new Item();
    	item2.setItem_id(2);
    	item2.setItem_desc("scale");
    	item2.setItem_price(20);
    	
    	List<Item> l1=new ArrayList<Item>();
    	l1.add(item1);
    	l1.add(item2);
    	
    	Cart cart1= new Cart();
    	cart1.setCart_id(101);
    	cart1.setCart_total(100);
    	
    	
    	Cart cart2= new Cart();
    	cart1.setCart_id(102);
    	cart1.setCart_total(80);
    	
    	List<Cart> l2=new ArrayList<Cart>();
    	l2.add(cart1);
    	l2.add(cart2);
    	cart1.setItem(l1);
    	item1.setCart(l2);
    	
    	
    Transaction tx=ses.beginTransaction();
    	ses.save(cart1);
    	ses.save(cart2);
    	ses.save(item1);
    	ses.save(item2);
    	
    	tx.commit();
    	ses.close();
    	factory.close();
    }*/
	public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	 Transaction tx=ses.beginTransaction();
    	  
       Customer item1=new Customer();
    	item1.setC_id(22);
    	item1.setC_name("Neha");
    	
    	Customer item2=new Customer();
    	item2.setC_id(25);
    	item2.setC_name("vashnavi");
    	
    	List<Customer> l1=new ArrayList<Customer>();
    	l1.add(item1);
    	l1.add(item2);
    	
        ses.save(item1);
    	ses.save(item2);
    	
    	//ses.delete(item1);
    	//ses.update(item1);
    	//ses.merge(item1);
    	  
    	/*Customer c = (Customer)ses.get(Customer.class, 2);
    	  c.setC_name("Sweety");
    	  System.out.println("Updated Successfully");
    	  ses.getTransaction().commit();*/
    	  
    	/*Customer c = (Customer)ses.load(Customer.class, 22);
    	  ses.delete(c);
    	  System.out.println("Deleted Successfully");
    	  ses.getTransaction().commit();*/
    	  
    	 /*List<Customer> l1=new ArrayList<Customer>();
    	  Customer c =(Customer)ses.createQuery("Select from customer");
    	  Iterator ite=((Query) c).list().iterator();
    	  while(ite.hasNext()) {
    		  System.out.println("c_id"+ite.hasNext());
    		  System.out.println("C_name"+ite.hasNext());
    		  ite.next();
    	  }
    	  System.out.println("Selected Successfully");
    	  ses.getTransaction().commit();*/

    	 // ses.beginTransaction();
    	  
    	 /* Query query = ses.createQuery("from Customer");
    	  List<Customer> customers = query.list();
    	  for(Customer cus: customers)
    	  {
    	System.out.println("customer Id: "+cus.getC_id()+", customer Name: "+cus.getC_name()+" ");
    	  }
    	  ses.getTransaction().commit();*/
    	 
    	 /* Query query = ses.createQuery("from Customer where C_id=21");
       	  List<Customer> customers = query.list();
    	  for(Customer cus: customers)
    	  {
    	System.out.println("customer Id: "+cus.getC_id()+", customer Name: "+cus.getC_name()+" ");
    	  }
    	  ses.getTransaction().commit();*/
    	tx.commit();
    	ses.close();
    	factory.close();
    }
}