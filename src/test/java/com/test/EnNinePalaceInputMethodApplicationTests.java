package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnNinePalaceInputMethodApplicationTests {
	/**
	 * 测试 类 WordSources 方法 get()
	 */
	@Test
	public void testGet() {
		String type = WordSources.getInstance().get(1);
		System.out.println(type);
	}

	/**
	 * 类 PrintlnServiceImpl 方法 comb(String a, String b)
	 * 
	 * 
	 */
	@Test
	public void testComb() {
		PrintlnServiceImpl printlnServiceImpl = new PrintlnServiceImpl(2);
		//结果输出：[ip, ql, wk, il, qk, ik, rp, ep, rl, wp, el, rk, qp, wl, ek]
		printlnServiceImpl.comb("iqwer", "plk");
	}
	
	/**
	 * 类 PrintlnServiceImpl 方法 comb(String a, String b)
	 * 
	 * 
	 */
	@Test
	public void testWriter() {
		PrintlnServiceImpl printlnServiceImpl = new PrintlnServiceImpl(2);
		//结果输出：[ip, ql, wk, il, qk, ik, rp, ep, rl, wp, el, rk, qp, wl, ek]
		printlnServiceImpl.writer();
	}

	/** 工具类 RegexUtil
	 * 方法 isNumberic(String str)
	 */
	@Test
	public void testIsNumberic(){
		boolean t1 = RegexUtil.isNumberic("1111");
		boolean t2 = RegexUtil.isNumberic("lgl");
		System.out.println(t1);//true
		System.out.println(t2);//false
	}
	
	/** 工具类 RegexUtil
	 * 方法 isNumberlow3(String str)
	 */
	@Test
	public void isNumberlow3(){
		boolean t1 = RegexUtil.isNumberlow3("1111");
		boolean t2 = RegexUtil.isNumberlow3("lgl");
		System.out.println(t1);//false
		System.out.println(t2);//false
	}
	
	
}
