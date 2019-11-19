package com.account2;

class Account{
	public int balance=0;
	public Account(int b){balance = b;}
	public void deposit(int amt){
		this.balance += amt;
	}
	public void withdraw(int amt) throws MaxWithdrawException, InsuffFundsException{
		if (amt>100){ 
			throw new MaxWithdrawException();
		}else if (amt> balance){
			throw new InsuffFundsException();
		}else{
			balance -= amt;
		}
	}
	public int read_balance(){
		return this.balance;
	}
}