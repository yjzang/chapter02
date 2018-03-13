package com.java.ex08;

public class Song {


	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	public Song(String artist,String title,String album, int year,int track,String composer) {
	
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
		
		
	}
	
	
	public void showinfo() {
		
		System.out.println(artist+","+title+" (" +album +"," + year+"," + track + "번 track," +composer+" 작곡)");
	}
}
