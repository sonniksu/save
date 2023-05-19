package Day3;

public class UserExam {
	public static void main(String[] args) {
		
		//생성자 초기화
		String name = "Sonn"; // 이름
		int age = 29; // 나이
		float height = 175.5f; // 키
		char sex = 'm';	//성별. F 여성, M 남성
		boolean marriageYn = false; // 결혼여부
		//디폴트 초기화
		User user = new User(name,age,height,sex,marriageYn);
		
		System.out.println("\n====printInfo()====");
		user.printInfo();
	}
}
