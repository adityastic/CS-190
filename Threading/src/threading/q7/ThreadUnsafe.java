package threading.q7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadUnsafe extends Thread {
	static int val1 = 9, val2 = 2, delay = 1000;
	static Lock lock = new ReentrantLock();
	
	void Go(){
		lock.lock();
		if (val2 != 0){
			try {
				Thread.sleep(delay);
			}catch(Exception e){}
			System.out.println( val1 / val2);
		} else {
			System.out.println( "Val2=0");
		}
		val2=0;
	}
	
	public void run(){
		Go();
	}

	
    public static void main( String[] args ){
    	ThreadUnsafe t1=new ThreadUnsafe();
    	ThreadUnsafe t2=new ThreadUnsafe();
    	val1=9;
    	val2=2;
    	t1.start();
    	delay=500;
    	t2.start();
    }
}
