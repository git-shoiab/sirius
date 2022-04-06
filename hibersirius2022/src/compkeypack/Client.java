package compkeypack;

import org.hibernate.Session;

import hibersirius2022.HibernateUtility;


public class Client {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		CompKey ck=new CompKey();
		ck.setInv_id(100);
		ck.setItem_id(200);
		
		InvTrans inv=new InvTrans();
		inv.setCompKey(ck);
		inv.setQty(30);
		
		session.save(inv);
		
		HibernateUtility.closeSession(null);
	}
}
