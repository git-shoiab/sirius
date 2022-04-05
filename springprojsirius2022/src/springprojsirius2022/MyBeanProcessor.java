package springprojsirius2022;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("post process after init called...");
		try {
		Field field=bean.getClass().getDeclaredField("mysign");
		System.out.println(field.get(bean));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("post process before init called...");
		return bean;
	}

}
