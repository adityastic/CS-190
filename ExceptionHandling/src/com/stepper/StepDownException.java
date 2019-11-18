package com.stepper;

public class StepDownException extends Exception{
	public StepDownException() {
		super("Limit Reached, cannot step down");
	}
}
