package threading.q11;

public class SlicedStack2 {
	public static void main(String[] args)
	{
		LinkedStore ls=new LinkedStore();
		Producer p=new Producer(ls);
		Consumer c=new Consumer(ls);
		p.start();
		c.start();
		try{
			System.in.read();}
		catch(Exception e){}
	}
}
