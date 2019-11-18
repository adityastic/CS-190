package com.account;

public class WithdrawException extends Exception {
	public WithdrawException() {
		super("Insuff Funds");
	}
}
