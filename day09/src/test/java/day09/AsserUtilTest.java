package day09;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class AsserUtilTest {
	@Test
	public void show(){
		String str = "阿斯顿发";
		try {
			StreamUtil.readIntFromSystemIn(str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show1(){
		String str = "66464";
		try {
			StreamUtil.readStringFromSystemIn(str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void show2(){
		File str =null;
		try {
			StreamUtil.readTextFiles(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
