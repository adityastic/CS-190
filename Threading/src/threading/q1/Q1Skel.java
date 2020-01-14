package threading.q1;

public class Q1Skel
{
	public static void main(String[] args)
    {
		Display d1=new Display("First");
		Display d2=new Display("Second");
		d1.start();
		d2.start();
    }
}
