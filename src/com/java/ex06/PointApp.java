package com.java.ex06;

public class PointApp {

	public static void main(String[] args) {

		Point jwapyo = new Point(5,5);
		Point jwapyo2 = new Point(10,24);
		
		
		
		
		
		jwapyo.draw();    // draw() -- 괄호 속을 블랭크로 놓았기 때문에 블랭크인 draw문을 로드 할것이다.
		jwapyo2.draw();
		
		jwapyo.draw(0);   //draw(0) -- 괄호 속에 임의의 int 변수 하나를 넣으면 그 양식에 맞는 draw문을 로드할 것이다.
		jwapyo2.draw(0);
		
		
		// 마치 draw의 괄호 속 양식이 if 조건문처럼 쓰인다고 생각할 수 있겠다..
	}

}
