package threading.q4;

import javax.swing.*;

class DisplayCountUp{
	JLabel label;
	DisplayCountUp(JLabel l){ this.label=l;}
	public void display(){

		for(int i=0;i<=20; i++){
			this.label.setText("Counter Up:  "+i);
			
			try{Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
}