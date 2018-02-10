package chapter02;

public class BreakCycle {
	public static void main(String[] args) {
		 System.out.println("\r----------中断单层循环的例子--------");
		 String[]array=new String[]{"白鹭","丹顶鹤","黄鹂","老鹰","布谷鸟","老鹰","灰文鸟"};
		 System.out.println("在你发现第一只老鹰之前，告诉我都有什么鸟");
		 for(String string:array){
			 if(string.equals("老鹰")){
				 break;
			 }
			 System.out.println("有："+string+"\t");
		 }
		 System.out.println("\n----------中断双层循环的例子-----------");
		 int[][]myScores=new int[][]{{67,78,63,78,66},{55,68,78,95,44},{95,97,92,93,81}};
		 System.out.println("宝宝这次考试成绩：\n数学\t语文\t英语\t美术\t历史");
		 No1:for(int[] scores:myScores){
			 for(int score:scores){
				 System.out.print(score+"\t");
				 if(score<60){
					 System.out.println("\n等等"+score+"分是什么?为什么不及格");
					 break No1;
				 }
			 }
			 System.out.println();
		 }
	}
}
