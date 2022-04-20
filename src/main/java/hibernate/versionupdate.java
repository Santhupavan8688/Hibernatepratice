package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class versionupdate {

	public static void main(String[] args) {
		Session se=hibernateanno.getsession();
		Transaction tx=se.beginTransaction();
	Faculty f=	(Faculty) se.get(Faculty.class, new Integer(222));
	f.setName("rajesh");
	f.setSalary(20000);
	se.save(f);
	tx.commit();
	System.out.println("updated successfully");
	

	}

}
