package hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class updaterecord {

	public static void main(String[] args) {
	Session s = Hibernateutil.getsession();
	Query q =s.createQuery("update student set lname=:l");
	q.setString("l", "def");
	int n=q.executeUpdate();
	if(n>0) 
		System.out.println("successfully inserted");
	else
		System.out.println("something went wrong");
		Transaction tx = s.beginTransaction();
		tx.commit();
	
	}

}
