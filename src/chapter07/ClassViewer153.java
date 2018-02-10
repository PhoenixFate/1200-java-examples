package chapter07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassViewer153 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?>clazz=Class.forName("java.util.ArrayList");
		System.out.println("类的标准名称："+clazz.getCanonicalName());
		Constructor[] constructors=clazz.getConstructors();
		System.out.println("类的构造方法：");
		if(constructors.length!=0){
			for(Constructor constructor:constructors){
				System.out.println("\t"+constructor);
			}
		}else{
			System.out.println("\t空");
		}
		Field[]fields=clazz.getDeclaredFields();
		System.out.println("类的非继承域变量：");
		if(fields.length!=0){
			for(Field field:fields){
				System.out.println("\t"+field);
			}
		}else{
			System.out.println("\t空");
		}
		Method[]methods=clazz.getDeclaredMethods();
		System.out.println("类的非继承方法：");
		if(methods.length!=0){
			for(Method method:methods){
				System.out.println(method);
			}
		}else{
			System.out.println("\t空");
		}
	}
}
