package Day4;

public class Movie {

	
	String title;
	String category;
	String director;
	int runningTime;
	String[] actorArray;
	
	public Movie(String title, String category, String director, int runningTime, String[]actorArray) {
		this.title=title;
		this.category=category;
		this.director=director;
		this.runningTime=runningTime;
		this.actorArray =actorArray;
		
	}
	public void printInfo() {
		System.out.print("제목="+title +"|");
		System.out.print("분류="+category +"|");
		System.out.print("감독="+director +"|");
		System.out.print("상영시간="+runningTime +"(분)");
		System.out.print("\n배우=");
		for(int i = 0; i<actorArray.length; i++) {
			if(i==actorArray.length-1) { ///,안나오게 할라고 
			System.out.print(actorArray[i]);
			}else {
			System.out.print(actorArray[i]+",");
			}
			
			
			
		}
	
	

	
	
	
	}
}
