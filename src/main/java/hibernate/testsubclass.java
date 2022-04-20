package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class testsubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session se=hibernateanno.getsession();
		Transaction tx=se.beginTransaction();
		Bank b=new Bank();
		b.setId(1);
		b.setName("sbi");
		
		creditcard cc=new creditcard();
		cc.setId(2);
		cc.setCtype("visa");
		cc.setName("axis");
		
		cheque c=new cheque();
		c.setId(3);
		c.setName("hdfc");
		c.setChequeno(123456);
		c.setAmount(12000);
		
		se.save(c);
		se.save(cc);
		se.save(b);
		tx.commit();

	}

}