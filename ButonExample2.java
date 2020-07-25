package JSwing;
import javax.swing.*;

public class ButonExample2 {

	ButonExample2(){
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("/home/nisha/Downloads/nisha.jpeg");
		
		b.setBounds(100,100,100,40);
		f.add(b);
		f.setSize(30,300);
		
		
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String args[])
	{
		new ButtonExample();
		
	}
}
