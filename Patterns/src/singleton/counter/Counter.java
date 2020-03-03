package singleton.counter;

class Counter {
	private int value = 0;

	private static Counter INSTANCE;
	
	private Counter() {
		value = 0;
	}
	
	public static Counter getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Counter();
		return INSTANCE;
	}
	
	public int readValue() {
		return value;
	}
	
	public void stepValue() {
		value++;
	}
}
