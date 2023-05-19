package Day2;

public class KartExam {
	public static void main(String[] args) {
		
		Kart kart = new Kart("버스트,(Green)");
		
		System.out.println("========Ready========");
		kart.printKartInfo();
		
		System.out.println("\n======Run======");
		kart.speedUP();
		kart.speedUP();
		kart.pickUpBooster();
		kart.pickUpBooster();
		kart.useBooster();
		kart.useBooster();
		kart.speedDown();
		kart.speedDown();
	}

}
