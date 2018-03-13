package com.java.ex06;

public class Point {

	
	private int x;
	private int y;
	
	
	public Point(int x,int y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	
	public void draw() {
		
		System.out.println("점[x=" + this.x + ","+ this.y + "]을 그렸습니다.");
		
		
	}
	
	public void draw(int e) {
		
		System.out.println("점[x=" + this.x + ","+ this.y + "]을 지웠습니다.");
		
		
	}
	
	// draw( ) 괄호 속에 양식을 만들어주어 해당 양식을 만족하면 다른 draw문을 시행하는 조건문처럼 쓸 수도있다.
	// 오버로드-- 여러개의 양식을 만들어 놓으면 양식이 맞는 놈을  찾아 들어가 시행한다.
	
}
