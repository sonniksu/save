package Ch07;

public class Movie {

	private String title; // 제목
	private String category; // 카테고리
	private String director; // 감독
	private int runningTime; // 상영시간
	private String actor; // 배우

	// Constructor
	public Movie() {

	}

	public Movie(String title, String category, String director, int runningTime, String actor) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actor = actor;
	}

	// Method
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void printInfo() {
		System.out.println("제목=" + title);
		System.out.println("카테고리=" + category);
		System.out.println("감독=" + director);
		System.out.println("상영시간=" + runningTime + "(분)");
		System.out.println("배우=" + actor);
	}

}

