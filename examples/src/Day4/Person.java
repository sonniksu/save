package Day4;

public class Person {

	
	private String name;
	private int age;
	
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name =name;
		this.age = age;
	}
	public void printInfo() {
		System.out.println("이름 = " + name +"|"+ "나이 = " + age);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public int getAge() {
		return age;
	
	}
}
