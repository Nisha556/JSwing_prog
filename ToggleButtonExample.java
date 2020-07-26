package JSwing;
import java.awt.FlowLayout.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButtonExample  extends JFrame implements  ItemListener{
	public static void main(String args[])
	{
		new ToggleButtonExmple();
		
	}
	private JToggeleButton button;
	ToggleButtonExample()
	{
		setTitle ("jToggle Button");
		setLayout(new FlowLayout());
		setJToggleButton();
		setAction();
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
