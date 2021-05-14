package BasicLambda3;

import java.util.function.Supplier;

public class SupplierMain {
	
	public static void main(String args[])
    {
  
        Supplier<Double> randomValue = () -> Math.random();
  
        System.out.println(randomValue.get());
    }


}
