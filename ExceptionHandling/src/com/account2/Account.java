package com.account2;

class Account{
	public int balance=0;
	public Account(int b){balance = b;}
	public void deposit(int amt){
		this.balance += amt;
	}
	public int  withdraw(int amt){
		int resultCode=0;
		if (amt>100){ 
			resultCode=1;  
		}else if (amt> balance){
			resultCode=2; 
		}else{
			balance -= amt;
		}
		return resultCode;
	}
	public int read_balance(){
		return this.balance;
	}
}