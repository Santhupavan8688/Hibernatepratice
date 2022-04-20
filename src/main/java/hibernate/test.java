package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		Configuration cnf = new Configuration();
		cnf.configure("hibernate.cng.xml");
		SessionFactory sf=cnf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		student st =new student();
		st.setFname("abc");
		st.setLname("xyz");
		st.setCourse("python");
		st.setId(111);
		sess.save(st);
		tx.commit();
		
		System.out.println("saved records sucessfully");
	}

}
