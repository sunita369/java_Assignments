package CarOwner;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CarOwnerList {
	
	static Set<CarOwnerDetails> car=new TreeSet<CarOwnerDetails>(new ParkOrder());
	static CarOwnerDetails p1 = new CarOwnerDetails("Rihana","Audi A8",1846,545444544,"Dubai");
	static CarOwnerDetails p2 = new CarOwnerDetails("Nihar","Suzuki",7498,55555654,"Hawai");
	static CarOwnerDetails p3 = new CarOwnerDetails("Lena","Xylo",4596,65654654,"Sanfransisco");
	static int add_new_car(CarOwnerDetails obj) {
	car.add(obj);

	if(obj.ownerName.equalsIgnoreCase("Rihana")) {
	System.out.println("Token no for Rihana: 1");
	}
	if(obj.ownerName.equalsIgnoreCase("Nihar")) {
	System.out.println("Token no for Nihar: 2");
	}
	if(obj.ownerName.equalsIgnoreCase("Lena")) {
	System.out.println("Token no Lena: 3");

	}
	return 0;

	}
	static void remove_car(String name) {
	for(CarOwnerDetails p:car) {
	if(name.equalsIgnoreCase(p.ownerName))
	car.remove(p);
	}
	for(CarOwnerDetails p:car) {
	System.out.println("Owner names of cars parked:"+ p.ownerName);}
	}
	static void get_parked_car_location(int token) {
	if(token==1) {
	System.out.println("Car Location : Floor 1, Section 2, Slot 12");
	}
	if(token==2) {
	System.out.println("Car Location : Floor 2, Section 3, Slot 14");
	}
	if(token==3) {
	System.out.println("Car Location : Floor 3, Section 1, Slot 20");
	}

	}
	public  static void main(String[] args) {
	add_new_car(p1);
	add_new_car(p2);
	add_new_car(p3);
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your name");
	String n=s.nextLine();
	remove_car(n);
	System.out.println("Enter your token no.");
	int t=s.nextInt();
	get_parked_car_location(t);




	}

}
