package chapter02;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
	public static void main(String[] args) {
		PrintStream out=System.out;
		try {
			PrintStream ps=new PrintStream("./log.txt");
			System.setOut(ps);
			int age=18;
			System.out.println("年龄变量成功定义，初始值为18");
			String sex="女";
			System.out.println("性别变量成功定义，初始值为女");
			String info="这是个"+sex+"孩子，应该有"+age+"岁了";
			System.out.println("整合两个变量info字符串变量，其结果为"+info);
			System.setOut(out);
			System.out.println("程序运行完毕，请查看日志文件");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
