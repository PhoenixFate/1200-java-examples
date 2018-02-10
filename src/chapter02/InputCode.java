package chapter02;

import java.util.Scanner;

public class InputCode {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("请输入你的身份证号:");
		String line=scanner.nextLine();
		System.out.println("line:"+line);
		scanner.close();
	}
}
