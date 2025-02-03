package com.mainapp;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.config.AppConfig;
import com.service.BankingService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		BankingService bs=(BankingService)ctx.getBean("bankingService");
		bs.createAccount("Rizwan");
		bs.deposit("Rizwan", 5000);
		bs.deposit("Rizwan", 10000);
	}

}
