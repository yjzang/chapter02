package com.java.ex03;

public class GoodsApp {

	public static void main(String[] args) {

		
		Goods note = new Goods();
		Goods cup = new Goods();
		Goods pen = new Goods("볼펜",1000);
		Goods phone = new Goods("갤럭시");
		
		// 생성자의 양식을 부모클래스에 미리 만들어놔야한다.
		// 여러개의 생성자를 부모클래스에 만들어 놓으면 양식이 맞는 생성자를 가져다쓴다.
		
		phone.showinfoo();
		
		
		pen.showinfo();
		
		note.setName("LG 그램") ;    //괄호 안에 들어가는 값 (n)이 상위클래스(틀) 함수로 보내진다. --> 상위클래스(틀)에 써진 함수 setName이 돌아가서 인스턴스가 찍힌다. 
		note.setPrice(900000) ;
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		note.showinfo();
		cup.showinfo();
																			
																			
		
	}

}
