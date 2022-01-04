package com.di.no_spring_di_constructor;

public class NameController {
	// 멤버 변수(필드)로 선언 해 놓고
	NameService nameService;
	// NameService 객체를 new 연산자를 통해서 직접 만들지 않고
	// 생성자를 통해서 객체를 전달 받음
	// 의미 : 생성자를 통해서 외부에서 주입 받음 (injection)
	// 의존성 주입
	public NameController(NameService nameService) {
		// 전달받은 값으로 멤버 변수 초기화
		this.nameService = nameService;
	}
	
	public void show(String name) {
		System.out.println("NameController : " + nameService.showName(name));
	}	
}