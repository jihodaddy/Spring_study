package com.di.no_spring_di_setter;

public class NameMain {

	public static void main(String[] args) {
		NameService nameService = new NameService();
		NameController controller = new NameController();
		// NameController 클래스 외부에서
		//Setter 메소드를 통해 nameService객체 전달(주입: injection)
		controller.setNameService(nameService);
		controller.show("성춘향");
	}

}
