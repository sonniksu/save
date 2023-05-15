package Ch_07;

public class Bus extends Car{
	private int seat;
	
	public Bus() { super();}
	public Bus(int wheel) {super(wheel);}
	public Bus(int wheel,int speed) {super(wheel,speed);}
	public Bus(int wheel,int speed, int seat) {
		super(wheel,speed);
		this.seat=seat;
	}
	
	
	public void setSeat(int seat) {
		this.seat=seat;
	}
	public int getSeat() {
		return seat;
	}
	public String toString(){
		System.out.println("Bus's toString()");
		return "wheel:"+Integer.toString(this.wheel)+
				"\nspeed:"+Integer.toString(this.speed)+
				"\nseat:" + Integer.toString(this.seat);
	}
	public void setSpeed(int speed) {
		if(speed<=120)
			this.speed=speed;
		else this.speed=120;
	}
}
