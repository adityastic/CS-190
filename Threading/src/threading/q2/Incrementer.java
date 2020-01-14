package threading.q2;

class Incrementer{
     public void incrementer(){             
    	 for (int i = 1; i <= 6; i++){
    		 System.out.println("Incrementer: "+ i);
    		 try{ Thread.sleep(1000);}
    		 catch(Exception e){}
    	 }
    }
}

