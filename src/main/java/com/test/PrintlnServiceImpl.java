package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationEvent;
import org.springframework.util.StringUtils;

public class PrintlnServiceImpl extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6203054089625528217L;

	public PrintlnServiceImpl(Object source) {
		super(source);
	}

	public void writer() {
		System.out.println("服务已启动，请任意输入0-99的数据以开始组合");
		ConsoleListener cs = new ConsoleListener(new Scanner(System.in), new ConsoleListener.Action() {

			@Override
			public void act(String msg) {
				WordSources instance = WordSources.getInstance();// 数字，字母封装的map
				Map<Integer, String> map = new HashMap<Integer, String>();
				if (!StringUtils.isEmpty(msg)) {// 不为空
					boolean numberic = RegexUtil.isNumberlow3(msg);// 1~99
					if (numberic) {// 是数字
						if (msg.length() == 1) {
							int j = Integer.parseInt(msg.charAt(0) + "");
							String string = instance.get(j);
							if (null != string) {
								comb(string, null);
							}
						} else {
							for (int i = 0; i < msg.length(); i++) {
								int iType = Integer.parseInt(msg.charAt(i) + "");
								String iString = instance.get(iType);
								for (int j = i + 1; j <= msg.length() - i - 1; j++) {
									int jType = Integer.parseInt(msg.charAt(j) + "");
									String jString = instance.get(jType);
									comb(iString, jString);
								}
							}
						}
					} else {
						System.out.println("输入数据中，存在非法数据！请输入0-99之间的数据");
					}
				} else {
					System.out.println("请输入数字！");
				}
			}

		});
		cs.listenInNewThread();
		while (true) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void comb(String a, String b) {
		HashMap<Object, Object> hashMap = new HashMap<>();
		if (null != a && null != b) {
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < b.length(); j++) {
					hashMap.put(i + "" + j, a.charAt(i) + "" + b.charAt(j));
				}
			}

		} else if (null == a && null == b) {
			
		} else if (null == b) {
			for (int i = 0; i < a.length(); i++) {
				hashMap.put(i, a.charAt(i) + "");
			}
		} else if (null == a) {
			for (int j = 0; j < b.length(); j++) {
				hashMap.put(j, b.charAt(j) + "");
			}
		}
			System.out.println(hashMap.values());
	}


}
