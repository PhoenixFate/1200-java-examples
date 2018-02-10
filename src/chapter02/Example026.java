package chapter02;

import java.util.Scanner;

public class Example026 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个整数");
		long number=scanner.nextLong();
		System.out.println("您输入的数字是"+number);
		System.out.println("该数字乘以2:"+(number<<1));
		System.out.println("该数字乘以4:"+(number<<2));
		System.out.println("该数字乘以8:"+(number<<3));
		System.out.println("该数字乘以16:"+(number<<4));
		scanner.close();
	}
}
