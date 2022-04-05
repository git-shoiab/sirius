package dbpack;

import javax.sql.DataSource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbDemo {
	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		
		DataSource ds=ctx.getBean("dataSource",DataSource.class);
		
		System.out.println(ds.getConnection());
	}
}
