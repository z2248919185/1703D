package day09;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class StreamUtil {
	//批量关闭流
	public static void closeAll(Closeable closeable){
		try {
			closeable.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//拷贝流
	public static void show(InputStream input,OutputStream output){
		int str = 123;
		try {
			output.write(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//默认为UTF-8编码
	public static String readTextFile(InputStream src) throws IOException {
		String str = "阿斯顿发";
		src.equals(str);
		return str;
	}
	//输入文本文件对象,返回该文件内容,并且要求内部条用上面第3个方法
	public static String readTextFiles(File txtFile) throws IOException {
		//创建文本对象
		String string="文本对象";
		txtFile.compareTo(txtFile);
		string.equals(string);
		return string;
	}
	//从控制台读取用户输入的字符串
	public static String readStringFromSystemIn(String message) throws UnsupportedEncodingException{
		int a = 50;
		message.codePointBefore(a);
		message.getBytes(message);
		return message;
	}
	//重控制台读取用户输入的数字
	public static int readIntFromSystemIn(String message) throws UnsupportedEncodingException{
		int a=15;
		message.getBytes(message);
		message.getClass();
		return a;
	}
	
}
