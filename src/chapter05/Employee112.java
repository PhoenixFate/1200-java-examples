package chapter05;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee112 implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6055205730721989558L;

	private String name;
	private int age;
	private Address112 address;

	public Employee112(String name, int age, Address112 address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address112 getAddress() {
		return address;
	}

	public void setAddress(Address112 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		StringBuilder sb = new StringBuilder();
		sb.append("name:" + name);
		sb.append("age:" + age);
		sb.append("address:" + address);
		return sb.toString();
	}

	@Override
	protected Employee112 clone() {
		Employee112 employee = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		try {
			ObjectInputStream ois=new ObjectInputStream(bais);
			employee=(Employee112) ois.readObject();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return employee;
	}

}
