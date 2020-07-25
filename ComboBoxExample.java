package JSwing;
import javax.swing.*;
public class ComboBoxExample {
	JFrame f;
	ComboBoxExample()
	{
		f = new JFrame("ComboBox Example");
		String country [] = {"India" , "USA", "England","Newzealand"
	};
		JComboBox cb = new JComboBox(country);
		
		cb.setBounds(50,50,90,20);
		f.add(cb)
;
		System.out.println("Name = " +cb);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
		
}
	public static void main(String args[])
	{
		new ComboBoxExample();
	}
	}
