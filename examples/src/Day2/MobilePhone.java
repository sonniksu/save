package Day2; //반복 1회

public class MobilePhone {
	
	
	String company;
	String product;
	String os;
	String color;
	boolean pen;
	int memory;
	int storage;
	int battery;
	

	
	public void printInfo() {
		System.out.println("====Mobile phone Info====");
		System.out.println("회사 : " + company);
		System.out.println("제품 : " + product);
		System.out.println("운영체제 : " + os);
		
		if (this.pen){
			System.out.println("펜 : 지원");
		}else {
			System.out.println("펜 : 미지원");
		}
		System.out.println("메모리 : "+ memory + "GB");
		System.out.println("스트리지 : "+ storage + "GB");
		System.out.println("배터리 : " + battery + "MAH");
	}
	
	
	
	
}




















	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String company;
//	String product;
//	String os;
//	String color;
//	boolean pen;
//	int memory;
//	int storage;
//	int battery;
//	
//	public void printInfo() {
//		System.out.println("====Mobile phone Info====");
//		System.out.println("회사 : "+ company);
//		System.out.println("제품 : "+ product);
//		System.out.println("운영체제 : "+ os);
//		System.out.println("컬러 : "+ color);
//		//System.out.println("펜: "+ (pen?"지원":"미지원"));
//		if(this.pen)
//			System.out.println("펜: 지원");
//		else
//			System.out.println("펜: 미지원");
//		System.out.println("메모리 : "+ memory + "(GB)");
//		System.out.println("스토리지 : "+ storage + "(GB)");
//		System.out.println("배터리 : " + battery + "(mAH)");
//	}
//	
//	
//
//	
//}
