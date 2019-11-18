package com.account;

public class DepositException extends Exception {
	public DepositException() {
		super("Exceeds Limit");
	}
}
