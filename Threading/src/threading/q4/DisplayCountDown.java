package threading.q4;

import javax.swing.*;

class DisplayCountDown{
	JLabel label;
	DisplayCountDown(JLabel l){ this.label=l;}
	public void display() {
		for(int i=20;i>0; i--){
			label.setText("Counter Dn:  "+i);
			try{Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
}