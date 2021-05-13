import java.util.Scanner;
public class average {

	public static void main(String[] args) {
	    int i;
        float sum=0;
	    System.out.println("Enter number of subjects");
	 
	    Scanner sc=new Scanner(System.in);
	 
	    int n=sc.nextInt();
	 
	    int[] a=new int[n];
	 
	    double avg=0;
	 
	    System.out.println("Enter marks of A: ");
	 
	    for( i=0;i<n;i++)
	    {
	       a[i]=sc.nextInt();
           sum = sum + a[i];

	    }
	    System.out.println("Total marks of A:" +sum);
	    
	    for( i=0;i<n;i++)
	    {
	      avg=avg+a[i];
	    }
	 
	    System.out.print("Average of A (");
	 
	    for(i=0;i<n-1;i++)
	    {
	      System.out.print(a[i]+",");
	    }
	    
	    System.out.println(a[i]+") ="+avg/n);
	  }


	}
