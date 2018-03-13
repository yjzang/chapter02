package com.java.ex07;

public class SongApp {

	public static void main(String[] args) {

		Song Gok1 = new Song();           // Gok1 이라는 인스턴스의 주소값을 받는 변수에 대한 선언을 하면 된다.
		Song Gok2 = new Song();			  // Song이라는 틀의 도장을 찍는 행위이며 찍힌도장1 찍힌도장2 찍힌도장3의 네이밍을 해주는 것이다. 
		Song Gok3 = new Song();
		
		Gok1.setArtist("아이유");
		Gok1.setTitle("좋은날");
		Gok1.setAlbum("Real");			 // 찍힌 도장1 의 구성 요소,값들을 넣어주는 과정이다.
		Gok1.setYear(2010);				 // 틀에다가 값을 넣는 것이 아니라 찍힌 도장에다가 변수를 넣는것이다.
		Gok1.setTrack(3);
		Gok1.setComposer("이민수");
		
		Gok1.showinfo();				// 찍힌 도장을 가시화 하는 것이다.
		
		Gok2.setArtist("BIGBANG");
		Gok2.setTitle("거짓말");
		Gok2.setAlbum("Always");
		Gok2.setYear(2007);
		Gok2.setTrack(2);
		Gok2.setComposer("G-DRAGON");
		
		Gok2.showinfo();	
		
		Gok3.setArtist("버스커버스커");
		Gok3.setTitle("벚꽃엔딩");
		Gok3.setAlbum("버스커버스커1집");
		Gok3.setYear(2012);
		Gok3.setTrack(4);
		Gok3.setComposer("장범준");
		
		Gok3.showinfo();	
		
		
		
		
		
	}

}
