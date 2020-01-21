package threading.q10;

class Producer extends Thread {
	private NumberStore store; 
	private int number; 

	public Producer(NumberStore ns,int n){
		store=ns;
		number=n;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			store.put(i);
			System.out.println("Producer #"+ this.number + " put: " + i);
			try {
				sleep((int)( Math.random()*10)); 
			} catch (InterruptedException e) {}      
		}
	}
}