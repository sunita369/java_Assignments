package lambda;
import java.util.Scanner;
interface givenOrder{
	int operation(int x, int y);
	void status();
}
public class orders {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Orders");
		System.out.println("Enter The Number you want to order: ");
		int x =s.nextInt();
		System.out.println("Enter The amount of each order: ");
		int y =s.nextInt();
		
		int price=(x*y);{
		if(price>10000)
			System.out.println("Amount Accepted");
		else
			System.out.println("Only Orders above 10,000 is Accepted here!");
		}
		System.out.println("Your Process is completed!!!");

	}
}
