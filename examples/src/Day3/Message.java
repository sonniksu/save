package Day3; //반복 1회
//메서드 오버로딩
public class Message {
	
	public void printInfo(String s) {
		System.out.println(s);
	}
	public void printInfo(int n) {
		System.out.println(n);
	}
	public void printInfo(String g, int j) {
		System.out.println(g + ", " +j);
	}
	public void printInfo(int r, String t) {
		System.out.println(r + "," + t);
	}
	
}
//	public void printInfo(String s) {  //메소드 공식/ 좀 외워라/ s는 아무거나 넣어도 됨. 변수 값은 생성자 내에서만 쓰기 때문에 다른곳에 중복되도 됨.
//		System.out.println(s);
//	}
//	public void printInfo(int m) {
//		System.out.println(m);
//	}
//	public void printInfo(String s, int m) {
//		System.out.println(s+", "+m);
//	}
//	public void printInfo(int m, String s) {
//		System.out.println(m + ", "+ s);
//	}
//	
//	
//}
