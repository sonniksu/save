package Day3; //반복 1회
//값이 계속 증가하는 필드(static)
public class Data {
	
	
	static int no;
	static int count;

	public Data() {
		no = no +1;
		count = count +1;
	}
	
	public void printInfo() {
		
		System.out.println("번호=" +no );
		System.out.println("카운트=" + count);
	}
	
	
	
}	
//	private int no;
//	private static int count; //Static 필드 : 누적된다
//	
//	public Data() {
//		no = no + 1;
//		count = count +1;
//	}
//	
//	public void printInfo() {
//		System.out.println("번호="+ no);
//		System.out.println("카운트=" + count);
//	}
//}
