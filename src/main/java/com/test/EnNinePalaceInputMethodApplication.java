package com.test;

import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EnNinePalaceInputMethodApplication {
	public static void main(String[] args) {
		//需要把监听器加入到spring容器中
		SpringApplication application = new SpringApplication(EnNinePalaceInputMethodApplication.class);
		   application.addListeners(new CustListener());
		    Set<ApplicationListener<?>> listeners = application.getListeners();
		    ConfigurableApplicationContext context =  application.run(args);
		    //发布事件
		    context.publishEvent(new PrintlnServiceImpl(new Object()));
		
		   context.close();
	}
	


}
