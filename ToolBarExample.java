package JSwing;
import javax.swing.*;
import java.awt.*;

public class ToolBarExample {
	public static void main(String args[])
	{
	JFrame myframe  = new JFrame("JToolBar Example");
	myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JToolBar toolbar = new JToolBar();
	toolbar.setRollover(true);
	myframe.show();
	myframe.setSize(200,200);
	myframe.setVisible(true);
	myframe.setLayout(null);
	}

}
