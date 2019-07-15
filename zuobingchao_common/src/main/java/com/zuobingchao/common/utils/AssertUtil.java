package com.zuobingchao.common.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	//断言为真,如果为假,则抛出异常,异常消息为第二个参数默认消息
	public static void isTrue(Boolean str,String str2){
		if(!(Boolean.TRUE.equals(str))){
			throw new WeekRuntimeExcepter(str2);
		}
	}
	//断言为假,如果为真,则抛出异常,异常消息为第二个参数默认消息
	public static void isFalse(Boolean str,String str2){
		if(!(Boolean.FALSE.equals(str))){
			throw new WeekRuntimeExcepter(str2);
		}
	}
	//断言对象不为空,如果为空则抛出异常
	public static void isNotNull(Object str,String str2){
		if(str == null){
			throw new WeekRuntimeExcepter(str2);
		}
	}
	//断言对象必须为空,如果不为空则抛出异常
	public static void isNull(Object str,String str2){
		if(!(str == null)){
			throw new WeekRuntimeExcepter(str2);
		}
	}
	//断言集合不为空,对象不能为空,必须包含一个元素,不然跑异常
	public static void isNotList(Collection<?> str,String str2){
		if(str==null || str.size()==0){
			throw new WeekRuntimeExcepter(str2);
		}
	}
	//断言map集合不为空,必须包含一个元素
	public static void isNotMap(Map<?, ?> str,String str2){
		if(str==null || str.size()==0){
			throw new WeekRuntimeExcepter(str2);
		}
	}
	//断言字符串必须有值,去掉空格后判断是否大于0
	public static void isString(String str,String str2){
		if(!(str.trim().length()>0)){
			throw new WeekRuntimeExcepter(str2);
		}
	}
	//断言值必须大于0如果小于等于则抛异常
	public static void isNot(int str,String str2){
		if(!(str>0)){
			throw new WeekRuntimeExcepter(str2);
		}
	}
}
