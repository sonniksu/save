package Day5_3;

public class ForEachExam {
	public static void main(String[] args) {
		
		String[]messageArr = {"hello" , "world" , "welcome"};
		
		System.out.println("====for====");
		for (int i =0; i<messageArr.length; i++) {
			System.out.println(messageArr[i]);
		}
		
		System.out.println("\n====advanced for====");
		for(String str : messageArr) {
			System.out.println(str);
		}
	}
}
