package Day1;

public class FootballPlayerExam {

	public static void main(String[] args) {
		
		FootballPlayer fp1 = new FootballPlayer();
		
		fp1.setName("KIM");
		System.out.println(fp1.name);
		
		fp1.setUniformNumber(7);
		System.out.println(fp1.uniformNumber);
		
		fp1.setTeamName("Real Madrid");
		System.out.println(fp1.teamName);
		
		fp1.setSpeed(5);
		System.out.println(fp1.speed);
		
		fp1.setTech(5);
		System.out.println(fp1.tech);
		
		fp1.printInfo();
		

	}
}
