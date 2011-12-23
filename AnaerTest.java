package com.anaer.core;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AnaerTest {

	@Test
	public void getContentTest(){
		
		//要访问测试的URL地址
		String url = "http://localhost:8080/AnaerTestHtml/history2.htm";
		
		Anaer anaer = new Anaer();
		
		//声明URL和返回字符集编码
		anaer.setUrl(url);
		anaer.setCharSet("GBK");
		
		//找到主标签的对应所有子标签的两个字段
		List<Map<String, String>> result = anaer.extract("form", "input", "name", "value");
		
		//找到主标签的对应所有子标签的两个字段并将结果打印在控制台
		anaer.extractAndShow("form", "input", "name", "value");
	}
}
