package threading.q3;

class ThreadTest extends Thread{
	public ThreadTest() {}

	public void run() {
		while(true){
			System.out.print("Y");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {}
		}
	}
}