package springprojsirius2022;
//https://fluvid.com/videos/detail/1eVaGH7pALHAe49k2#.YkrE4SZcXvY.link
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args)throws Exception {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		//ShoeShop shop=ChennaiContainer.getShoeShop();
		ShoeShop shop=ctx.getBean("shop",ShoeShop.class);
				
		System.out.println(shop.sellShoe());
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
	public Shoe sellShoe();
}
abstract class ShoeShop implements Seller{
	
	private ShoeFactory factory;

	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	
}

class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}

class SiriusShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}