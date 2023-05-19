package Day3;

public class ActorExam {
	
	public static void main(String[] args) {
		
		System.out.println("====Actor Info====");
		String name = "톰크루즈";
		String sex = "남자";
		String birthdate = "1962.07.03";
		String nationality = "미국";
		
		Actor actor = new Actor(name, sex, birthdate, nationality);
		actor.printInfo();

		String director = "조셉";
		String category = "액션";
		String title = "탑건 : 매버릭";
		int runningTime = 132;
		Movie movie = new Movie(title,category,director,runningTime,actor);
		movie.printInfo();
}
}