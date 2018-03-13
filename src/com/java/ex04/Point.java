package com.java.ex04;

public class Point {

	
	private int x;
	private int y;
	
	
	public void setCoordx(int x) {
		
		this.x = x;
	}
	

	public void setCoordy(int y) {
		
		this.y = y;
	}
	
	public int getCoordx() {
		
		return this.x;
	}
	
	public int getCoordy() {
		return this.y;
	}
	
	public void draw() {
		
		System.out.println("점[x=" + this.x + ","+ this.y + "]을 그렸습니다.");
		
		}
	
}
