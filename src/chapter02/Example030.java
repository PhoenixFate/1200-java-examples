package chapter02;

import java.util.Scanner;

public class Example030 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("java.hashCode"+"java".hashCode());
		System.out.println("Java.hashCode"+"Java".hashCode());
		System.out.println("c#.hashCode"+"c#".hashCode());
		System.out.println("C#.hashCode"+"C#".hashCode());
		System.out.println("Asp.net.hashCode"+"Asp.net".hashCode());
		System.out.println(".net.hashCode"+".net".hashCode());
		System.out.println("请输入新员工的姓名:");
		String name = scanner.nextLine();
		System.out.println("请输入新员工应聘的编程语言：");
		String language = scanner.nextLine();
		switch (language.hashCode()) {
		case 3254818:
		case 2301506:
		case 2269730:
			System.out.println("员工" + name + "被分配到Java程序开发部门");
			break;
		case 3104:
		case 2112:
			System.out.println("员工" + name + "被分配到C#项目维护组");
			break;
		case -709190099:
		case 955463181:
		case 974591:
			System.out.println("员工" + name + "被分配到Asp.net程序测试部门");
			break;
		default:
			System.out.println("本公司不需要" + language + "程序开发人员");
		}
		scanner.close();
	}
}
