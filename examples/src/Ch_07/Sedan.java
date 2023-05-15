package Ch_07;

public class Sedan extends Car{
	private String roof;
	
	public Sedan() {super();}
	public Sedan(int wheel){super(wheel);}
	public Sedan(int wheel,int speed) {super(wheel,speed);}
	public Sedan(int wheel,int speed,String roof) {
		super(wheel,speed);
		this.roof=roof;
	}
	public void setRoof(String roof) {
		this.roof=roof;
	}
	public String getRoof() {
		return roof;
	}
	public String toString() {
		System.out.println("Sedan's toString()");
		return"wheel:"+Integer.toString(this.wheel)+
				"\nspeed:"+Integer.toString(this.speed)+
				"\nroof:"+this.roof;
	}
	public void setSpeed(int speed) {
		if(speed<=200)
			this.speed=speed;
		else this.speed=200;
	}
}
