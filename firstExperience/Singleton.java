package javastudy.ex1220;

public class Singleton {

	private static Singleton s = new Singleton();
	
	int a = 10;
	int b = 20;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return s;
	}
	
}
