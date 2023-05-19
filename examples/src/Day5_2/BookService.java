package Day5_2;

public class BookService {
	
	public static Book makeBook(String category, String title,String writer, String publisher, int price, String number) {
		return new Book(category,title,writer,publisher, price,number);
	}
}
