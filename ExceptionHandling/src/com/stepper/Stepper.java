package com.stepper;

public class Stepper {
	private int value;

	public Stepper(int lim){value=0;}

	public void stepUp(){
		this.value++; 
	}
	public void stepDown(){
		if (value > 0) {
			this.value--;
		}
		else {
			
		}
	}
	public int readValue(){
		return this.value;
	}
}
