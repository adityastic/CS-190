package decorator.counter;

public class Counter implements CounterInterface{

	private int value;

	public Counter() {
		value = 0;
	}

	@Override
	public void increment() {
		value++;
	}

	@Override
	public void decrement() {
		value--;
	}

	@Override
	public int readValue() {
		return value;
	}
}