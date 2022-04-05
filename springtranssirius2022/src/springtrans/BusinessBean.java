package springtrans;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

public interface BusinessBean {
	
	public void doTransaction(int craccid,int draccid,int amt)throws Exception;
}
