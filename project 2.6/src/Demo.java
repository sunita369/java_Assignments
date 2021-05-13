
public class Demo {
	public static void main(String[] args ) {
		Persistence d= new DatabasePersistence();
		Persistence f= new FilePersistence();
		d.presist();
		f.presist();
		
	}
}
