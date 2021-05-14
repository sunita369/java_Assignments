import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main (String [] args) {
		Trader diya =new Trader("Diya","Delhi");
		Trader riya =new Trader("Riya","Delhi");
		Trader hiya =new Trader("Hiya","Indore");
		Trader liya =new Trader("Liya","Indore");
		Trader piya =new Trader("Piya","Kolkata");
		Trader kiya =new Trader("Kiya","Kolkata");
		Trader kriya =new Trader("Kriya","Mumbai");
		Trader priya =new Trader("Priya","Mumbai");
		
		//Transaction Record
		List<Transaction> transactions = Arrays.asList(
				new Transaction(diya,2011,400),
				new Transaction(riya,2011,1400),
				new Transaction(hiya,2012,800),
				new Transaction(priya,2011,1400),
				new Transaction(kriya,2012,900),
				new Transaction(liya,2011,1400),
				new Transaction(piya,2012,700),
				new Transaction(kiya,2011,1400),
				new Transaction(riya,2012,1000),
				new Transaction(priya,2011,1200)

				);
		
		//8.Find all transactions in the year 2011 and sort them by value
		List<Transaction> result8 = transactions.stream()
				.filter( (t)->t.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
		result8.forEach(System.out::println);
		
		
		//9. What are all the unique cities where the traders work?
		List<String> result9 = transactions.stream()
				.map(Transaction::getTrader)
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		result9.forEach(System.out::println);
		
		//10.
		List<Trader> result10 = transactions.stream()
				.map(Transaction::getTrader)
				.filter((t)->("Pune").equals(t.getCity()))
				.distinct()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		result10.forEach(System.out::println);
		
		
		//11.
		String allName = transactions.stream()
				.map((t)->t.getTrader().getName())
				.sorted()
				.reduce("",(a,b)->a+" "+b);
		System.out.println(allName);
		
		//12.
		boolean flag = transactions.stream()
				.map(Transaction::getTrader)
				.anyMatch(t->t.getCity().equals("Indore"));
		System.out.println("Is there any traders from Indore?"+flag);
		
		
		//13.
		Integer sum = transactions.stream()
				.filter(t->t.getTrader().getCity().equals("Delhi"))
				.map(Transaction::getValue)
				.reduce(0,(a,b)->a+b);
		System.out.println("All transactions for traders living in Delhi: "+sum);
		
		//14.
		List<Integer> list = transactions.stream()
				.sorted(Comparator.comparing(Transaction::getValue).reversed())
				.map(Transaction::getValue)
				.limit(1)
				.collect(Collectors.toList());
		System.out.println("In all transactions, the highest transaction amount is"+list.get(0));
		
		//15.
		Optional<Integer> min = transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer::min);
		System.out.println("In all transactions, the minimum transaction  amount is:"+min.get());
				}
}

