package Day3;

public class Singleton { //싱글톤 패턴. 

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
		
		public static Singleton getInstance() {
			return singleton;
		}
	}

