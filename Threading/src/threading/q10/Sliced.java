package threading.q10;

public class Sliced {

	public static void main(String[] args){		

		NumberStore ns=new NumberStore();
		Producer p=new Producer(ns,1);
		Consumer c=new Consumer(ns,1);
		p.start();   
		c.start();
	}
}



