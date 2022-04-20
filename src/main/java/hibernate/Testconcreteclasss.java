package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Testconcreteclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session se=hibernateanno.getsession();
		Transaction tx=se.beginTransaction();
		institute i =new institute();
		i.setId(1);
		i.setIname("joctopus");
		facult fa=new facult();
		fa.setExp("2years");
		fa.setFname("giridhar");
		fa.setSalary(20000);
		fa.setId(2);
		
		Student1 s=new Student1();
		s.setCourse("fullstack");
		s.setSname("santhu");
		s.setFee(15000);
		s.setId(3);
		
		se.save(s);
		se.save(fa);
		se.save(i);
		tx.commit();
		}

}
