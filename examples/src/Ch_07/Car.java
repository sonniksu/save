package Ch_07;

public class Car {
	static String company = "Hyundai";
	protected int wheel;
	protected int speed;
	public Car() {
		}
	public Car(int wheel) {
		this.wheel=wheel;
	}
	public Car(int wheel, int speed) {
		this.wheel=wheel;
		this.speed=speed;
	}
	public void setwheel(int wheel) {
		this.wheel=wheel;
	}
	public int getWheel() {
		return wheel;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed(){
		return this.speed;
	}
	public String toString() {
		return "Car's toString()";
	}
	}
	
