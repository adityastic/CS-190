package decorator.counter;

public class CounterDecorator extends Counter{
	
	protected Counter counter;
	
	public CounterDecorator(Counter counter) {
		this.counter = counter;
	}
}
