package compkeypack;
//https://fluvid.com/videos/detail/rx3dEs7-zncKRRe-q#.Yk1hn_YBrBY.link
import org.hibernate.Session;

import hibersirius2022.HibernateUtility;


public class ReadClient {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		CompKey ck=new CompKey();
		ck.setInv_id(100);
		ck.setItem_id(200);
		
		InvTrans inv=(InvTrans)session.get(InvTrans.class, ck);
		
		System.out.println(inv.getQty());
		
		HibernateUtility.closeSession(null);
	}
}
