package Ch07;

public class Truck extends Car {

	private int weight = 0;

	Truck() {
		System.out.println("Truck~");
	}

	Truck(int wheel, int speed) {
		super(wheel, speed);
	}
	Truck(int wheel, int speed,int weight) {
		super(wheel, speed);
		this.weight = weight;
	} 

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

@Override
public String toString(){
	return"Truck";
}
}
