package hibersirius2022;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private HibernateUtility() {
		// TODO Auto-generated constructor stub
	}
	private static Configuration cfg;
	private static SessionFactory factory;
	static {
		try {
			cfg=new Configuration().configure();
			 factory=cfg.buildSessionFactory();
		}catch(Exception e) {e.printStackTrace();}
	}
	private static ThreadLocal<Session> tLocal=new ThreadLocal<>();
	private static Session session;
	synchronized public static Session getSession() {
		session=tLocal.get();
		if(session==null) {			
			session=factory.openSession();
			tLocal.set(session);
		}
		return session;
	}
	
	synchronized public static void closeSession(Exception e) {
		session=tLocal.get();
		if(session!=null) {
			if(e==null) {
				session.beginTransaction().commit();
			}
			else {
				session.beginTransaction().rollback();
			}
		}
		tLocal.remove();
	}
}
