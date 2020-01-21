package threading.q10;

class Consumer extends Thread {
	private NumberStore store;
	private int number;

	public Consumer(NumberStore ns,int n){
		store=ns;
		number=n;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Consumer #" + this.number + " got: " + store.get());
			try {  
				sleep((int)( Math.random()*10));
			} catch (InterruptedException e) {}    
		}
	}
}