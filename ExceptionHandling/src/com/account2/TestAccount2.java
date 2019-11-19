package com.account2;

public class TestAccount2{
	public static void main(String [] args){
		Account a = new Account(150);
		int amt[]={70, 120,85};
		for(int i=0;i<3;i++){
			int resultCode = a.withdraw(amt[i]);
			if (resultCode==0)System.out.println("Success");
			if (resultCode==1)System.out.println("Max withdrawl100");   
			if (resultCode==2)System.out.println("Insuff Funds");
		}
	}
}

