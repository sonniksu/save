package Day4_1;

public class MusicChart {

	String title;
	String Singer;
	String album;
	String composer;
	String writer;
	int date;
	Song[] SongArray;

	public MusicChart(Song[] SongArray) {
		this.SongArray = SongArray;
	}

	public void printMusicChart() {

		System.out.println("====Music Chart====");
		for(int i = 0;i<SongArray.length;i++){
			System.out.println((i+1)+".");
			System.out.println("제목 = " + SongArray[i].getTitle());
			System.out.println("가수 = " + SongArray[i].getStringSinger());
		}
	}

	
}



