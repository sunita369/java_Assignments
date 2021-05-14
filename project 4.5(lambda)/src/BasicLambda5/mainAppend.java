package BasicLambda5;

import java.util.ArrayList;

public class mainAppend {
	
	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		
		a.add("Sunita");
		a.add("Ankan");
		a.add("Melani");
		a.add("Mrunal");
		a.add("Pooja");
		a.add("Kriya");
		StringBuilder pav=new StringBuilder();
		
		
		a.stream()
		.map(s->s.substring(0,1))
		.forEach(s->pav.append(s));

		
		System.out.println(pav);
		
	}


}
