package threading.q2;

public class Q2{
	
    public static void main(String[] args){
         Incrementer  i = new Incrementer();                     
         i.incrementer();
         Decrementer d = new Decrementer();                  
         d.decrementer();
    }
}