package chapter05;

public class Employee110 implements Cloneable {
	private String name;
	private int age;
	private Address110 address;

	public Employee110(String name, int age, Address110 address) {
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

	public Address110 getAddress() {
		return address;
	}

	public void setAddress(Address110 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name:" + name);
		sb.append("age:" + age);
		sb.append("address:" + address);
		return sb.toString();
	}

	@Override
	protected Employee110 clone() {
		Employee110 employee = null;
		try {
			employee = (Employee110) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return employee;
	}

}
