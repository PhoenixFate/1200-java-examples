package chapter02;

import java.util.Scanner;

public class ParityCheck {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		long number=scanner.nextLong();
		String check=(number%2==0)?"是偶数":"是奇数";
		System.out.println(check);
		scanner.close();
	}
}
