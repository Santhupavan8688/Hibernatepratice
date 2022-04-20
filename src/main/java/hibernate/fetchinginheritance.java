package hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class fetchinginheritance {

	public static void main(String[] args) {
		Session se = hibernateanno.getsession();
		Transaction tx=se.beginTransaction();
		List li=se.createCriteria(Faculty.class).list();
		Iterator<Faculty>itr=li.iterator();
		while(itr.hasNext()) {
			Faculty f=itr.next();
			System.out.println(f.getId()+" "+f.getCourse()+" "+f.getName()+" "+f.getSalary());
		}
	}

}
