package assignmentThree;

public class Person implements Comparable<Person> {
	Integer height;
	Integer weight;
	String name;
	public Person(Integer height,Integer weight,String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person[Name is "+name+"Height is"+height+"weight is"+weight+"]";
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.getWeight()==o.getWeight())
			return this.getHeight().compareTo(o.getHeight());
		else
			return this.getWeight().compareTo(o.getWeight());

	}
}
