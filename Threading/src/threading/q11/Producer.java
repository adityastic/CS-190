package threading.q11;

class Producer extends Thread {
	private LinkedStore store;

	public Producer(LinkedStore ns){store=ns;}

	public void run() {
		for (int i = 1; i < 10; i++) {
			try{ 
				store.insert(i);
			} catch(Exception e){}
			//System.out.println("Producer "+ " inserts : " + i);
			try {
				sleep((int)( Math.random()*10)); 
			}catch (InterruptedException e) {}      
		}
	}
}