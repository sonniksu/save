package Day1;

public class Movie {

	// 필드
	String title;
	String category;
	String director;
	int runningTime;

	// 생성자

	// 메소드
	void settitle(String title) {
		this.title = title;
	}
	String gettitle() {
		return this.title;
	}
	void setcategory(String category) {
		this.category = category;
	}
	String getcategory() {
		return this.category;
	}
	void setdirector(String director) {
		this.director = director;
	}
	String getdirector() {
		return this.director;
	}
	void setrunningtime(int runningtime) {
		this.runningTime = runningtime;
	}
	int getrunningtime() {
		return this.runningTime;
	}
	
 }
}
