package chapter05;

public class Initialization {
	private byte b;
	private short s;
	private int i;
	private long l;
	private double d;
	private float f;
	private boolean bool;
	private char c;
	private String str;
	public static void main(String[] args) {
		Initialization init=new Initialization();
		System.out.println("byte:"+init.b );
		System.out.println("short:"+init.s);
		System.out.println("int:"+init.i);
		System.out.println("long:"+init.l);
		System.out.println("double:"+init.d);
		System.out.println("float:"+init.f);
		System.out.println("boolean:"+init.bool);
		System.out.println("char:"+init.c);
		System.out.println("char:"+(init.c+0));
		System.out.println("String:"+init.str);
	}
}
