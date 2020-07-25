package JSwing;
import javax.swing.*;

public class JTableExample {

	JFrame f;
	JTableExample()
	{
		f = new JFrame();
		String data[][]= {{"101","Amit", "670000"},
				{"102","Jai", "590000"},
				{"103","sachin" , "89000"}
				
		};
		String column [] = {"ID", "Name","Salary"};
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		f.add(jt);
		f.setSize(300,400);
		f.setVisible(true);
		
	}
	public static void main(String args[])
	{
		new JTableExample();
		
	}
}
