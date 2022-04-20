package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Annotationex {

	public static void main(String[] args) {
		Session se =hibernateanno.getsession();
		Transaction tx=se.beginTransaction();
		Employee e = new Employee();
		e.setId(1);
		e.setName("songoku");
		e.setSalary(150000);
		e.setDepartment("java developer");
		se.save(e);
		tx.commit();
		System.out.println("successfully inserted");
	}

}
