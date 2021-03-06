package frames;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

class FrameQ3 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JLabel l0 = new JLabel("  Recurstion   Application  ");
    private JLabel l1 = new JLabel("             List");
    private JTextField t1 = new JTextField("0", 15);
    private JLabel l2 = new JLabel(" Enter Target");
    private JTextField t4 = new JTextField("0", 15);
    private JButton b1 = new JButton("  countTarget");
    private JTextField t2 = new JTextField("0", 15);
    private JButton b2 = new JButton("max");
    private JTextField t3 = new JTextField("0", 15);
    private JPanel p1 = new JPanel();

    ArrayList < Integer > arr = new ArrayList<Integer>();

    public static int countTarget(ArrayList<Integer> list, int tar) {
    	if(list.size() == 0) 
    		return 0;
    	
    	int ele = list.get(0);
    	list.remove(0);
        return ((ele == tar) ? 1 : 0) + countTarget(list, tar);
    }

    public static int max(ArrayList<Integer> list) {
    	if(list.size() == 0) 
    		return 0;
    	
    	int ele = list.get(0);
    	list.remove(0);
        return Math.max(ele, max(list));
    }

    public FrameQ3(String s) {
        super(s);
        Collections.addAll(arr, 5, 3, 5, 3, 8, 9, 5, 1, 8);
        java.awt.Container content = getContentPane();
        displayList();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(4, 2));
        l0.setFont(f);
        l1.setFont(f);
        l2.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t4);
        p1.add(b1);
        p1.add(t2);
        p1.add(b2);
        p1.add(t3);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(390, 200);
        setVisible(true);
    }

    public void displayList() {
        String res = "[" + (Integer) arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            res += ", " + (Integer) arr.get(i);
        }
        t1.setText(res + "]");
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        
        if (target == b1) {
            int t = Integer.parseInt(t4.getText());
            int v1 = countTarget(new ArrayList<Integer>(arr), t);
            t2.setText("" + v1);
        }
        
        if (target == b2) {
            int v1 = max(new ArrayList<Integer>(arr));
            t3.setText("" + v1);
        }
    }
}