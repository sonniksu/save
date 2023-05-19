package Day4_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

public class OrderManager {
	
	private Menu[] order; // 선언

	public OrderManager(Menu[] order) {
		this.order = new Menu[order.length]; // 메모리 공간할당. 필수ㄹ 있어야함
		this.order = order;
		
	}

	public void printReceipt() {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		DecimalFormat df = new DecimalFormat("#,###");
		int sum=0;
		System.out.println("==== [영수증] ====");
		System.out.println("\n\n\n----주문시간----");
		System.out.println(sdf.format(now));
		System.out.println("n\n\n----주문상세----");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1));
			System.out.println(" . 메뉴 =" + order[i].name + " |" + "가격=" + df.format(order[i].price));
			sum+=order[i].price;
		}
		System.out.println(df.format(sum));

	}
}