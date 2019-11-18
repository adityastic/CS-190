package com.counter;
//package ch1;

public class Counter {
	private int value;
	private int limit;
    
	public Counter(int lim){value=0;limit=lim;}

	public boolean increment(){
		if (value < limit) {this.value++; return true;}
		else               { return false;}
	}
	public boolean decrement(){
		if (value > 0) {this.value--; return true;}
		else               { return false;}
	}
	public int read_value(){
		return this.value;
	}
}
