package oddone;

import java.util.ArrayList;

public class Odd {
	 public static void main(String[] args) {
		 ArrayList<Integer> Num=new ArrayList<Integer>();
		 Num.add(12);
		 Num.add(16);
		 Num.add(79);
		 Num.add(31);
		 Num.removeIf(n->(n%2)==1);
		 for(int i: Num)
		 {
		  System.out.println(i);
		 }
			
		 }

}
