package querypack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import hibersirius2022.HibernateUtility;
import manytomany.Employee;

public class QueryDemo1 {
	Session session;
	static Criteria criteria;
	Query query;
	public QueryDemo1() {
		session=HibernateUtility.getSession();
		criteria=session.createCriteria(Employee.class);
	}
	
	public static void main(String[] args) {
		QueryDemo1 obj=new QueryDemo1();
		obj.query92();
	}
	public static void display() {
		List<Employee> emps=criteria.list();
		emps.stream().forEach(System.out::println);
	}
	public void query1() {
		display();
	}
	public void query2() {
		criteria.addOrder(Order.desc("ename"));
		display();
	}
	public void query3() {
		criteria.add(Restrictions.eq("ename", "ramu"));
		display();
	}
	public void query4() {
		criteria.add(Property.forName("ename").eq("ramu"));
		display();
	}
	public void query5() {
		
		criteria.add(Restrictions.between("esal",Float.valueOf(2000),Float.valueOf(6000)));
		display();
		
	}
	public void query6() {
		Float f[]= {Float.valueOf(2000),Float.valueOf(6000)};
		criteria.add(Property.forName("esal").between(Float.valueOf(2000), Float.valueOf(6000)));
		display();		
	}
	public void query7() {
		Float f[]= {Float.valueOf(3000),Float.valueOf(5000)};
		criteria.add(Property.forName("esal").in(f));
		display();		
	}
	public void query8() {
		criteria.add(Restrictions.like("ename", "r%").ignoreCase());
		display();
	}
	public void query9() {
		criteria.add(Restrictions.like("ename","s%").ignoreCase()).add(Restrictions.gt("esal", Float.valueOf(2000)));
		display();
	}
	public void query91() {
		DetachedCriteria dc=DetachedCriteria.forClass(Employee.class);
		dc.add(
				Restrictions.or(
						Restrictions.like("ename", "r%"),Restrictions.gt("esal", Float.valueOf(2000))
				)
				);
		criteria=dc.getExecutableCriteria(session);
		display();
		
	}
	public void query92() {
		DetachedCriteria dc=DetachedCriteria.forClass(Employee.class);
		dc.add(
				Restrictions.and(
						Restrictions.like("ename", "r%"),Restrictions.gt("esal", Float.valueOf(999))
				)
				);
		criteria=dc.getExecutableCriteria(session);
		display();
		
	}
}
