package querypack;

import java.util.List;
import java.util.stream.Stream;

import org.hibernate.Query;
import org.hibernate.Session;

import hibersirius2022.HibernateUtility;
import manytomany.Employee;


public class QueryDemo2 {
	Session session;
	public QueryDemo2() {
		session=HibernateUtility.getSession();
		
	}
	public void display(Query query) {
		query.list().stream().forEach(System.out::println);
	}
	public static void main(String[] args) {
		QueryDemo2 obj=new QueryDemo2();
		obj.query94();
	}
	public void query1() {
		Query query=session.createQuery("from Employee");
		display(query);
	}
	
	public void query2() {
		Query query=session.createQuery("from Employee e where e.esal>1000");
		display(query);
	}
	public void query3() {
		Query query=session.createQuery("from Employee e where e.esal>=1000 and e.ename='ramu'");
		display(query);
	}
	public void query4() {
		Query query=session.createQuery("from Employee e where e.eid=?");
		query.setParameter(0, 1);
		display(query);
	}
	public void query5() {
		Query query=session.createQuery("from Employee e where e.eid=:id");
		query.setParameter("id", 1);
		display(query);
	}
	public void query6() {
		Query query=session.createQuery("from Employee e where e.eid=:eid");
		Employee emp=new Employee();
		emp.setEid(1);
		query.setProperties(emp);
		display(query);
	}
	public void query7() {
		Query query=session.createQuery("select e.ename, e.esal from Employee e where e.eid=:eid");
		Employee emp=new Employee();
		emp.setEid(1);
		query.setProperties(emp);
		List<Object[]> list=query.list();
		for(Object obj[]:list) {
			for(Object o:obj) {
				System.out.println(o);
			}
		}
	}
	public void query8() {
		Query query=session.createQuery("select  e.esal from Employee e where e.eid=:eid");
		Employee emp=new Employee();
		emp.setEid(1);
		query.setProperties(emp);
		List<Object[]> list=query.list();
		for(Object obj:list) {
				System.out.println(obj);
			}
		}
	public void query9() {
		Query query=session.getNamedQuery("myquery5");
		Employee emp=new Employee();
		emp.setEid(1);
		query.setProperties(emp);
		List<Object[]> list=query.list();
		for(Object obj:list) {
				System.out.println(obj);
			}
		}
	public void query91() {//inner join or right join - 
		//An inner join would return a employee only if there is atleast one matching address
		Query query=session.createQuery("select s.sname,s.sage,a.city from Student s join s.addresses a where a.city=:c");
		query.setParameter("c","delhi");
		List<Object[]> list=query.list();
		for(Object obj[]:list) {
			System.out.println(obj[0]+":"+obj[1]+":"+obj[2]);
		}
	}
	
	public void query92() {//outer join or left join - 
		//An outer join would return all employees at least once, with a null address
		//even if no matching employees are found
		Query query=session.createQuery("select s.sname,s.sage,a.city from Student s left join s.addresses a with a.city=:c");
		query.setParameter("c","delhi");
		List<Object[]> list=query.list();
		for(Object obj[]:list) {
			System.out.println(obj[0]+":"+obj[1]+":"+obj[2]);
		}
	}
	public void query93() {
		Query query=session.createQuery("insert into BackupEmployee (eid,ename,esal) select e.eid,e.ename,e.esal from Employee e");
		query.executeUpdate();
		HibernateUtility.closeSession(null);
	}
	
	public void query94() {
		Query query=session.createQuery
("select s.sname from Student s where s.addresses.city in ( select a.city from Address a where a.city = 'chennai')");
		List<Object[]> list=query.list();
		for(Object obj:list) {
				System.out.println(obj);
			}
		Stream stream=list.stream();
		Object obj[]=stream.toArray();
	}
}
