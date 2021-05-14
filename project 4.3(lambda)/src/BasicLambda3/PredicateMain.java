package BasicLambda3;

import java.util.function.Predicate;

public class PredicateMain {
	
	public static void main(String[] args)
    {
        Predicate<Integer> lesserthan = i -> (i < 16); 
  
        System.out.println(lesserthan.test(64)); 
    }


}
