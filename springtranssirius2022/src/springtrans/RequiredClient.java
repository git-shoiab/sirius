package springtrans;
//https://fluvid.com/videos/detail/9wa-BiEM5YhR99AM7#.Ykwh3_K47IA.link
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredClient {
	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config3.xml");
		
		BusinessBean bb=ctx.getBean("advisedBusinessBean",BusinessBean.class);
		
		bb.doTransaction(200, 100, 5000);
	}
}
