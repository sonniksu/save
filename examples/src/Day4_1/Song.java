package Day4_1;

import Day3.Singer; //다른데서 갖고온다.

public class Song {

	
	String title;
	String album;
	String stringSinger;
	Singer singer;
	String composer;
	String lyricist;
	String releaseDate;
	Song song;
	
	public Song(String title, Singer singer, String album, String composer, String lyricist, String releaseDate) {
		this.title=title;
		this.singer=singer;
		this.album=album;
		this.composer=composer;
		this.lyricist=lyricist;
		this.releaseDate=releaseDate;
		
	}
	public Song(String title, String singer, String album, String composer, String lyricist, String releaseDate) {
		this.title=title;
		this.stringSinger=singer;
		this.album=album;
		this.composer=composer;
		this.lyricist=lyricist;
		this.releaseDate=releaseDate;
		
	}
	
	public String getTitle() {
		return title;
	}
	public String getAlbum() {
		return album;
	}
	public String getStringSinger() {
		return stringSinger;
	}
	public Singer getSinger() {
		return singer;
	}
	public String getComposer() {
		return composer;
	}
	public String getLyricist() {
		return lyricist;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public Song getSong() {
		return song;
	}
	public void printInfo() {
		System.out.println("제목 = "+ title);
		System.out.println("앨범 ="+ album);
		System.out.println("작곡 =" + composer);
		System.out.println("작사 =" + lyricist);
		System.out.println("발매일 =" + releaseDate);
		
	System.out.println("====siger InFo====");
	singer.printInfo();
		
	}
}
