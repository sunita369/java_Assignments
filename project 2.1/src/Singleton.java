
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	public static Singleton getInstance() {
		return singleton;
	}
	
	protected static void demoMethod() {
		System.out.println("This is a Singletone class");
	}
	public static class SingletonDemo{
		public static void main (String[] args) {
			Singleton tmp = Singleton.getInstance();
			tmp.demoMethod();
		}
	}
}