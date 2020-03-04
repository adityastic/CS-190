package decorator.counter;

public class UpperLimit extends CounterDecorator{
	
	public UpperLimit(Counter counter) {
		super(counter);
	}

	@Override
	public void increment() {
		if(counter.readValue() <= 9)
			counter.increment();
		else
			System.out.println("\nCannot increment above 10");
	}

	@Override
	public void decrement() {
        counter.decrement();
	}

	@Override
	public int readValue() {
        return counter.readValue();
	}
}
