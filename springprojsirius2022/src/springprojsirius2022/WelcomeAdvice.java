package springprojsirius2022;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WelcomeAdvice implements MethodBeforeAdvice{
	@Override
	public void before(Method method, Object[] params, Object bean) throws Throwable {
		// TODO Auto-generated method stub
		Customer customer=(Customer)params[0];
		String name=customer.getName();
		System.out.println("Welcome to Shoe shop...:"+name);
	}
}
