package com.account2;

public class TestAccount2{
	public static void main(String [] args){
		Account a = new Account(150);
		int amt[]={70, 120,85};
		for(int i=0;i<3;i++){
			try {
				a.withdraw(amt[i]);
				System.out.println("Success");
			}catch(MaxWithdrawException e) {
				System.out.println("Max withdrawl100");  
			}catch(InsuffFundsException e) {
				System.out.println("Insuff Funds");
			}
		}
	}
}

