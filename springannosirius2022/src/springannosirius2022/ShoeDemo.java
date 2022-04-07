package springannosirius2022;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ShoeDemo {
	public static void main(String[] args)throws Exception {		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");		
	
		Seller shop=ctx.getBean("ss",Seller.class);
		Customer customer=new Customer();
		customer.setName("ramu");
		
		Shoe shoe=shop.sellShoe(customer);
		System.out.println(shoe);
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
	
	@Autowired
	@Qualifier("lsf")
	private ShoeFactory factory;
	public ShoeShop() {
		// TODO Auto-generated constructor stub
	}
	public ShoeShop(ShoeFactory factory) {
		setFactory(factory);
	}
	
	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	
}
@Component("bsf")
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
@Component("lsf")
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

@Component("ss")
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