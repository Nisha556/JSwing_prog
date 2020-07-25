package JSwing;
import java.awt.event.*;
import javax.swing.*;
public class ButtonExample1 {
	public static void main(String args[])
	{
		JFrame f = new JFrame("Button Example");
		final JTextField tf = new JTextField();
		tf.setBounds(50,50,150,20);
		JButton b = new JButton("click Here");
		b.setBounds(50,50,95,30);
		b.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("welcome to Java World");
			}
			
			
		});
		f.add(b);
		f.add(tf);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
	}

}
