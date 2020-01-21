package threading.q8;

public class Join1 {
	public static void main(String[] args) {
		
		Thread t = new Thread(){
			public void run(){
				System.out.println("EnterValue:");
				
				try{
					System.in.read();
				} catch (Exception ex) {}
				
				System.out.println("Thread Finished.");
			}
		};
		
		System.out.println("Starting Thread");
		t.start();
		
		try{
			Thread.sleep(2000);
		}catch (Exception e) {}

		System.out.println("Join");
		
		try{
			t.join();
		} catch (Exception e1) {}
		
		System.out.println("Main Finished.");
	}
}