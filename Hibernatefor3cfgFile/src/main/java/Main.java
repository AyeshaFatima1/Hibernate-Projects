import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate1.Prod;
import com.hibernate1.Supp;

public class Main {

	public static void main(String[] args) {
	
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Prod p=new Prod();
		p.setId(11);
		p.setpName("Kelloggs");
		
		Supp s=new Supp();
		s.setsId(450);
		s.setsName("Sahil");
		p.setS(s);
		
		se.save(p);
		se.save(s);
				
		tx.commit();
		se.close();
		sf.close();
		
	}

}
