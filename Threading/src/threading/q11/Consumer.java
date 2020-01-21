package threading.q11;
class Consumer extends Thread {
	private LinkedStore store;

	public Consumer(LinkedStore ns){store=ns;}

	public void run() {
		int value = 0;
		for (int i = 1; i < 10; i++) {
			try{ value = store.delete();}
			catch(Exception e){}
			System.out.println("Consumer "+ " gets: " + value);
			try {  sleep((int)( Math.random()*30));}
			catch (InterruptedException e) {}    }
	}
}