package JSwing;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class JLabelExample2  extends Frame implements ActionListener{
	JTextField tf ; JLabel l ;JButton b;
JLabelExample2 (){
	tf = new JTextField();
	tf.setBounds(50,50,150,20);
	l = new JLabel();
	l.setBounds(50,100,250,20);
	b = new JButton("Find LP");
	b.setBounds(50,150,95,30);
	b.addActionListener(this);
	add(b);
	add(tf);
	add(l);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	
}
public static void main(String args[])
{
	new JLabelExample2();
}

}
