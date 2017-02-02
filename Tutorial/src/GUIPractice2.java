import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIPractice2 extends JFrame{
	
	private JLabel item1;
	
	public GUIPractice2(){
		super("The title bar");
		setLayout(new FlowLayout());
	
		item1= new JLabel("This is a sentence");
		item1.setToolTipText("This is what we get when we hover");
		add(item1);
	}
	
}
