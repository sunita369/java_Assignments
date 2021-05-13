import java.util.Scanner;

public class totalAverage {
	
	public static void main(String[] args) {
	int p,m,b,p1,m1,b1,p2,m2,b2,p3,m3,b3,x1,y1,x2,y2,x3,y3,z1,z2,z3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first student Physics marks: ");
	p1 = sc.nextInt();
	System.out.println("Enter the first student Maths marks: ");
	m1 = sc.nextInt();
	System.out.println("Enter the first student Biology marks: ");
	b1 = sc.nextInt();
	System.out.println("Enter the second student Physics marks: ");
	p2 = sc.nextInt();
	System.out.println("Enter the second student Maths marks: ");
	m2 = sc.nextInt();
	System.out.println("Enter the second student Biology marks: ");
	b2 = sc.nextInt();
	System.out.println("Enter the third student Physics marks: ");
	p3 = sc.nextInt();
	System.out.println("Enter the third student Maths marks: ");
	m3 = sc.nextInt();
	System.out.println("Enter the third student Biology marks: ");
	b3 = sc.nextInt();
	x1= p1+m1+b1;
	y1= x1/3;
	x2 = p2+m2+b2;
	y2 = x2/3;
	x3 = p3+m3+b3;
	y3 = x3/3;
	p = p1+p2+p3;
	m = m1+m2+m3;
	b = b1+b2+b3;
	z1=p/3;
	z2=m/3;
	z3=b/3;
	System.out.println("Student1: Total Marks ="+x1+ "and Average Marks ="+y1);
	System.out.println("Student2: Total Marks ="+x2+ "and Average Marks ="+y2);
	System.out.println("Student3: Total Marks ="+x3+ "and Average Marks ="+y3);
	System.out.println("Total Marks in Subject1 = " +p+ " Subject2 = "+m+"Subject3 = "+b);
	System.out.println("Average Marks in Subject1 = " +z1+ " Subject2 = "+z2+"Subject3 = "+z3);		
	}
}
