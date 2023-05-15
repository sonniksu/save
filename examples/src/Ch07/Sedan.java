package Ch07;

public class Sedan extends Car {
	
	private String roof = null;
	
	Sedan(){
		System.out.println("sedan");
	}
	
	Sedan(int wheel, int speed){
		super(wheel,speed);
	}
	
	Sedan(int wheel, int speed, String roof){
		super(wheel, speed);
		this.roof= roof;
		
	}
	
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof=roof;
	}
	
	@Override
	public String toString() {
		return "Sedan¼¼´Ü!";
	}
	
	@Override
	public void setSpeed(int speed) {
		if(speed<=200)
			super.setSpeed(speed);
		else
			super.setSpeed(200);
	}
}
