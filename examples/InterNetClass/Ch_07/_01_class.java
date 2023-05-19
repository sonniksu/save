package Ch_07;

public class _01_class {
	public static void main(String[] args) {
		//객체지향 프로그래밍(OOP : object-Oriented-Programing)
		//유지보수 용이
		//재사용성 높음

	//차량용 블랙박스
	//모델명, 해상도, 가격, 색상

		//우리가 만든 첫 제품
		String modelName = "까망이";
		String resolution = "FHD";
		int price = 200000;
		String color = "블랙";
		
		//새로운 제품을 개발
		
		String modelName2 = "하양이";
		String resolution2 = "UHD";
		int price2 = 300000;
		String color2 = "화이트";

		//또다른 제품 개발? -> 클래스 활용 : 서로 다른 자료형이지만, 서로 비슷한 것들 끼리 모아둔 형태
		
		Blackbox bbox = new Blackbox(); //BlackBox 클래스(설계도)로부터 bbox 객체(설계도로 만든 물건)를 생성한 것임,, bbox는 클래스의 인스턴스이다.
	
	
	
	
	}

}
