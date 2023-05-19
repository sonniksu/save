package Day2; //반복 1회

public class Pay {

	int pay;
	
	public Pay(int pay) {
		this.pay=pay;
		
	}
	public int getDayPay() {
		return(pay*8);
	}
	public int getWeekPay() {
		return this.getDayPay() * 5;  //메서드 자체를 가져와야함. (daypay*8)은 값이 나올 수 없음
//	   =return (pay*8*5);
	}
	public int getYearPay() {
		return this.getWeekPay()*52;
//     =return (pay*8*5*52);
//	 return(weekpay*52);는 안됨.
	
		
	}
}















	
	

	

