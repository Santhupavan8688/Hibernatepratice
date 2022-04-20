package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class versionex {

	public static void main(String[] args) {
		Session se=hibernateanno.getsession();
		Transaction tx=se.beginTransaction();
		Faculty f = new Faculty();
		f.setId(222);
		f.setName("pavan");
		f.setCourse("Autodesk maya");
		f.setSalary(150000);
		se.save(f);
		tx.commit();
		System.out.println("successfully created");

	}

}
