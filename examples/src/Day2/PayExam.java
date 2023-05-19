package Day2;

public class PayExam {
	public static void main(String[] args) {
		
		int hourPay = 9620; //시급
		Pay p = new Pay(hourPay);
		
		System.out.println("\n======하루 급여=======");
		//하루 8시간 근무
		int dayPay = p.getDayPay();
		System.out.println("급여=" + dayPay);
		
		System.out.println("\n====주 급여====");
		// 주 5일 근무
		int weekPay = p.getWeekPay();
		System.out.println("급여=" + weekPay);
		
		System.out.println("\n====연 급여====");
		//년 52주 근무
		int yearPay = p.getYearPay();
		System.out.println("급여=" + yearPay);
	}
}
