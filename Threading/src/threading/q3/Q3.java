package threading.q3;

public class Q3{
	public static void main(String[] args){
		ThreadTest s1=new ThreadTest( );
		s1.start();
		while(true){
			System.out.println("X");
			try {Thread.sleep((int)(Math.random() * 1000));}
			catch (InterruptedException e) {}
		}
	}
}
