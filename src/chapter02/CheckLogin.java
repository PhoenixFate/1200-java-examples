package chapter02;

import java.util.Scanner;

public class CheckLogin {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入登入用户名:");
		String username=scanner.nextLine();
		System.out.println("请输入密码:");
		String password=scanner.nextLine();
		if(!username.equals("mr")){
			System.out.println("用户名不对");
		}else if(!password.equals("mrsoft")){
			System.out.println("密码不对");
		}else{
			System.out.println("欢迎您");
		}
		scanner.close();
	}
}
