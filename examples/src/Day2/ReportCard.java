package Day2;//반복 1회

public class ReportCard {

	//필드선언
	int korean;
	int english;
	int math;
	String name;

	//생성자 선언
	public ReportCard() {   //기본생성자인데, 걍 만들어라

	}
	public ReportCard(String name) {     //paige가 혼자 매개값을 받아야하니까 하나짜리 만들어준거다
		this.name=name;
	}
	public ReportCard(String name, int korean, int english, int math) { //매개값 4개 받는애가 있으니까 만들어준거다
		this.name = name;                               
		this.korean = korean;
		this.english = english;
		this.math = math;

	}
	public void setKorean(int korean) {   //세터메소드 설정   매개변수로 받은 값을 필드에 저장하기 위해 setter를 사용.
		this.korean = korean;				//setter 는 밖에있는 값을 필드에 저장하려고. getter는 필드에 저장된 값을 꺼내려고(가져오려고)
		}
	public void setEnglish(int english) {
		this.english = english;
		}
	public void setMath(int math) {
		this.math = math;
		}
	
	public int sum() { // 메소드 선언 양식
		return (korean + english + math);

	}

	public int average() {
		return (sum() / 3);
	}

	public char hakjum() {
		if (average() > 90) {
			return 'A';
		} else if (average() > 80) {
			return 'B';
		} else {
			return 'C';
		}

	}
	public void printInfo() {
		System.out.println("====성적====");
		System.out.println("이름 =" + name);
		System.out.println("국어 =" + korean);
		System.out.println("영어 =" + english);
		System.out.println("수학 =" + math);
		System.out.println("합계 =" + sum());
		System.out.println("평균 =" + average());
		System.out.println("학점 =" + hakjum());
	}
	
}
