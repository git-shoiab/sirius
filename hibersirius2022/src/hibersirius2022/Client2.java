package hibersirius2022;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
//https://fluvid.com/videos/detail/DrG-KsrjBRh9kkYej#.Yk0n5C-dWgY.link
//https://fluvid.com/videos/detail/zj4k_TvmRETovvdL5#.Yk0reIwXCSU.link
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//https://fluvid.com/videos/detail/_LkeEcqmQqH3__vxm#.Yk04vK1hTOI.link
//https://fluvid.com/videos/detail/dagdEhZrDxc8OOZR4#.Yk1bdfov7yY.link
public class Client2 {
	public static void main(String[] args) {
		
		Session session= HibernateUtility.getSession();
		
		
		//Employee emp=(Employee)session.get(Employee.class,Integer.valueOf(3));
		
		//Employee emp=(Employee)session.load(Employee.class,Integer.valueOf(3));
		
		//System.out.println(emp);
		
		Query query= session.createQuery("from Employee");
		
		query=session.getNamedQuery("myquery4");
		query.setParameter("eid", Integer.valueOf(1));
		
		List<Employee> list= query.list();
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		query=session.getNamedQuery("myquery5");
		query.setParameter("eid", Integer.valueOf(1));
		list=query.list();
		iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		query=session.getNamedQuery("myquery6");
		query.setParameter("eid", Integer.valueOf(1));
		List list2=query.list();
		Iterator iter2=list2.iterator();
		while(iter2.hasNext()) {
			Object obj[]=(Object[])iter2.next();
			System.out.println(obj[0]+":"+obj[1]);
		}
	}
}
