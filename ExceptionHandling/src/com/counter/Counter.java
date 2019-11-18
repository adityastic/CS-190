package com.counter;

public class Counter {
	private int value;
	private int limit;

	public Counter(int lim){value=0;limit=lim;}

	public void increment() throws CounterException{
		if (value < limit) {
			this.value++;
		}
		else{
			throw new CounterException("Cannot Increment, Limit Reached");
		}
	}
	public void decrement() throws CounterException{
		if (value > 0) {
			this.value--; 
		}
		else{
			throw new CounterException("Cannot Decrement, Limit Reached");
		}
	}
	public int read_value(){
		return this.value;
	}
}
