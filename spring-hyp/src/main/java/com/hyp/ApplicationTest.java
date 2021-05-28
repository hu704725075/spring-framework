package com.hyp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println(context.getBean(UserConfigration.class));
	}
}
