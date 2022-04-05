package springprojsirius2022;

import java.util.Vector;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{
	Vector<Customer> c=new Vector<Customer>();
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Customer customer=(Customer)mi.getArguments()[0];
		if(c.contains(customer)) {
			throw new OneShoePerCustomerException("only one shoe per customer....");
		}
		else {
			c.add(customer);
			Object obj=mi.proceed();
			return obj;
		}
		
	}
}
