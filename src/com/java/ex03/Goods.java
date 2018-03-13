package com.java.ex03;

public class Goods {

	private String name;
	private int price;

	
	public Goods(String name,int price) {
		
		this.name=name;
		this.price=price;
		
	}
	
	// 생성자의 이름은 클래스의 이름과 동일해야한다.
	// 부모 클래스에 양식을 만들어 주고, 자식클래스에서는 new 도장을 찍는다.
	// 자식 클래스에서 넣은 입력값 양식과 맞는 생성자가 부모클래스에 있을 경우 해당 생성자가 선택된다.
	
/*	
 *  This를 이용하여 생성자를 소환할 수도 있다.
 * 	public Goods(String name,int price) {
	this(name); 을 쓰면 해당 양식으로 구성된 생성자를 불러와서 1회 실행한다.	
	this.price=price; 
	
}
*/
	
	public Goods() {}  //기본 생성자- 아무런 생성자를 안쓸 경우 내재 되어있다.
						// 그러나, 생성자를 생성했을 경우엔 내재되었던 것이 사라지므로 직접 써줘야한다.
	
	public Goods(String name) {
		
		this.name=name;
	}
	
	public void setName(String name) {   // return을 받지 않을때는 void형을 써준다.

		this.name = name;

	}

	public void setPrice(int p) { 

		price = p;

	}

	public String getName() { 	 // return 받는 변수의 자료형과 맞춰준다.

		return name;

	}

	public int getPrice() {

		return price;

	}
	
	public void showinfo() {
		
		System.out.println("상품이름: " + name);			//name이 의미하는 것은 틀이 아니라 붕어빵(인스턴스의 값)
		System.out.println("가격: " + price);
		System.out.println("================");
		
		/*
		틀에다가 만들어주면 코드가 간단화 된다. (아래 과정을 showinfo로 만들어줌) 
		System.out.println("상품 이름 : "+ note.getName());
		System.out.println("가격 : "+ note.getPrice());
		System.out.println("상품 이름 : "+ cup.getName());
		System.out.println("가격 : "+ cup.getPrice());
		
		*/
	}
	

	public void showinfoo() {
		
		System.out.println("상품이름: " + name);			//name이 의미하는 것은 틀이 아니라 붕어빵(인스턴스의 값)
		
		System.out.println("================");

	
	}
	
}