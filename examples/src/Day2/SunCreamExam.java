package Day2;
public class SunCreamExam {
	public static void main(String[] args) {
		
		SunCream S1 = new SunCream();
		
		S1.company = "니베아";
		S1.product = "선 페이스 수딩 센서티브 크림";
		S1.sticky = false;
		S1.setSkintype('s');
		S1.amount = 50;
		S1.protect=10;
		
		
		
		S1.printInfo();
				
	}
}



//출력값
//====SunCream Info====
//회사 : 니베아
//제품 : 선 페이스 수딩 센서티브 크림
//끈적임 없음
//피푸타입 : 민감성
//용량 : 50(ml)
//PA : ++++