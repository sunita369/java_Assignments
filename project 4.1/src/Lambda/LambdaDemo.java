package Lambda;
import java.util.Scanner;
interface Arithmetic{
	int operation(int a, int b);
}
public class LambdaDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		while (true) {
			System.out.println("Enter the two numbers to perform Arithmetic Options");
			System.out.println("Enter The First Number: ");
			int a =s.nextInt();
			System.out.println("Enter The Second Number: ");
			int b =s.nextInt();
			
			System.out.println("Choose The Operation You want to perform: ");
			System.out.println("Choose 1 for ADDITION");
			System.out.println("Choose 2 for SUBTRACTION");
			System.out.println("Choose 3 for MULTIPLICATION");
			System.out.println("Choose 4 for DIVISION");
			System.out.println("Choose 5 for MODULUS");
			System.out.println("Choose 6 for EXIT");
			int n=s.nextInt();
			switch(n) {
			case 1:
				int add;
				add=a+b;
				System.out.println("ADDITION is: "+add);
				break;
				
			case 2:
				int sub;
				sub=a-b;
				System.out.println("SUBTRACTION is: "+sub);
				break;
				
			case 3:
				int mul;
				mul=a*b;
				System.out.println("MULTIPLICATION is: "+mul);
				break;
				
			case 4:
				int div;
				div=  a/b;
				System.out.println("DIVISION is: "+div);
				break;
				
			case 5:
				int mod;
				mod=a%b;
				System.out.println("MODULUS is: "+mod);
				break;
				
			case 6:
				System.exit(0);
				
			}


	}
	}
}
