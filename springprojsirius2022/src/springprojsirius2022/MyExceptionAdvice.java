package springprojsirius2022;

import org.springframework.aop.ThrowsAdvice;

public class MyExceptionAdvice implements ThrowsAdvice{
	public void afterThrowing(OneShoePerCustomerException ex) {
		System.out.println(ex);
		System.out.println("the handling logic for exception is written here...");
	}
}

class OneShoePerCustomerException extends Exception{
	String msg;
	public OneShoePerCustomerException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is....:"+msg;
	}
}