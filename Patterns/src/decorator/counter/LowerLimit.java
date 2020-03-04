package decorator.counter;

public class LowerLimit extends CounterDecorator implements CounterInterface{
	
	public LowerLimit(Counter counter) {
		super(counter);
	}

	@Override
	public void increment() {
        counter.increment();
	}

	@Override
	public void decrement() {
		if(counter.readValue() > 0)
			counter.decrement();
		else
			System.out.println("\nCannot decrement below 0");
	}

	@Override
	public int readValue() {
        return counter.readValue();
	}
}
