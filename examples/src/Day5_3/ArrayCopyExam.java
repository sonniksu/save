package Day5_3;

public class ArrayCopyExam {

	public static void main(String[] args) {
		 String[] oldStrArray = {"Java", "array","copy"};
		 String[] newStrArray = new String[5];
		 System.arraycopy(oldStrArray, 0, newStrArray, 0 , oldStrArray.length);
		 for(int i=0; i <newStrArray.length; i++) {
			 System.out.println(newStrArray[i] + ",");
		 }
		 
		 }
	}

