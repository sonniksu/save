package Ch07;

import java.io.InterruptedIOException;

public class Car3Ex {
	
	public static void main(String[]args) {
		
		Bus b = new Bus();
		Truck t = new Truck();
		Sedan s = new Sedan();
		
		Bus b2 = new Bus(4,100);
		Truck t2 = new Truck(4,200);
		Sedan s2 = new Sedan(4,300);

		Bus b3 = new Bus(4,100,45);
		Truck t3 = new Truck(4,200,3);
		Sedan s3 = new Sedan(4,300,"있음");

		System.out.println("-------------------------");
		
		Bus[]bus = new Bus[20];
		for(int i =0; i<bus.length;i++) {
			bus[i]=new Bus(4,100,i*5);
		}
		
		Truck[]truck = new Truck[5];
		for(int i =0; i<truck.length;i++) {
			truck[i]=new Truck(4,200,i);	
	}
		Sedan[]sedan = new Sedan[10];
		for(int i =0; i<sedan.length;i++) {
			sedan[i]=new Sedan(4,300,"있음");
		}
		System.out.println("-------------------------");
		
		System.out.println(b.getSpeed());
		System.out.println(t.getSpeed());
		System.out.println(s.getSpeed());
		
		System.out.println("-------------------------");
		
		b.setSpeed(20);
		System.out.println(b.getSpeed());
		b.setSpeed(150);
		System.out.println(b.getSpeed());
		System.out.println("-------------------------");
		t.setSpeed(120);
		System.out.println(t.getSpeed());
		System.out.println("-------------------------");
		
	
		
		
	}
	}
