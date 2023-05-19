package Ch_07;
//_01_class에서 만들 자료들을 한꺼번에 관리하고자 blackbox파일을 만든것임

public class Blackbox {
	String modelName;
	String resolution;
	int price;
	String color;          //4개의 인스턴스 변수/필드를 가지게 된 것이다.
							//설계도일 뿐임

	static boolean canAutoReport = false; // static은 클래스 변수이다. 
	 										//자동신고기능
	
	
	void autoReport() {       //자동신고기능 메소드 (_04_)
		if (canAutoReport) {
			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
		}
		else {
			System.out.println("자동 신고 기능이 지원되지 않습니다.");
		}
	}
	
	void insertMemoryCard(int capacity) {
		System.out.println("메모리 카드가 삽입되었습니다");
		System.out.println("용량은" + capacity + "GB입니다.");
	}
	
	
	int getVideoFileCount(int type) {
		if(type == 1) { //일반영상
			return 9;
		}
		else if(type ==2) {  //이벤트 영상
			return 1;
		}
		return 10;
	}
	
}
