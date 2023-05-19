package Day1;

public class MovieExam { //프로그램을 돌리면 메인부터 실행한다.

	
	public static void main(String[] args) {
		
		Movie movie = new Movie(); // Movie클래스로 movie라는 객체를 만든것(인스턴스)            Movie 클래스명     movie객체이름(변수)   Movie() 기본생성자      
		
		System.out.println("====Field====");
		movie.settitle("탑건 매버릭");
		System.out.println(movie.gettitle()); //(소문자)로 시작하고()붙으면 메소드  ex) movie() 메소드
 		
		movie.setcategory("액션");
		System.out.println(movie.getcategory());
		
		movie.setdirector("조셉 코신스키");
		System.out.println(movie.getdirector());
		
		movie.setrunningtime(132);
		System.out.println(movie.runningTime);
	}
	

}
