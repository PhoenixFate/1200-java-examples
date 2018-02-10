package chapter07;

import java.lang.reflect.Field;

public class Test156 {
	public static void main(String[] args) {
		Student156 student=new Student156();
		Class<?> clazz=student.getClass();
		System.out.println("类的标准名称："+clazz.getCanonicalName());
		try {
			Field id=clazz.getDeclaredField("id");
			System.out.println("设置前的id："+student.getId());
			id.setAccessible(true);
			id.setInt(student, 10);
			System.out.println("设置后的id:"+student.getId());
			
			Field name=clazz.getDeclaredField("name");
			System.out.println("设置前的name:"+student.getName());
			name.setAccessible(true);
			name.set(student, "明日科技");
			System.out.println("设置后的name:"+student.getName());
			
			Field male=clazz.getDeclaredField("male");
			System.out.println("设置前的male:"+student.isMale());
			male.setAccessible(true);
			male.setBoolean(student, true);
			System.out.println("设置后的male:"+student.isMale());
			
			Field account=clazz.getDeclaredField("account");
			System.out.println("设置前的account:"+student.getAccount());
			account.setAccessible(true);
			account.setDouble(student, 12.34);
			System.out.println("设置后的account:"+student.getAccount());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
