package hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetching {

	public static void main(String[] args) {
		Configuration cnf = new Configuration();
		cnf.configure("hibernate.cng.xml");
		SessionFactory sf =cnf.buildSessionFactory();
		Session s = sf.openSession();
		List li=s.createCriteria(student.class).list();
	Iterator<student>it=li.iterator();
	while(it.hasNext()) {
		student st =(student)it.next();
		System.out.println("student id: "+st.getId()+" student firstname: "+st.getFname()
		+ " student lastname: "+st.getLname()+" student course: "+st.getCourse());
		System.out.println("-------------------------------------------------");
	}

	}

}
