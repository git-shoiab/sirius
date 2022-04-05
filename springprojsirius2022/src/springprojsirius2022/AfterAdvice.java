package springprojsirius2022;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object bean, Method method, Object[] params, Object objreturned) throws Throwable {
		// TODO Auto-generated method stub
		Customer customer=(Customer)params[0];
		System.out.println("Thankyou..."+customer.getName()+" visit again.....");
	}
}
