package Ch07;

public class MovieExam {
	
	public static void main(String[] args) {
		
		System.out.println("====Movie Info====");
		
		String title = "탑건 매버릭";
		String category = "액션";
		String director = "조셉 코신스키";
		int runningTime = 130;
		String actor = "톰 크루즈";
		
		Movie m = new Movie(title, category, director, runningTime, actor);
		m.printInfo();
	}

}
