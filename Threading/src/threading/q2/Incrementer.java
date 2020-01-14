package threading.q2;

class Incrementer implements Runnable{
     public void run(){             
    	 for (int i = 1; i <= 6; i++){
    		 System.out.println("Incrementer: "+ i);
    		 try{ Thread.sleep(1000);}
    		 catch(Exception e){}
    	 }
    }
}

