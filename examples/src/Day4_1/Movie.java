package Day4_1;

public class Movie {

	String title;
	String category;
	String director;
	String name;
	String sex;
	String birth;
	String national;
	int runningTime;
	private Actor[] actorArray;

	public Movie(String title, String category, String director, int runningTime, Actor[] actorArray) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actorArray = actorArray;
	}

	public void printInfo() {
		System.out.print("제목="+title +"|");
		System.out.print("분류="+category +"|");
		System.out.print("감독="+director +"|");
		System.out.print("상영시간="+runningTime +"(분)");
		System.out.println("\n===============");
		for(int i=0; i<actorArray.length;i++) {
			System.out.println((i+1)+".이름=" + actorArray[i].name +"| 성별=" + actorArray[i].sex);
		}
	}
	
}