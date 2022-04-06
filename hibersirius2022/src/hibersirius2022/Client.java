package hibersirius2022;
//https://fluvid.com/videos/detail/DrG-KsrjBRh9kkYej#.Yk0n5C-dWgY.link
//https://fluvid.com/videos/detail/zj4k_TvmRETovvdL5#.Yk0reIwXCSU.link
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee emp=new Employee();
		emp.setEid(100);
		emp.setEname("ramu");
		emp.setEsal(10000);
		
		Session session= factory.openSession();
		
		session.save(emp);
		
		session.beginTransaction().commit();
		
		
	}
}
