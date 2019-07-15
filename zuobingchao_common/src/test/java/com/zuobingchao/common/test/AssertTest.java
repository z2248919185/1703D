package com.zuobingchao.common.test;

import java.util.ArrayList;

import java.util.HashMap;


import org.junit.Test;

import com.zuobingchao.common.utils.AssertUtil;

public class AssertTest {
	//断言为真如果为假,则抛出异常,异常消息为第二个参数默认消息
	@Test
	public void show1(){
		//通过
		try {
			Boolean str = true;
			AssertUtil.isTrue(str, "该对象不为真");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show2(){
		//不通过
		try {
			Boolean str = false;
			AssertUtil.isTrue(str, "该对象不为真");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//断言为假,如果为真,则抛出异常,异常消息为第二个参数默认消息
	@Test
	public void show3(){
		//通过
		try {
			Boolean str = false;
			AssertUtil.isFalse(str, "该对象不为假");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show4(){
		//不通过
		try {
			Boolean str = true;
			AssertUtil.isFalse(str, "该对象不为假");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//断言对象不为空,如果为空则抛出异常
	@Test
	public void show5(){
		try {
			//不为空
			Object str = "123";
			AssertUtil.isNotNull(str, "该对象为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show6(){
		try {
			//为空
			Object str = null;
			AssertUtil.isNotNull(str, "该对象为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//断言对象必须为空,如果不为空则抛出异常
	@Test
	public void show7(){
		try {
			//为空
			Object str = null;
			AssertUtil.isNull(str, "该对象不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show8(){
		try {
			//不为空
			Object str = "123";
			AssertUtil.isNull(str, "该对象不为空,抛出异常");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//断言集合不为空,对象不能为空,必须包含一个元素,不然跑异常
	@Test
	public void show9(){
		//通过
		try {
			ArrayList<Integer> str = new ArrayList<Integer>();
			str.add(5);
			AssertUtil.isNotList(str, "该集合不能为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show10(){
		//不通过,报异常
		try {
			ArrayList<Integer> str = new ArrayList<Integer>();
			AssertUtil.isNotList(str, "该集合不能为空,如果为空则异常");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//断言map集合不为空,必须包含一个元素
	@Test
	public void show11(){
		try {
			//map集合不为空,通过
			HashMap<Integer, String> str = new HashMap<Integer, String>();
			str.put(5, "左冰");
			AssertUtil.isNotMap(str, "map集合不能为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show12(){
		try {
			//map集合为空,不通过
			HashMap<Integer, String> str = new HashMap<Integer, String>();
			AssertUtil.isNotMap(str, "map集合不能为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//断言字符串必须有值,去掉空格后判断是否大于0
	@Test
	public void show13(){
		try {
			//通过,有值
			String str = "123";
			AssertUtil.isString(str, "去掉空格后为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show14(){
		try {
			//不通过,抛异常
			String str = "    ";
			AssertUtil.isString(str, "去掉空格后为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//断言值必须大于0如果小于等于则抛异常
	@Test
	public void show15(){
		//通过
		try {
			int str = 5;
			AssertUtil.isNot(str, "值不能小于等于0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show16(){
		//报异常
		try {
			int str = 0;
			AssertUtil.isNot(str, "值不能小于等于0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
