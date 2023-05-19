package Day4;

public class PersonArrayExam {

	public static void main(String[] args) {
		
		//선언
		Person[] personArray;
		//person 클래스 만들어 줘야함
		
		//생성자
		personArray = new Person[3];
		
		//Initializatin
		//1.
		personArray[0] = new Person();
		personArray[0].setName("Hong");
		personArray[0].setAge(25);
		//2.
		personArray[1] = new Person("Lee", 40);
		
		//3.
		Person p = new Person("Park", 35);
		personArray[2] = p;
		
		//output
		personArray[0].printInfo();
		personArray[1].printInfo();
		personArray[2].printInfo();
		
		//output. length
		int arrayLength = personArray.length;
		System.out.println("배열길이 = " + arrayLength);
		
		System.out.println("\n==== for() ====");
		for(int i = 0; i < personArray.length; i++) {
			System.out.print("personArray[" + i +"]");
			personArray[i].printInfo();
		}
		
		
	}
}
