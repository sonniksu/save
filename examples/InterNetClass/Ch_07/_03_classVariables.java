package Ch_07;
//클래스 변수
public class _03_classVariables {
	public static void main(String[] args) {
		
		Blackbox b1 = new Blackbox();
		b1.modelName = "까망이";
		System.out.println(b1.modelName);
		
		Blackbox b2 = new Blackbox();
		b2.modelName = "하양이";
		System.out.println(b2.modelName);
		
		//특정범위를 초과하는 충동감지시 자동 신고 기능 개발 여부
		
		System.out.println("개발 전");
		System.out.println(b1.modelName + "자동신고기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + "자동신고기능 : " + b2.canAutoReport); // 블랙박스 클래스의 클래스 변수가  false라 그럼
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + Blackbox.canAutoReport);
		
		//기능 개발
		Blackbox.canAutoReport = true;
		
		System.out.println("개발 전");
		System.out.println(b1.modelName + "자동신고기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + "자동신고기능 : " + b2.canAutoReport); // 블랙박스 클래스의 클래스 변수가  false라 그럼
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + Blackbox.canAutoReport);
	}

}
