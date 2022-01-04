package com.di.no_spring_no_di;

public class NameController {
	//원하는 곳에서 new 연산자를 사용해서 객체 직접 생성
	// 의존성은 존재하나 DI는 아님
	NameService nameService = new NameService();
	
	//이름을 전달 받아서 NameService 클래스의 showName()메소드에게 전달하고 
	// "내이름은_입니다" 전달 받아서 이름 출력하는 메소드
	public void show(String name) {
		System.out.println("NameController: "+ nameService.showName(name));
		
	}
}
/*
	show()메소드
	 - 이름을 매개변수로 받아서 
	 - NameService클래스의 showName()메소드를 호출하면 이름 전달하고
	 - 결과를 받아서 출력
	 
	NameCotroller 클래스
	 - show()메소드에서 NameService 클래스의 showName()메소드를 호출하기 위해서
	 - NameService 타입의 객체 필요
	 - new 연산자를 통해 객체 생성(DI는 아님)
	 - NameCotroller 클래스는 NameService클래스와 강한 의존관계가 있다라고 함.

 
 */



