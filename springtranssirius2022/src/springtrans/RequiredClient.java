package springtrans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredClient {
	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		BusinessBean bb=ctx.getBean("advisedBusinessBean",BusinessBean.class);
		
		bb.doTransaction(1, 2, 5000);
	}
}
