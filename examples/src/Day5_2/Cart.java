package Day5_2;

import java.text.DecimalFormat;

public class Cart {

	String category;
	String title;
	String writer;
	String publisher;
	int price;
	String number;
	String name;
	String id;
	String grade;
	int point;
	String product;
	String color;
	String company;
	String material;
	String size;
	
	int shirtsSum;
	int booksSum;

	private Member member;
	private Book[] bookArray;
	private Shirt[] shirtArray;
	DecimalFormat df = new DecimalFormat("#,###");

	public Cart(Member member, Book[] bookArray, Shirt[] shirtArray) {
		this.member = member;
		this.bookArray = new Book[bookArray.length];
		this.bookArray = bookArray;
		this.shirtArray = new Shirt[shirtArray.length];
		this.shirtArray = shirtArray;

	}

	public void printBooksExpense() {
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum = sum + bookArray[i].price;
		}
		System.out.println("도서 총 금액 : " + df.format(sum));
	}

	public void printBooksInfo() {
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println(i + 1 + ".");
			System.out.println("분야= " + bookArray[i].category);
			System.out.println("제목= " + bookArray[i].title);
			System.out.println("저자= " + bookArray[i].writer);
			System.out.println("출판사= " + bookArray[i].publisher);
			System.out.println("가격= " + df.format(bookArray[i].price));
			System.out.println("isbn= " + bookArray[i].number);
		}
		System.out.println("*  구매수 :" + bookArray.length + "권");
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum = sum + bookArray[i].price;
		}
		System.out.println("*  구매액 :" + df.format(sum) + "원");
	}

	public void printBooksInfoByCategory(String category) {

		int n = 1;
		int booksSum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].category.equals(category)) { // 배열이 도는동안 category와 동일한 것만 출력 하고 다시돌때 안맞으면 안출력
				System.out.println(n + "."); // *참조형변수(String같은거)는 ==을 쓰게되면 주소를 비교하게 되므로 .equals를 써야함.
				n++; // n이 1인데, 도는동안 만족하는 조건에 +1을 한다. 한바퀴 다 돌면 다시 초기화.
				System.out.println("분야= " + bookArray[i].category);
				System.out.println("제목= " + bookArray[i].title);
				System.out.println("저자= " + bookArray[i].writer);
				System.out.println("출판사= " + bookArray[i].publisher);
				System.out.println("가격= " + df.format(bookArray[i].price));
				booksSum = booksSum + bookArray[i].price;
				System.out.println("isbn= " + bookArray[i].number);
				}
		}

		System.out.println("\n\n*  구매수 :" + (n - 1) + "권");

		System.out.println("*  구매액 :" + df.format(booksSum) + "원");

		if (n == 1) {
			System.out.println("No data avilable");

		}
	}
	
	public void printTotalBooksExpense() {
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum = sum + bookArray[i].price;
			booksSum = sum;
		}
		System.out.println("도서 총 금액 : " + df.format(sum)+"(원)");
		
	}
	
	
	public void printShirtsInfo() {
		for(int i = 0; i<shirtArray.length; i++) {
			System.out.println((i + 1) + "." );
			System.out.println("상품명 : " + shirtArray[i].product);
			System.out.println("색상 : " + shirtArray[i].color);
			System.out.println("제조사 : " + shirtArray[i].company);
			System.out.println("소재 : " + shirtArray[i].material);
			System.out.println("크기 : " + shirtArray[i].size);
			System.out.println("가격 : " + df.format(shirtArray[i].price) + "(원)");
	
			
		
			
		}
		System.out.println("\n\n*  구매수 : " + shirtArray.length + "(벌)");
			int sum = 0;
			for(int i =0; i<shirtArray.length;i++) {
				sum = sum + shirtArray[i].price;
			shirtsSum = sum;
		}
			System.out.println("*  구매액 : " + df.format(shirtsSum) + "(원)");
			
		
	}
	public void printTotalExpense() {
		
		System.out.println("\n지불 총 금액 : " + df.format(shirtsSum + booksSum) + "(원)");	
	}

	public void printCartInfo() {
		
		System.out.println("----\nBooks Info----");
		printBooksInfo();
		System.out.println("----\nShirt Info----");
		printShirtsInfo();
		System.out.println("----\nTotal Info----");
		
		System.out.println("*구매수 : ");
		System.out.println("\t책 :" + bookArray.length +" (권)" +"\n\t셔츠 :" + shirtArray.length + "(벌)");
		System.out.println("* 구매액 총합 :" + df.format(shirtsSum+ booksSum));
		
	}
	
	public void printGiftYn() {
		if((shirtsSum+ booksSum)> 200000) {
			System.out.println("사은품여부 : true");
		}else {
			System.out.println("사은품여부 : false");	
		}
	}
	
	public void buy(boolean pointUseYn) {
		
		System.out.println("====[영수증]====");
		System.out.println("\n----고객----");
		System.out.println("아이디 : " + member.id);
		System.out.println("이름 : " + member.name);
		System.out.println("등급 : " + member.grade);
		System.out.println("\n----구매내역----");
		System.out.println("도서");
		for(int i =0; i<bookArray.length;i++) {
			System.out.print("\t" + (i+1)+".");
			System.out.println(bookArray[i].title+"  "+df.format(bookArray[i].price) + "(원)");	
		}
		
		System.out.println("셔츠");
		
		for(int i =0; i<shirtArray.length; i++) {	
			System.out.print("\t" + (i+1)+".");
			System.out.println(shirtArray[i].product+"  "+df.format(shirtArray[i].price) + "(원)");
		}
	System.out.println("----구매금액----");
	System.out.println("도서 :" + df.format(booksSum));
	System.out.println("셔츠 :" + df.format(shirtsSum));
	System.out.println("총액 :" + df.format(booksSum +shirtsSum));
	
	System.out.println("\n----결제금액----");
	if(pointUseYn == true) {
	System.out.println("포인트 사용 :" + member.point);
	System.out.println("결제금액 : " + df.format(booksSum +shirtsSum -member.point));
	}else {
		System.out.println("결제금액 : " + df.format(booksSum +shirtsSum));
		
	System.out.println("\n----포인트----");
	System.out.println("현재 포인트 :" + member.point);
	if(member.grade == "S") {
		System.out.println("신규포인트 : " + df.format((booksSum +shirtsSum)*0.03));
	}else if(member.grade == "A") {
		System.out.println("신규포인트 : " + df.format((booksSum +shirtsSum)*0.02));
	
	System.out.println("누적 포인트:" +df.format( member.point + (booksSum +shirtsSum)*0.03) );
		
	}
	
		
	}
	
		

		
		
		
		
		
		
		
		
	}
	
}
