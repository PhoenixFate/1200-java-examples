package chapter02;

import java.util.ArrayList;
import java.util.List;

public class UseForeach {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("hij");
		list.add("qrs");
		System.out.println("遍历集合");
		for(String s:list){
			System.out.println(s);
		}
		System.out.println("遍历数组");
		String[]strs=new String[list.size()];
		list.toArray(strs);
		for(String string:strs){
			System.out.println(string);
		}
	}
}
