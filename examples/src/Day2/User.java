package Day2; //반복 1회

public class User {
	String name;
	int age;
	float height;
	char sex;
	boolean marriageYn;
	
	
	public User() {
}
	public User(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex= sex;
	}
	public User(String name, int age, char sex, float height, boolean marriageYn) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.height=height;
		this.marriageYn=marriageYn;
	}
	
	public void setName(String name) { //만약 private를 붙인다면 메인에서 접근할 수 없기때문에 set(즉 메소드로 필드값에 접근하기 위함이다)
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setHeight(float height) {
		this.height=height;
	}
	public void setSex(char sex) {
		this.sex=sex;
	}
	public void setMarriageYn(boolean marriageYn) {
		this.marriageYn=marriageYn;
	}
	
	public void printInfo() {
		System.out.println("====UserInfo====");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("신장 : "+ height);
		if(marriageYn == true) {
			System.out.println("결혼여부 : true");
		}else {
			System.out.println("결혼여부 : false");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//public class User {
//	String name;
//	int age;
//	float height;
//	char sex;
//	boolean marriageyn;
//
//	public User() {
//		
//	}
//
//	public User(String name, int age, char sex) {
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//	}
//
//	public User(String name, int age, char sex, float height, boolean marriageyn) {
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//		this.height = height;
//		this.marriageyn = marriageyn;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setHeight(float height) {
//		this.height = height;
//	}
//	public void setSex(char sex) {
//		this.sex = sex;
//	}
//	public void setMarriageYn(boolean marriageyn) {
//		this.marriageyn = marriageyn;
//	}
//	
//	
//	
//	public void printInfo() {
//		System.out.println("====UserInfo====");
//		System.out.println("이름: " + name);
//		System.out.println("나이 : "+ age);
//		System.out.println("성별 : "+ sex);
//		System.out.println("결혼여부 : " + marriageyn);
//	}
//
//}
