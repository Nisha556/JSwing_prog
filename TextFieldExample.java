package JSwing;
import javax.swing.*;

public class TextFieldExample {

	public static void main(String args[])
	{
		JFrame f = new JFrame("TextField Example");
		JTextField t1, t2;
		 t1 = new JTextField("Welcome to Java World");
		 t1.setBounds(50,150,20,30);
		 t2 = new JTextField("AWT Tutorial");
		 t2.setBounds(50,150,20,30);
		 f.add(t1);

		 f.add(t2);
		 f.setSize(400,400);
		 f.setVisible(true);
		 
	}
}
