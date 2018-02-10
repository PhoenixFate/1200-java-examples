package chapter05;

public class EmperorTest {
	public static void main(String[] args) {
		System.out.println("创建皇帝1对象");
		Emperor emperor1=Emperor.getInstance();
		System.out.println(emperor1);
		System.out.println("创建皇帝2对象");
		Emperor emperor2=Emperor.getInstance();
		System.out.println(emperor2);
		System.out.println("创建皇帝3对象");
		Emperor emperor3=Emperor.getInstance();
		System.out.println(emperor3);
		
	}
}
