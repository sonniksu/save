package Ch07;

public class Bus extends Car {
	private int seat = 0;
	
	Bus(){
		System.out.println("Bus~");
	}
	Bus(int wheel,int speed){
		super(wheel,speed);
	}
	Bus(int wheel,int speed,int seat){
		super(wheel,speed);
		this.seat=seat;
	}
	public int getSeat() {
		return seat;	
	}
	public void setSeat(int seat) {
		this.seat=seat;
	}
	
	@Override
	public void setSpeed(int speed) {
		
		if(speed<=120)
			super.setSpeed(speed);
		else
			super.setSpeed(120);
	}
	@Override
	public String toString() {
		return "Bus!";
	}
	
	
	

}
