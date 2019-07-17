package day10.Test;

import java.util.Date;

import org.junit.Test;

import day10.com.DateUtil;

public class DateTest {
	//测试日期获取年龄
	@Test
	public void show(){
		@SuppressWarnings("deprecation")
		Date src = new Date(2000, 7, 17, 20, 25, 15);
		int aa = DateUtil.getAge(src);
		System.out.println("年龄为:"+aa);
	}
	//测试月初日期
		@Test
		public void show1(){
			@SuppressWarnings("deprecation")
			Date src = new Date(2000, 7, 17, 20, 25, 15);
			Date aa = DateUtil.getDateByMonthInit(src);
			System.out.println("月初日期为:"+aa);
		}
		//测试月末获取
		@Test
		public void show2(){
			@SuppressWarnings("deprecation")
			Date src = new Date(2000, 7, 17, 20, 25, 15);
			Date aa = DateUtil.getDateByMonthLast(src);
			System.out.println("年龄为:"+aa);
		}
		//测试日期还剩多少天
		@Test
		public void show3(){
			@SuppressWarnings("deprecation")
			Date src = new Date(2000, 7, 17, 20, 25, 15);
			int aa = DateUtil.getDaysByFuture(src);
			System.out.println("天数:"+aa);
		}
		//测试日期获取年龄
		@Test
		public void show4(){
			@SuppressWarnings("deprecation")
			Date src = new Date(2000, 7, 17, 20, 25, 15);
			int aa = DateUtil.getDaysByDeparted(src);
			System.out.println("天数:"+aa);
		}
}
