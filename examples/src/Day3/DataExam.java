package Day3;

public class DataExam {
	public static void main(String[] args) {
	
		System.out.println("====object 1 ====");
		Data d1 = new Data();
		d1.printInfo();
		
		System.out.println("====object 2 ====");
		Data d2 = new Data();
		d1.printInfo();
		
		System.out.println("====object 3 ====");
		Data d3 = new Data();
		d1.printInfo();
}
}


//출력값
//====object 1 ====
//번호=1
//카운트=1
//====object 2 ====
//번호=1
//카운트=2
//====object 3 ====
//번호=1
//카운트=3