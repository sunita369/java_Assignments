package BasicLambda2;

import java.util.Scanner;

public class order {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the price of order");
		
		int Price=s.nextInt();
		
		if(Price>10000)
		{
			ordermain mylambda=( )-> System.out.println(" Order Accepted");
		    
		}
		else
		{
			System.out.println("Oder denied");
			
			
			
		}
		
	}
	
	
}

interface ordermain
{
	  void price();




}
