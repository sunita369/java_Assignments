package StramApi;
import java.util.Arrays;
import java.util.*;
public class Demo {
	public static void main (String [] args) {
		List<Fruit> n =Arrays.asList(
				new Fruit("Mango",45, 30, "yellow"),
				new Fruit("Strawberry",50,25,"red"),
				new Fruit("Apple",30,20,"red"),
				new Fruit("Banana",20,10,"yellow"),
				new Fruit("Orange",30,25,"orange"),
				new Fruit("Grapes",10,5,"green"),
				new Fruit("Cucumber",15,5,"green"),
				new Fruit("Guava",10,20,"green"),
				new Fruit("Tomato",20,15,"red")

	);
		n.stream().filter(m->{if(m.getFruitCalories()<100)
			return true;
		return false;}).sorted((a,b)->(int)(b.getFruitCalories()-a.getFruitCalories())).forEach(m->System.out.println(m.getFruitName()+" , "+m.getFruitColor()+","+m.getFruitCalories()));
		
		n.stream().forEach(m->System.out.println(m.getFruitName()+","+m.getFruitColor()));
		
		
		}
	}

