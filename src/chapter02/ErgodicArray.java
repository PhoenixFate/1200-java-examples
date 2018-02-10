package chapter02;

public class ErgodicArray {
	public static void main(String[] args) {
		String[] aves=new String[]{"白鹭","丹顶鹤","黄鹤","鹦鹉","乌鸦","喜鹊"};
		int index=0;
		System.out.println("我们花园里有很多鸟，种类大约包括：");
		while(index<aves.length){
			System.out.println(aves[index++]);
		}
	}
}
