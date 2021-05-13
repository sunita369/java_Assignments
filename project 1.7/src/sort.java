import java.util.stream.IntStream;

public class sort {

	public static void main(String[] args) {

	    int[] num = {5, 12, 14, 6 ,78 , 19, 1, 23, 26, 35, 37, 7 ,52, 86, 47};
	    int toFind = 19;

	    boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");

	}

}
