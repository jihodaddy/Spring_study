package com.di.spring_di_annotation_configuration_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberMain {

	public static void main(String[] args) {

		// AnnotationConfigApplicationContext 스프링 컨테이너 생성
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Member member = context.getBean("member", Member.class);
		System.out.println(member); // toString() 자동호출
		member.showBMI();
		
		context.close();
	}

}
