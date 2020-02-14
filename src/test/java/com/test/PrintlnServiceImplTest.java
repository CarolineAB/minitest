package com.test;

import org.junit.BeforeClass;
import org.junit.Test;

public class PrintlnServiceImplTest {
	
	private static PrintlnServiceImpl psl;
	
	@BeforeClass
	public static void before(){
		psl = new PrintlnServiceImpl(1);
	}

	@Test
	public void testWriter() {
		new PrintlnServiceImpl(1).writer();
	}

	
	@Test
	public  void testGetWordsByNum() {
//			char c = '2';
//			String wordsByNum =psl.getWordsByNum(c);
//			System.out.println(wordsByNum);
	}
	@Test
	public void testcCombination(){
//		Map<Integer, String> map = new HashMap<>();
//		map.put(0, "a,b,c");
//		map.put(1, "d,e,f");
//		 psl.combination(map);
	}
}
