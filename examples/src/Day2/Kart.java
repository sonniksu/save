package Day2;

public class Kart {

	String name;
	String color;
	int currentSpeed;
	int upSpeed;
	int downSpeed;
	int maxSpeed;
	int boostSpeed;
	int remainBoost;
	int maxBoost;

	String Cheet;

	public Kart(String Cheet) {
		this.Cheet = Cheet;
		this.name = "버스트";
		this.color = "(Green)";
		this.upSpeed = 40;
		this.downSpeed = 80;
		this.maxSpeed = 150;
		this.boostSpeed = 100;
		this.remainBoost = 0;
		this.maxBoost = 1;
	}

	public void printKartInfo() {
		System.out.println("====Kart Info====");
		System.out.println("[" + Cheet + "]");
		System.out.println("SpeedUp 증가 속도 :" + upSpeed + "(km)");
		System.out.println("speedDown 감소 속도 :" + downSpeed + "(km)");
		System.out.println("카트 최대 속도 :" + maxSpeed + "(km)");
		System.out.println("부스터 사용시 증가 속도" + boostSpeed + "(km)");
		System.out.println("부스터 최대 개수 :" + maxBoost + "(개)");

	}

	public void speedUP() {
		if (currentSpeed + upSpeed <= maxSpeed)
			currentSpeed += upSpeed;
		else
			currentSpeed = maxSpeed;
		System.out.println("[" + Cheet + "]" + "speedUp | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost + "(개)");
	}

	public void pickUpBooster() {
		if (remainBoost < 1) {
			// remainBoost = remainBoost+1;
			remainBoost += 1;
			System.out.println(
					"[" + Cheet + "]" + "pickUpBooster | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost + "(개)");
		} else {
			remainBoost = 1;

			System.out.println("[" + Cheet + "]" + "pickUpBooster | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost
					+ "(개)" + "| 부스터를 더이상 사용할 수 없습니다");
		}

	}

	public void useBooster() {
//		if (currentSpeed + boostSpeed >=maxSpeed ) {
//		
//			currentSpeed = 150;
//			remainBoost -=0;
//			System.out.println(
//					"[" + Cheet + "]" + "useBooster | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost + "(개)");
//
//		} else {
//			remainBoost = 0;
//			System.out.println("[" + Cheet + "]" + "useBooster | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost
//					+ "(개)" + "| 부스터를 더이상 사용할 수 없습니다");
//		}
		if(remainBoost==1) {
			remainBoost -=1;
			if(currentSpeed + boostSpeed >=maxSpeed) {
				currentSpeed = 150;
			System.out.println("[" + Cheet + "]" + "useBooster | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost + "(개)");
			}
		}else { 
			remainBoost=0;
			System.out.println("[" + Cheet + "]" + "useBooster | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost
				+ "(개)" + "| 부스터를 더이상 사용할 수 없습니다");
		}
	}

	public void speedDown() {
		if (currentSpeed - downSpeed >= 0)
			currentSpeed -= downSpeed;
		else
			currentSpeed = 0;
		System.out
				.println("[" + Cheet + "]" + "speeddown | 속도 :" + currentSpeed + "(km) | 부스터 :" + remainBoost + "(개)");
	}

}
