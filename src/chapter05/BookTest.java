package chapter05;

import java.util.Random;

public class BookTest {
	public static void main(String[] args) {
		String[] titles={"Java从入门到放弃","Java从入门到绝望","Java从入门到入坆","编程宝典","编程思想","nice to meet you"};
		for(int i=0;i<5;i++){
			new Book(titles[new Random().nextInt(5)]);
		}
		System.out.println("总计销售了"+Book.getCounter()+"本图书！");
	}
}
