package com.account;

class Account{
	protected int balance;
	private int upperLimit;

	public Account(int n, int b,int l){
		balance=b;
		upperLimit=l;
	}

	public void withdraw(int amt) throws WithdrawException{
		if (amt>balance) 
			throw new WithdrawException();
		else {  
			balance -=amt;
		}
	}

	public void deposit(int amt) throws DepositException{
		if (amt+balance>upperLimit)
			throw new DepositException();
		else {
			balance +=amt;
		}
	}

	public int read_balance()
	{
		return balance;
	}
}

