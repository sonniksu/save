package Day5;

import java.text.DecimalFormat;

public class BookStore {

	String category;
	String title;
	String writer;
	String publisher;
	int price;
	String number;
	Book[] bookArray;
	DecimalFormat df = new DecimalFormat("#,###");

	public BookStore(Book[] bookArray) {
		this.bookArray = new Book[bookArray.length];
		this.bookArray = bookArray;
	}

	public void printBookStore() {
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println(i + 1 + ".");
			System.out.println("분야= " + bookArray[i].category);
			System.out.println("제목= " + bookArray[i].title);
			System.out.println("저자= " + bookArray[i].writer);
			System.out.println("출판사= " + bookArray[i].publisher);
			System.out.println("가격= " + df.format(bookArray[i].price));
			System.out.println("isbn= " + bookArray[i].number);
		}

	}

	public void printBooksByCategory(String category) {
		int n = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].category.equals(category)) { // 배열이 도는동안 category와 동일한 것만 출력 하고 다시돌때 안맞으면 안출력
				n++;
				System.out.println(n + "."); // *참조형변수(String같은거)는 ==을 쓰게되면 주소를 비교하게 되므로 .equals를 써야함.
				 // n이 1인데, 도는동안 만족하는 조건에 +1을 한다. 한바퀴 다 돌면 다시 초기화.
				System.out.println("분야= " + bookArray[i].category);			
				System.out.println("제목= " + bookArray[i].title);
				System.out.println("저자= " + bookArray[i].writer);
				System.out.println("출판사= " + bookArray[i].publisher);
				System.out.println("가격= " + df.format(bookArray[i].price));
				System.out.println("isbn= " + bookArray[i].number);
				
			}
		}
	}
	

	public void printBooksByIsbn(String isbn) {
		int j = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].number.equals(isbn)) {
				System.out.println(j + ".");
				j++;
				System.out.println("분야= " + bookArray[i].category);
				System.out.println("제목= " + bookArray[i].title);
				System.out.println("저자= " + bookArray[i].writer);
				System.out.println("출판사= " + bookArray[i].publisher);
				System.out.println("가격= " + df.format(bookArray[i].price));
				System.out.println("isbn= " + bookArray[i].number);
			}
		}
		if (j == 1)
			System.out.println("No data avilable");
	}

	public void printBookByTitleLike(String title) {
		int j = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].title.contains(title)) { // contains = title이 포함되면 true
				System.out.println(j + ".");
				j++;
				System.out.println("분야= " + bookArray[i].category);
				System.out.println("제목= " + bookArray[i].title);
				System.out.println("저자= " + bookArray[i].writer);
				System.out.println("출판사= " + bookArray[i].publisher);
				System.out.println("가격= " + df.format(bookArray[i].price));
				System.out.println("isbn= " + bookArray[i].number);
			}
		}
		if (j == 1)
			System.out.println("No data avilable");
	}

	public void printBooksByMaxPrice(int maxprice) {
		int j = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].price <= (maxprice)) {
				System.out.println(j + ".");
				j++;
				System.out.println("분야= " + bookArray[i].category);
				System.out.println("제목= " + bookArray[i].title);
				System.out.println("저자= " + bookArray[i].writer);
				System.out.println("출판사= " + bookArray[i].publisher);
				System.out.println("가격= " + df.format(bookArray[i].price));
				System.out.println("isbn= " + bookArray[i].number);
			}
		}
		if (j == 1)
			System.out.println("No data avilable");
	}

	public void printBooksByMinPrice(int minprice) {
		int j = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].price >= (minprice)) {
				System.out.println(j + ".");
				j++;
				System.out.println("분야= " + bookArray[i].category);
				System.out.println("제목= " + bookArray[i].title);
				System.out.println("저자= " + bookArray[i].writer);
				System.out.println("출판사= " + bookArray[i].publisher);
				System.out.println("가격= " + df.format(bookArray[i].price));
				System.out.println("isbn= " + bookArray[i].number);
			}
		}
		if (j == 1)
			System.out.println("No data avilable");
	}

	public void printBooksByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
		int j = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].price >= (betweenMinPrice) && bookArray[i].price <= (betweenMaxPrice)) {

				System.out.println(j + ".");
				j++;
				System.out.println("분야= " + bookArray[i].category);
				System.out.println("제목= " + bookArray[i].title);
				System.out.println("저자= " + bookArray[i].writer);
				System.out.println("출판사= " + bookArray[i].publisher);
				System.out.println("가격= " + df.format(bookArray[i].price));
				System.out.println("isbn= " + bookArray[i].number);
			}
		}
		if (j == 1)
			System.out.println("No data avilable");
	}

}
