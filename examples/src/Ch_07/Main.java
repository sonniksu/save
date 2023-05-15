package Ch_07;

public class Main{
	public static void main(String[]args) {
		Car car = new Car();
		Bus bus = new Bus(4);
		Truck truck = new Truck(4,80);
		Sedan sedan =new Sedan(4,150,"convertable");
		
		System.out.println(car);
		System.out.println(bus);
		System.out.println(truck);
		System.out.println(sedan);
		
		Sedan[]sedanArray=new Sedan[10];
		for(int i=0;i<sedanArray.length;i++) {
			sedanArray[i]=new Sedan(4,i*10);
		}
		for(Sedan s:sedanArray)
			System.out.print(s.getSpeed()+"");
		
		//method overriding
		System.out.println();
		bus.setSpeed(300);
		System.out.println(bus.getSpeed());
		
		//polymorphism
		Car truck2=new Truck(4,100,5);
		System.out.println(truck2.getWheel()+""+truck2.getSpeed());
		Truck truck3=(Truck)truck2;
		System.out.println(truck3.getWheel()+""+truck3.getSpeed()+""+truck3.getWeight());
	}
}
