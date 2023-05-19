package Day3;
//생성자도 this쓸수있다.

public class Movie{
	String name;
	String category;
	String director;
	int runningTime;
	
	public Movie() {

	}
	public Movie(String name) {
		this.name=name;
	}
	public Movie(String name, String category) {
		this.name=name;
		this.category = category;
	}
	public Movie(String name, String category, String director) {
		this.name=name;
		this.category=category;
		this.director=director;
	}
	public Movie(String name, String category, String director, int runningTime) {
		this.name=name;
		this.category=category;
		this.director=director;
		this.runningTime=runningTime;
	}
//	
//	public void name(String name) {
//		this.name = name;
//	}
//	public void category(String category) {
//		this.category=category;
//	}
//	public void director(String director) {
//		this.director=director;
//	}
//	public void runningTime(int runningTime){
//		this.runningTime=runningTime;
//	}
	
	public void printInfo() {
		System.out.println("제목 : " + name);
		System.out.println("분류 : " + category);
		System.out.println("감독 : " + director);
		System.out.println("상영시간 : "+ runningTime);
	}
	
	
}

































//public class Movie {
//	
//	String name;
//	String category;
//	String director;
//	int runningTime;
//	Actor actor;
//	
//		
//
//	public Movie(){
//	}
//	public Movie(String name){
//		this.name=name;
//	}
//	public Movie(String name, String category){
//		this(name); //생성자 this
//		this.category=category;
//	}
//	public Movie(String name, String category, String director){
//		this(name,category);
//		this.director=director;
//	}
//	public Movie(String name, String category, String director, int runningTime){
//		this(name,category,director);
//		this.runningTime = runningTime;
//	}
//	public Movie(String name, String category, String director, int runningTime, Actor actor){
//		this(name,category,director,runningTime);
//		this.actor=actor;
//	}
//	
//	public void Name(String setname) {
//		this.name = setname;
//	}
//	public void Category(String category) {
//		this.category = category;
//	}
//	public void director(String director) {
//		this.director = director;
//	}
//	public void runningTime(int runningTime) {
//		this.runningTime = runningTime;
//	}
//	public void actor(Actor actor) {
//		this.actor = actor;
//	}
//		
//	public void printInfo() {
//		System.out.println("====Movie Info====");
//		System.out.println("제목 = " + name);
//		System.out.println("카테고리 =" + category);
//		System.out.println("감독 =" + director);
//		System.out.println("상영시간 = " + runningTime);
//		
//		
//	}
//}
