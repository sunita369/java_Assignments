package Account;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<SavingAccount> set=new TreeSet<SavingAccount>(new AccComp());  
		   //Creating Books  
		   SavingAccount b1=new SavingAccount(122,"Rihana",30000f,"Yes",2000f,3000f);  
		   SavingAccount b2=new SavingAccount(119,"Nihar",50000f,"No",2050f,3020.89f);
		   SavingAccount b3=new SavingAccount(136,"Shreya",20000f,"No",1000f,350f);
		   SavingAccount b4=new SavingAccount(108,"Lena",37000f,"Yes",200f,5000f);
		 
		   //Adding Books to TreeSet  
		   set.add(b1);  
		   set.add(b2);  
		   set.add(b3);
		   set.add(b4);
		   //Traversing TreeSet  
		   for(SavingAccount b:set){  
		   System.out.println("Account Id:"+b.acc_ID+ " Account Holder's Name:"+b.accountholdername+" Account Balance: "+b.acc_balance+" Amount withdrawn:"+b.withdraw+" Amount Deposited:"+b.deposit);
		   
		   }
		 

		}



}
