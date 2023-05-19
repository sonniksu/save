package Day4_1;

import java.text.DecimalFormat;

public class DecilamFormatExam {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		
	}
}
