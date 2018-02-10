package chapter05;

public class Test114 {
	public static void main(String[] args) {
		Login114 login1=new Login114("mingrisoft","mr");
		System.out.println("输出原始对象的信息:");
		System.out.println(login1);
		Login114 login2=login1.clone();
		System.out.println("输出克隆对象的信息:");
		System.out.println(login2);
	}
}
