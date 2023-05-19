package Day3;

public class Singer {

	
	String name;
	char sex;
	String birthDate;
	String company;
	Singer singer;
	
	
	public Singer(String name, char sex, String birthDate, String company) {
		this.name=name;
		this.sex=sex;
		this.birthDate=birthDate;
		this.company=company;
		
	}
	public void printInfo() {
		System.out.println("이름 = " + name);
		System.out.println("성별 = "+ sex);
		System.out.println("생년월일 = " + birthDate);
		System.out.println("소속사 = "+ company);
		
		
	}
	
}
