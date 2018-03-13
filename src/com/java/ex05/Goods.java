package com.java.ex05;

public class Goods {
	
	
	private String name;
	private int price;

	
	

	public Goods(String name) {
		
		this.name=name;
		
	}
	
	public Goods(String name,int price) {
		
		this(name);
		this.price=price;
	}
	
	public void showinfo() {
		
		System.out.println("상품이름 : "+ name);
		System.out.println("가격 : "+ price);
		System.out.println("==============");
	}
}


