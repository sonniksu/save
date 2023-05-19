package Day1;

public class HakjumSwitchApp {

	public static void main(String[] args) {
		
		//시험점수
		int korean = 48; 
		int english = 92;
		int math = 100;
		System.out.println("국어=" + korean);
		System.out.println("영어=" + english);
		System.out.println("수학=" + math);
		
		int sum = korean + english + math;
		int avg = sum / 3;
		
		System.out.println("합계" + sum);
		System.out.println("평균" + avg);
		System.out.println("학점" + "B");
		
		
		switch(avg/10) {
		case 9 : 
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("F");
			break;
	
	}
	
}
}	