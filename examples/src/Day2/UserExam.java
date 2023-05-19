package Day2;

public class UserExam {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("James");
		u1.setAge(30);
		u1.setHeight(178.5F);
		u1.setSex('M');
		u1.setMarriageYn(true);
		u1.printInfo();


		User u2 = new User ("paige", 25, 'W');
		u2.setHeight(175.2F);
		u2.setMarriageYn(true);
		u2.printInfo();
		
		User u3 = new User("Victoria", 30, 'W', 180.0f, false);
		u3.printInfo();
	
	}
}

//출력값
//====UserInfo====
//이름: James
//나이 : 30
//성별 : M
//결혼여부 : true
//====UserInfo====
//이름: paige
//나이 : 25
//성별 : W
//결혼여부 : true
//====UserInfo====
//이름: Victoria
//나이 : 30
//성별 : W
//결혼여부 : false
