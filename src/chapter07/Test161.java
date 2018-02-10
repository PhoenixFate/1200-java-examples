package chapter07;

import java.lang.reflect.Proxy;

public class Test161 {
	public static void main(String[] args) {
		Seller161 seller=new HouseSeller161();
		System.out.println("不使用代理方式：");
		seller.sell();
		System.out.println("使用代理方式：");
		ClassLoader loader=Seller161.class.getClassLoader();
		seller=(Seller161)Proxy.newProxyInstance(loader,new Class[]{Seller161.class}, new Agency161());
		seller.sell();
	}
}
