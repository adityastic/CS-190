package threading.q2;

public class Q2{
	
    public static void main(String[] args){
         Incrementer  i = new Incrementer();                     
         new Thread(i).start();
         Decrementer d = new Decrementer();         
         new Thread(d).start();
    }
}