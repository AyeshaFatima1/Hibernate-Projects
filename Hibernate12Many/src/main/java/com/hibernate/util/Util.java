package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Util {
	private Util() {
		
	}
   private static SessionFactory sessionFactory;
   
   public static synchronized SessionFactory getInstance() {
	   if(sessionFactory==null) {
		   Configuration con=new Configuration().configure("hibernate.cfg.xml");
		   StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder()
			.applySettings(con.getProperties());
		   con.buildSessionFactory(builder.build()); 
	   }
	  return sessionFactory; 
   }
   
}
