package springprojsirius2022;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//https://fluvid.com/videos/detail/1eVaGH7pALHAe49k2#.YkrE4SZcXvY.link

//https://fluvid.com/videos/detail/ka7dEhgmmyHOo78OP#.YkrT016julA.link

//https://fluvid.com/videos/detail/448axCQ9QKhBRRE9e#.YkvJT_JEHG0.link

//https://fluvid.com/videos/detail/zj4k_TvmQBFgjj7P8#.YkvR1CrzGKY.link

//https://fluvid.com/videos/detail/XLE5Zc7rxmT6GGnoq#.YkvWxJwY3aI.link

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args)throws Exception {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		//ShoeShop shop=ChennaiContainer.getShoeShop();
		Seller shop=ctx.getBean("advisedshop",Seller.class);
		Customer customer=new Customer();
		customer.setName("ramu");
		
		System.out.println(shop.sellShoe(customer));
		//shop.sellShoe(customer);
		
		shop.test();
		
		Exporter exporter=(Exporter)shop;
		exporter.doExport();
		
		shop=ctx.getBean("shop",ShoeShop.class);
		shop=ctx.getBean("shop",ShoeShop.class);
		shop=ctx.getBean("shop",ShoeShop.class);
//		System.out.println(shop.name);
//		System.out.println(shop.getList());
//		System.out.println(shop.getSet());
//		System.out.println(shop.getMap());
//		System.out.println(shop.getProp());
		ctx.close();
	}
}
class Customer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
abstract class Shoe{}

class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}

interface Manufacturer{
	
	public Shoe makeShoe();
}
abstract class ShoeFactory implements Manufacturer{
	public ShoeFactory() {
		// TODO Auto-generated constructor stub
	}
}
interface Seller{
	public Shoe sellShoe(Customer customer);
	public void test();
}
abstract class ShoeShop implements Seller{
	private ShoeFactory factory;
	String name;
	private List list;
	private Set set;
	private Map map;
	private Properties prop;
	public ShoeShop() {
		// TODO Auto-generated constructor stub
	}
	public ShoeShop(ShoeFactory factory) {
		setFactory(factory);
	}
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	
}

class BataShoeFactory extends ShoeFactory{
	public static String mysign="blablabla";
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public static String mysign="bababababa";

	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}

class SiriusShoeShop extends ShoeShop{
	public static String mysign="kavakavakva";

	public SiriusShoeShop() {
		System.out.println("shoe shop cons called....");
	}
	
	public SiriusShoeShop(ShoeFactory factory) {
		super(factory);
		System.out.println("shoe shop cons called..factory param cons called..");		
	}
	@Override
	public Shoe sellShoe(Customer customer) {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
	public void startup() {
		System.out.println("start up method called...");
	}
	public void closeup() {
		System.out.println("destroy method called...");
	}
	@Override
	public void test() {
		System.out.println("test method called....");
	}
}