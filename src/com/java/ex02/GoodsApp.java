package com.java.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods note1 = new Goods();    //도장을 찍는 행위
									 // Goods 라는 도장으로 메모리 영역에 새로운 인스턴스를 만든다(찍는다).
		Goods cup1 = new Goods();	 // note1 이라는 이름을 가진 인스턴스를 만들고, 해당 주소값을 note1에 담았다. 
									// cup1 이라는 이름을 가진 인스턴스를 만들고, 해당 주소값을 cup1에 담았다. 						
									//  도장 찍는 행위를 2번했으므로 2개의 인스턴스가 생김
		
		note1.name = "LG 그램";  		
		note1.price = 900000;		// 만들어진 인스턴스에 값을 넣는 과정
		
		cup1.name = "머그컵";
		cup1.price = 2000;
		
		
		System.out.println(note1.name);
		System.out.println(note1.price);
		
		System.out.println(cup1.name);
		System.out.println(cup1.price);
		
		
		
	}

}
