package hibersirius2022;
//https://fluvid.com/videos/detail/DrG-KsrjBRh9kkYej#.Yk0n5C-dWgY.link
//https://fluvid.com/videos/detail/zj4k_TvmRETovvdL5#.Yk0reIwXCSU.link
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		//emp.setEid(100);
		emp.setEname("somu");
		emp.setEsal(10000);
		emp.setEpass("secret");
		
		Session session= HibernateUtility.getSession();
		
		session.save(emp);
		
		HibernateUtility.closeSession(null);
		
		
	}
}
