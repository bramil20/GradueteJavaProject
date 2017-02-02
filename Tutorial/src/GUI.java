import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {

	private JButton reg;
	private JButton custom;
	
	public GUI() {
	
		super("The title");
		setLayout(new FlowLayout());
		setTitle("The title2");
		
		reg= new JButton("reg Button");
		add(reg);
		
		Icon pic= new ImageIcon(getClass().getResource("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert"));
		Icon pic2= new ImageIcon(getClass().getResource("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala"));
		custom = new JButton("Custom neki tekst", pic);
		custom.setRolloverIcon(pic2);
		add(custom);
				
	
	
	}
}
