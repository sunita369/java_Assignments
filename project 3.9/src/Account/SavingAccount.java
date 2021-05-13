package Account;

import java.util.Comparator;

public class SavingAccount {
	
	float acc_balance;
	int acc_ID;
	String accountholdername;
	String IsSalaryAccount;
	float withdraw;
	float deposit;
	public SavingAccount( int acc_ID, String accountholdername, float acc_balance,String isSalaryAccount,
	float withdraw, float deposit) {
	super();
	this.acc_balance = acc_balance;
	this.acc_ID = acc_ID;
	this.accountholdername = accountholdername;
	IsSalaryAccount = isSalaryAccount;
	this.withdraw = withdraw;
	this.deposit = deposit;
	}
	public float getWithdraw() {
	return withdraw;
	}
	public int getAcc_ID() {
	return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
	this.acc_ID = acc_ID;
	}
	public void setWithdraw(float withdraw) {
	this.withdraw = withdraw;
	}
	public float getDeposit() {
	return deposit;
	}
	public void setDeposit(float deposit) {
	this.deposit = deposit;
	}
	}
	class AccComp implements Comparator<SavingAccount>{
	@Override
	public int compare(SavingAccount e1, SavingAccount e2) {
	if(e1.getAcc_ID() == e2.getAcc_ID()){
	return 0;
	} if(e1.getAcc_ID() < e2.getAcc_ID()){
	return -1;
	} else {
	return 1;
	}
	}


}
