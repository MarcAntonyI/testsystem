package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class FirstProjectApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext
				(JavaConfig.class);

		ShowCurrency showCurrency = context.getBean("showCurrency", ShowCurrency.class);
		showCurrency.getCurrency();

		System.out.println(showCurrency.getDate());
		context.close();
	}
}


