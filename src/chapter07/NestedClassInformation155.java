package chapter07;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class NestedClassInformation155 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?>cla=Class.forName("java.awt.geom.Point2D");
		Class<?>[] classes=cla.getDeclaredClasses();
		for(Class<?>clazz:classes){
			System.out.println("类的标准名称："+clazz.getCanonicalName());
			System.out.println("类的修饰符:"+Modifier.toString(clazz.getModifiers()));
			Type[]interfaces=clazz.getGenericInterfaces();
			System.out.println("类所实现的接口：");
			if(interfaces.length!=0){
				for(Type type:interfaces){
					System.out.println("\t"+type);
				}
			}else{
				System.out.println("\t空");
			}
			Type superClass=clazz.getGenericSuperclass();
			System.out.println("类的直接继承类：");
			if(superClass!=null){
				System.out.println(superClass);
			}else{
				System.out.println("空");
			}
		}
	}
}
