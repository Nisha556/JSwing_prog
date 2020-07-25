package JSwing;
import javax.swing.*;

public class MenuExample {

	JMenu menu , submenu;
	JMenuItem i1, i2, i3, i4,i5;
	MenuExample()
	{
		JFrame f = new JFrame("Menu example");
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
				submenu = new JMenu("submenu");
				
		i1= new JMenuItem("Item 1");
		i2= new JMenuItem("Item 2");
		i3= new JMenuItem("Item 3");
		i4= new JMenuItem("Item 4");
		//i5= new JMenuItem("Item 5");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		//menu.add(i5);
		menu.add(submenu);
		menu.add(mb);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
f.setVisible(true);
	}
public static void main(String args[])
{
	new MenuExample();
}
	}
	

