package hibernate;

import org.hibernate.Session;

public class Getrecord {

	public static void main(String[] args) {
		Session se =Hibernateutil.getsession();
		student st = (student) se.get(student.class, new Integer(222));
		System.out.println("student id: "+st.getId()+"student firstname: "+st.getFname());
	}

}
