package oddone;

import java.util.ArrayList;

public class stringOdd {
	
	public static void main(String[] args) {
		
		
		ArrayList<String>x=new ArrayList<String>();
		
		x.add("Sunita");
		x.add("Abhishek");
		x.add("Ankan");
		x.add("Suman");
		x.add("Nilima");
		x.add("Rima");
		
		System.out.println(x);
		
		x.removeIf(t->(t.length()%2==0));
		System.out.println(x);
		
		 x.stream()
		.filter(p->(p.length()%2==1))
		.forEach(p->System.out.println("\n"+p));

		
		}


}
