package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
 public static Session getsession() {
	 Configuration cnf =new Configuration();
	 cnf.configure("hibernate.cng.xml");
	 SessionFactory sf = cnf.buildSessionFactory();
	 Session s =sf.openSession();
	 return s;
	 
		
	}

}
