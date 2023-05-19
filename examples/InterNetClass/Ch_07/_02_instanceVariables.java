package Ch_07;
//인스턴스 변수
public class _02_instanceVariables {
	public static void main(String[] args) {
		Blackbox b1 = new Blackbox();
		b1.modelName = "까망이";
		b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "블랙";
		
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		
		//새로운 블랙박스 제품
		
		Blackbox b2 = new Blackbox();
		b2.modelName = "하양이";
		b2.resolution = "UHD";
		b2.price = 300000;
		b2.color = "화이트";
		
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);
		
		//블랙박스 클래스에 만들어진 인스턴스 변수때문에 가능함.
	}
}
