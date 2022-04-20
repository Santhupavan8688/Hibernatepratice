package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class hibernateanno {
public static Session getsession() {
	AnnotationConfiguration cng =new AnnotationConfiguration();
	cng.configure("hibernate.cng.xml");
	SessionFactory sf=cng.buildSessionFactory();
	Session se =sf.openSession();
	return se;
	
}
}
