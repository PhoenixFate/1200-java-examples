package chapter04;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDate61 {
	public static void main(String[] args) {
		Date date=new Date();
		DateFormat format=DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINA);
		String string=format.format(date);
		System.out.println("中国日期:\t"+string);
		format=DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
		string=format.format(date);
		System.out.println("US:\t"+string);
		
	}
}
