package chapter05;

public class Test110 {
	public static void main(String[] args) {
		System.out.println("克隆之前：");
		Address110 address=new Address110("中国","江苏","南京");
		Employee110 employee1=new Employee110("王尼玛",12,address);
		System.out.println("员工1的信息:");
		System.out.println(employee1);
		System.out.println("克隆之后:");
		Employee110 employee2=employee1.clone();
		employee2.getAddress().setState("美国");
		employee2.getAddress().setProvince("金州");
		employee2.getAddress().setCity("洛杉矶");
		employee2.setName("西安交通大学");
		employee2.setAge(110);
		System.out.println("员工2的信息:");
		System.out.println(employee2);
		System.out.println("员工1的信息:");
		System.out.println(employee1);
	}
}
