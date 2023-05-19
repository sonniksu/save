package Day2; // 반복1

public class Shirt {
	
	//필드
	String name;
	String color;
	String company;
	String materials;
	String size;
	int price;
	
	//클래스 호출 .(기본생성자)
	public Shirt() {
		
		
	}
	public Shirt(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public Shirt(String name, String color, String company, String matarials, String size, int price) {
		this.name = name;
		this.color = color;
		this.company=company;
		this.materials=matarials;
		this.size=size;
		this.price=price;
	}
	//메소드를 불러오기 위헤 선언 = 메스드 선언
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setCompany(String company) {
		this.company=company;
	}
	public void setMaterials(String materials) {
		this.materials=materials;
	}
	public void setSize(String size) {
		this.size=size;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void printInfo() {
		System.out.println("====Shirt Info====");
		System.out.println("이름 :" + name);
		System.out.println("컬러 :" + color);
		System.out.println("회사 :" + company);
		System.out.println("소재 :" + materials);
		System.out.println("사이즈 :" + size);
		System.out.println("가격 :" + price);
	}
}
