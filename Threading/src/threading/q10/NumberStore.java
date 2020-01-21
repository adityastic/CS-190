package threading.q10;

class NumberStore {
	private int contents=0;
	private boolean isAvail = false;

	public synchronized int get(){
		while(isAvail == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		isAvail = false;
		notify();
		return contents; 
	} 

	public synchronized void put(int value) {
		while(isAvail == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		isAvail = true;
		contents = value;  
		notify();
	}	
}