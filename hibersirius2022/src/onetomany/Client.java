package onetomany;
//https://fluvid.com/videos/detail/BMm-ri-Vp3CPGGQAm#.Yk1n1em9Fqw.link
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import hibersirius2022.HibernateUtility;


public class Client {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		Student student=new Student();
		
		student.setSname("jonu");
		student.setSage(20);
		
		Address a1=new Address();
		a1.setCity("manglore");
		a1.setStreet("mg street");
		a1.setStudent(student);
		
		Address a2=new Address();
		a2.setCity("delhi");
		a2.setStreet("av street");
		a2.setStudent(student);
		
		Set<Address> addresses=new HashSet<Address>();
		addresses.add(a1);
		addresses.add(a2);
		
		student.setAddresses(addresses);
		
		session.save(student);
		session.save(a1);
		session.save(a2);
		
		HibernateUtility.closeSession(null);
	}
}
