package Day2; //반복1

public class Calculator {

	private int num1;
	private int num2;

	public Calculator(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}

	public void plus() {
		System.out.println("plus()::" + num1 + "+" + num2 + "=" + (num1 + num2));
	}

	public void minus() {
		System.out.println("minus()::" + num1 + "-" + num2 + "=" + (num1 - num2));

	}

	public void multiply() {
		System.out.println("multiply()::" + num1 + "*" + num2 + "=" + num1 * num2);

	}

	public void divide() {
		System.out.println("divide()::" + num1 + "/" + num2 + "=" + num1 / num2);
	}

	public void rest() {
		System.out.println("rest()::" + num1 + "%" + num2 + "=" + num1 % num2);

	}

	public void printInfo() {
		System.out.println("====print====");
		System.out.println("val1=" + num1 + "val2=" + num2);
	}

	public void clear() {
		this.num1 = 0;
		this.num2 = 0;

	}
}
//	private int val1;
//	private int val2;
//	
//	public Calculator(int a,int b) {
//		this.val1=a;
//		this.val2=b;
//	}
//	public void plus() {
//		System.out.println("plus()::" + val1 +"+" +val2 + "="+ (val1 + val2));
//	}
//
//	public void minus() {
//		System.out.println("minus()::" + val1 +"-" +val2 + "="+ (val1 - val2));
//
//	}
//
//	public void multiply() {
//		System.out.println("multiply()::" + val1 +"*" +val2 + "="+ (val1 * val2));
//	}
//
//	public void divide() {
//		System.out.println("divide()::" + val1 +"/" +val2 + "="+ (val1 / val2));
//	}
//
//	public void rest() {
//		System.out.println("rest()::" + val1 +"%" +val2 + "="+ (val1 % val2));
//	}
//	public void printInfo() {
//		System.out.println("=== print ===");
//		System.out.println("val1="+val1 + "val2=  "+val2);
//	}
//	public void clear() {
//		this.val1=0;
//		this.val2=0;
//	}
//}