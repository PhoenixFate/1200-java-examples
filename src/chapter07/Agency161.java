package chapter07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Agency161 implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理人在卖房子");
		return null;
	}

}
