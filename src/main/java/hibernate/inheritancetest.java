package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class inheritancetest {

	public static void main(String[] args) {
		Session se=hibernateanno.getsession();
		Transaction tx=se.beginTransaction();
		Employee1 emp=new Employee1();
		emp.setName("ramu");
		pemployee pe=new pemployee();
		pe.setName("venky");
		pe.setBonus(1000);
		pe.setLeaves(24);
		cemployee ce=new cemployee();
		ce.setName("ravi");
		ce.setSalary(25000);
		ce.setCperiod("2 years");
		se.save(emp);
		se.save(ce);
		se.save(pe);
		tx.commit();
		System.out.println("records insert successfully");

	}

}
