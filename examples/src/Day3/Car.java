package Day3;

public class Car {

	String name;
	String color;
	int door;
	int maxSpeed;

	
	public Car(String name, Company company, String color, int door, int maxSpeed){
		this.name = name;
		this.color = color;
		this.door = door;
		this.maxSpeed = maxSpeed;
		
	}
	
	
	
	public void printInfo() {
		System.out.println("자동차명 = "+ name);
		System.out.println("색상= "+ color);
		System.out.println("문개수 = "+ door);
		System.out.println("최대속력 = " + maxSpeed);
	}
}
