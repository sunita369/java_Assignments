package assignmentThree;

import java.util.*;

public class SortFirst {
	public static void main(String[] args) {
		TreeSet<Person> tree_set =new TreeSet<>();
		tree_set.add(new Person (120,45,"Hina"));
		tree_set.add(new Person(125,32,"Rita"));
		tree_set.add(new Person(332,34,"Roma"));
		tree_set.add(new Person (445,22,"Nila"));
		tree_set.add(new Person(122,26,"Mumu"));
		for (Person element :tree_set )
			System.out.println(element);

	}
}
