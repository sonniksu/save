package Ch_07;

public class Truck extends Car{
	private static int wheel;
	private int weight;
	
	public Truck(){super();}
	public Truck(int wheel){super(wheel);}
	
	public Truck(int whell,int speed)
	{super(wheel,speed);}
	
	public Truck(int wheel,int speed,int weight) {
		super(wheel,speed);
		this.weight=weight;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
	public String toString() {
		System.out.println("Truck's toString()");
		return "wheel:"+Integer.toString(this.wheel)+
				"\nspeed:" + Integer.toString(this.speed)+
				"\nweight:"+Integer.toString(this.weight);
	}
	public void setSpeed(int speed) {
		if(speed<=100)
			this.speed=speed;
		else this.speed=100;
	}
}
