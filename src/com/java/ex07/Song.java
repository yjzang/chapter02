package com.java.ex07;

public class Song {

	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setTrack(int track) {
		this.track=track;
	}
	
	
	public String getTitle(String title) {
		return title;
	}
	public String getArtist(String artist) {
		return artist;
	}
	public String getAlbum(String album) {
		return album;
	}
	public String getComposer(String composer) {
		return composer;
	}
	public int getYear(int year) {
		return year;
	}
	public int getTrack(int track) {
		return track;
	}
	
	public void showinfo() {
		
		System.out.println(artist+","+title+" (" +album +"," + year+"," + track + "번 track," +composer+" 작곡)");
		
	};
	
	
}
