package Day4_1;

public class Service {
//	getActor("탐 크루즈","남자","1962.07.03","미국");
	public static Actor getActor(String name, String sex, String birthdate, String nationality) {

		Actor actor = new Actor(name, sex, birthdate, nationality);
		return actor;
	}
}