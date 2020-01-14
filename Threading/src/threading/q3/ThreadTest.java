package threading.q3;

class ThreadTest {
	public ThreadTest() {}

	public void writeY() {
		while(true){
			System.out.print("Y");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {}
		}
	}
}