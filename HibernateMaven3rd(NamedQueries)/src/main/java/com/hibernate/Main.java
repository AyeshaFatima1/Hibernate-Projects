package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sfactory= new Configuration().configure().buildSessionFactory();
		Session ses=sfactory.openSession();
		Transaction tx=ses.beginTransaction();
		
		Employee emp=new Employee();
		emp.setE_Name("Ayesha");
		emp.setSalary(65000.00);
		emp.setDesignation("Software Engineer");
		emp.setCity("Hyderabad");
		
		Employee emp1=new Employee();
		emp1.setE_Name("Sanvi");
		emp1.setSalary(70000.00);
		emp1.setDesignation("Team Leader");
		emp1.setCity("Nizambad");

		Employee emp2=new Employee();
		emp2.setE_Name("Vashnavi");
		emp2.setSalary(75000.00);
		emp2.setDesignation("Project Leader");
		emp2.setCity("Hyderabad");

		Employee emp3=new Employee();
		emp3.setE_Name("Hafsa");
		emp3.setSalary(60000.00);
		emp3.setDesignation("Junior Emgineer");
		emp3.setCity("Hyderabad");

		Employee emp4=new Employee();
		emp4.setE_Name("Neha");
		emp4.setSalary(95000.00);
		emp4.setDesignation("Manager");
		emp4.setCity("Mumbai");
		
		ses.save(emp);
		ses.save(emp1);
		ses.save(emp2);
		ses.save(emp3);
		ses.save(emp4);
		System.out.println("-----------------------------------------------");
		Query query=ses.createQuery("from Employee");
		List<Employee> list=query.list();
		for(Employee e:list) {
			System.out.println("Emp Id:"+e.getId()+"\nEmp Name:"+e.getE_Name()+"\nEmp Salary:"+e.getSalary()+"\n"
					+  "Emp Desg:"+e.getDesignation()+"\nEmp Salary:"+e.getCity()+" ");			
		}
		System.out.println("-----------------------------------------------");
		query=ses.createQuery("update Employee set e_name=:name where id=:id");
		query.setParameter("name", "Shafiya");
        query.setParameter("id", 5);
		int result=query.executeUpdate();
		System.out.println("update record:"+result);
		System.out.println("-----------------------------------------------");
		query=ses.createQuery("delete Employee where id=:id");
		query.setParameter("id", 5);
		int res=query.executeUpdate();
		System.out.println("Delete recorde:"+res);
		System.out.println("-----------------------------------------------");
	    query=ses.createQuery("Select count(*) from Employee");
	    Iterator i=query.iterate();
	    System.out.println("Number of rows:"+i.next());
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery("select max(salary) from Employee");
	    i=query.iterate();
	    System.out.println("Maximum salary:"+i.next());
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery(" from Employee where salary between 60000 and 70000");
	    List<Employee> list1=query.list();
	    for(Employee e1:list1) {
	    System.out.println("Emp Name:"+e1.getE_Name()+" ");
	    }
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery("from Employee order by e_name asc");
	    List<Employee> list2=query.list();
	    for(Employee e2:list2) {
	    System.out.println("Emp Id:"+e2.getId()+"\nEmp Name:"+e2.getE_Name()+"\nEmp Salary:"+e2.getSalary()+"\n"
				+  "Emp Desg:"+e2.getDesignation()+"\nEmp Salary:"+e2.getCity()+" ");			
	    }
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery("from Employee where e_name like 'A%'");
	    List<Employee> list3=query.list();
	    for(Employee e2:list3) {
	    System.out.println("Emp Id:"+e2.getId()+"\nEmp Name:"+e2.getE_Name()+"\nEmp Salary:"+e2.getSalary()+"\n"
				+  "Emp Desg:"+e2.getDesignation()+"\nEmp Salary:"+e2.getCity()+" ");			
	    }
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery("from Employee where e_name like '_a%'");
	    List<Employee> list4=query.list();
	    for(Employee e2:list4) {
	    System.out.println("Emp Id:"+e2.getId()+"\nEmp Name:"+e2.getE_Name()+"\nEmp Salary:"+e2.getSalary()+"\n"
				+  "Emp Desg:"+e2.getDesignation()+"\nEmp Salary:"+e2.getCity()+" ");			
	    }
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery("select count(*) from Employee group by city ");
	    i=query.iterate();
	    System.out.println("Number of employees:"+i.next());
	    System.out.println("Number of employees:"+i.next());
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery("select count(city) from Employee where city='Hyderabad' group by city ");
	    i=query.iterate();
	    System.out.println("Number of employees:"+i.next());
	    System.out.println("-----------------------------------------------");
	    query=ses.createQuery("from Employee group by id Having city='Hyderabad' ");
	    List<Employee> list5=query.list();
	    for(Employee e2:list5) {
	    System.out.println("Emp Name:"+e2.getE_Name()+"\nEmp Salary:"+e2.getSalary()+" ");
	    }
	    System.out.println("-----------------------------------------------");
	   //query=ses.createQuery("from Employee group by id having salary=60000 ");
	    query=ses.createQuery("from Employee where salary=60000 group by id ");
	    List<Employee> list6=query.list();
	    for(Employee e2:list6) {
	    System.out.println("Emp Id:"+e2.getId()+"\nEmp Name:"+e2.getE_Name()+"\nEmp Salary:"+e2.getSalary()+"\n"
				+  "Emp Desg:"+e2.getDesignation()+"\nEmp Salary:"+e2.getCity()+" ");			
	    }
		tx.commit();
		ses.close();
		sfactory.close();	
	}
}
