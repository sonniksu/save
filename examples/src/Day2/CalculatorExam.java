package Day2;

public class CalculatorExam {
	public static void main(String[] args) {

		Calculator cal = new Calculator(10, 6);

		cal.plus();
		cal.minus();
		cal.multiply();
		cal.divide();
		cal.rest();

		cal.printInfo();
		cal.clear(); // 값을 0으로 만듦
		cal.printInfo();

	}
}


//출력값
//plus()::10+6=16
//minus()::10-6=4
//multiply()::10*6=60
//divide()::10/6=1
//rest()::10%6=4
//=== print ===
//val1=10val2=  6
//=== print ===
//val1=0val2=  0