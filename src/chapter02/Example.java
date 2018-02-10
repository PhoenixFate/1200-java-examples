package chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个英文字符串或解密字符串");
		String password=scanner.nextLine();
		char[]array=password.toCharArray();
		System.out.println("toCharArray():"+Arrays.toString(array));
		for(int i=0;i<array.length;i++){
			array[i]=(char)(array[i]^20000);
		}
		System.out.println("加密或解密结果如下:");
		System.err.println(new String(array));
		scanner.close();
	}
}
