package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import hibersirius2022.HibernateUtility;

public class ReadClient {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		Student student=(Student)session.get(Student.class, Integer.valueOf(1));
		
		Set<Address> addresses=student.getAddresses();
		
		for(Address add:addresses) {
			System.out.println(add);
		}
		HibernateUtility.closeSession(null);
	}
}



