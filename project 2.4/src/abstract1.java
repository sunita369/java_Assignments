
abstract class abstract1{
	   public void disp(){
	     System.out.println("Concrete method of parent class");
	   }
	   abstract public void disp2();
	}

	class Demo extends abstract1{
	   
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
	       Demo obj = new Demo();
	       obj.disp2();
	   }
	}
