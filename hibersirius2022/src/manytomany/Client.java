package manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import hibersirius2022.HibernateUtility;


public class Client {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		Employee emp=new Employee();
		emp.setEname("ramu");
		emp.setEpass("secret");
		emp.setEsal(20000);
		
		Set<Employee> employees=new HashSet<Employee>();
		employees.add(emp);
		
		Training t1=new Training();
		t1.setTname("hibernate");
		t1.setEmployees(employees);
		
		Training t2=new Training();
		t2.setTname("spring");
		t2.setEmployees(employees);
		
		Set<Training> trainings=new HashSet<Training>();
		trainings.add(t1);
		trainings.add(t2);
		
		emp.setTrainings(trainings);
		
		session.save(emp);
		session.save(t1);
		session.save(t2);
		
		HibernateUtility.closeSession(null);
	}
}
