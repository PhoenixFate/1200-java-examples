package chapter02;

import java.util.Scanner;

public class VariableExchange {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入变量A的值");
		long A=scanner.nextLong();
		System.out.println("请输入变量B的值");
		long B=scanner.nextLong();
		System.out.println("A="+A+"\tB="+B);
		System.out.println("变量呼唤");
		A=A^B;
		B=A^B;
		A=A^B;
		System.out.println("A="+A+"\tB="+B);
		scanner.close();
	}
}
