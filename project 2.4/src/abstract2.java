
public abstract class abstract2 {
	  
    public void printSomething()
    {
        System.out.println("Hello in abstract class");
    }
}
class CreateClassOne {
  
    public static void main(String[] args)
    {
        // instance of abstract
    	abstract2 obj = new abstract2 ();
    }
}
// abstract2 is abstract; cannot be instantiated
