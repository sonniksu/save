package Day2;

public class ReportCardExam {
	public static void main(String[] args) {
		
		System.out.println("\n====object 1 ====");
		int korean1 = 96;
		int english1 = 82;
		int math1 = 78;
		
		//생성자 호출
		ReportCard rc1 = new ReportCard("Victoria", korean1, english1, math1);
		
		//
		int sum1 = rc1.sum();  //메소드 안에 sum이라는 것이 있다는 걸 정의 해준것 / 위치는 어디든 상관없음. 메인이 아니어도 됨.
		System.out.println("sum=" + sum1 );
		int average1 = rc1.average();
		System.out.println("average=" + average1 );
		char hakjum1 = rc1.hakjum();
		System.out.println("hakjum=" + hakjum1 );
		
		rc1.printInfo();
		
		System.out.println("\n====object2====");
		int korean2 = 88;
		int english2 = 100;
		int math2 = 92;
		
		//생성자 호출( 클래스 초기화)
		ReportCard rc2 = new ReportCard("paige"); //rc2는 이름: paige 국어:0, 수학:0, 영어:0//클래스 초기화
		rc2.setKorean(korean2); //이름: paige 국어 88 수학 0 영어 0
		rc2.setEnglish(english2);
		rc2.setMath(math2);
		
		int sum2 = rc2.sum();
		System.out.println("sum=" + sum2);
		int average2 = rc2.average();
		System.out.println("average=" + average2);
		char hakjum2 = rc2.hakjum();
		System.out.println("hakjum=" + hakjum2);
		
		rc2.printInfo();
		}
	}

