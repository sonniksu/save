package Day3;

public class DateDotUtil {
	public static String dotDate(String date) {
		String returnStr=""; // 아무의미없는 사용한다고 선언함.
		returnStr+=date.substring(0, 4); //substring 내장 메소드. 0~4자릿수까지 사용(저장)한다고 선언
		returnStr+=".";
		returnStr+=date.substring(4, 6);
		returnStr+=".";
		returnStr+=date.substring(6);
		return returnStr; //지금까지 저장한걸 넘겨준다.(메인에)
	}
	
	public static String dashDate(String date) {
		String returnStr="";
		returnStr+=date.substring(0, 4);
		returnStr+="-";
		returnStr+=date.substring(4, 6);
		returnStr+="-";
		returnStr+=date.substring(6);
		return returnStr;
	
	}
	
}
