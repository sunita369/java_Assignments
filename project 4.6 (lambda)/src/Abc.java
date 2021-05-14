import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Objects;
import java.util.function.UnaryOperator;

public class Abc {
	 private int size;
	 public <E> void replaceAll(UnaryOperator<E> operator) {
	     Objects.requireNonNull(operator);
	     int modCount = 0;
	  final int expectedModCount = modCount;
	     final int size = this.size;
	     for (int i=0; modCount == expectedModCount && i < size; i++) {
	         E[] elementData = null;
	   elementData[i] = operator.apply((E) elementData[i]);
	     }
	     if (modCount != expectedModCount) {
	         throw new ConcurrentModificationException();
	     }
	     modCount++;
	 }
	    public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
	         
	        System.out.println(alphabets);
	         
	        alphabets.replaceAll( e -> e.toUpperCase() );  
	         
	        System.out.println(alphabets);
	    }

}
