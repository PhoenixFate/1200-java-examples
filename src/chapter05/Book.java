package chapter05;

public class Book {
	private static int counter=0;
	public Book(String title){
		System.out.println("售出图书:"+title);
		counter++;
	}
	public static int getCounter(){
		return counter;
	}
}
