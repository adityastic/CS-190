package threading.q1;

class Display {
	public String name;
	
	public Display(String nm){
		name=nm;
	}
	
	public void display(){
		for(int i=0; i<4;i++){ 
			System.out.println(name+": "+i);
			try{ Thread.sleep(1000);}
	        catch(Exception e){}
	    }
	}
}  