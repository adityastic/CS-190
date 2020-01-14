package threading.q2;

class Decrementer implements Runnable{
	public void run(){             
		for (int i = 6; i >0; i--){
			System.out.println("Decrementer: "+ i);
			try{ Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
}
