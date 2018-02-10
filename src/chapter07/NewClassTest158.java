package chapter07;

import java.io.File;
import java.lang.reflect.Constructor;

public class NewClassTest158 {
	public static void main(String[] args) {
		try {
			Constructor<File>constructor=File.class.getDeclaredConstructor(String.class);
			System.out.println("使用反射创建File对象");
			File file=constructor.newInstance("new.txt");
			System.out.println("创建new.txt");
			file.createNewFile();
			System.out.println("文件创建成功："+file.exists());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
