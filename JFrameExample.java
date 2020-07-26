package JSwing;
import javax.swing.*;
import java.awt.*;


public class JFrameExample {
	public static void main(String args[])
	{
		JFrame frame = new JFrame("JFrame example");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("JFrame example");
		JButton button = new JButton();
		button.setText("Button");
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		frame.setSize(200,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
				
	}

}
