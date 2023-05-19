package Day5_2;


public class ShirtService {

	public static Shirt makeService(String product, String color,String company, String material, String size , int price) {
		return new Shirt(product,color,company,material,size,price);
		
}
}