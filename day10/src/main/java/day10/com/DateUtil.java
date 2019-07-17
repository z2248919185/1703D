package day10.com;

import java.util.Date;

public class DateUtil {
	//测试日期获取年龄
	@SuppressWarnings("deprecation")
	public static int getAge(Date src){
		Date date = new Date();
		int a = date.getYear();
		int b = src.getYear();
		int c = a-b;
		return c;
		
	}
	//测试月初日期
	public static Date getDateByMonthInit(Date src){
		@SuppressWarnings("deprecation")
		Date date = new Date(src.getYear(), src.getMonth(), 01, 00, 00, 00);
		return date;
	}
	//测试月末获取
	public static Date getDateByMonthLast(Date src){
		@SuppressWarnings("deprecation")
		Date date = new Date(src.getYear(), src.getMonth(), 30, 23, 59, 59);
		return date;
	}
	//测试日期还剩多少天
	@SuppressWarnings("deprecation")
	public static int getDaysByFuture(Date src){
		Date date = new Date();
		int a = src.getDay();
		int b = date.getDay();
		int c = a-b;
		return c;
	}
	//测试日期获取年龄
	@SuppressWarnings("deprecation")
	public static int getDaysByDeparted(Date src){
		Date date = new Date();
		int a = src.getDay();
		int b = date.getDay();
		int c = b-a;
		return c;
	}
}
