package Day3;
//메소드 오버로딩
public class MessageExam {
 public static void main(String[] args) {
	
	 Message msg = new Message();
	 
	 System.out.println("====printInfo()====");
	 msg.printInfo("Hello");
	 msg.printInfo(50);
	 msg.printInfo("World", 60);
	 msg.printInfo(60,"World");
	 
}
}



//====printInfo()====
//Hello
//50
//World, 60
//60, World
