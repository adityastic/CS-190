package threading.q4;

import java.awt.*;
import javax.swing.*;

class Counter  {
	private JFrame f1=new JFrame();
	public  JLabel l1=new JLabel();
	public  JLabel l2=new JLabel();
	private Font fnt=new Font("TimesNewRoman",Font.BOLD,16);
	Container content;

	DisplayCountUp dcu;  
	DisplayCountDown dcd;
	
	Counter(){
		content=f1.getContentPane();
		l1.setFont(fnt);
		l1.setText("Counter Up:  "+0);
		l2.setFont(fnt);
		l2.setText("Counter Dn:  "+20);
       	f1.setLayout(new FlowLayout());
        f1.setSize(192,150);  //f1.setResizable(false);
        content.add(l1)	;content.add(l2);
                          
        dcu= new DisplayCountUp(l1);
    	dcd= new DisplayCountDown(l2);
    	f1.setVisible(true);
        dcu.start();
        dcd.start();
    }
} 