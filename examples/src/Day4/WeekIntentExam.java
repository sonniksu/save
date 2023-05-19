package Day4;

//split : ,만날떄마다 끊어서 배열에 저장
//for연습
public class WeekIntentExam {
	public static void main(String[] args) {

		String dayString = "일,월,화,수,목,금,토";

		String[] days = dayString.split(",");

		for (int i = 0; i < days.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("\t");
			}
			System.out.println(days[i] + "요일");

		}

	}

}
