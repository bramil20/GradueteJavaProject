import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EventHandlingPractice extends JFrame {

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;

	private JPasswordField pass;

	public EventHandlingPractice() {
		super("The title");
		setLayout(new FlowLayout());

		item1 = new JTextField(10);
		add(item1);

		item2 = new JTextField("Enter text here");
		add(item2);

		item3 = new JTextField("uneditable", 10);
		item3.setEditable(false);
		add(item3);

		pass = new JPasswordField("Enter password");
		add(pass);

		TheHandler handler = new TheHandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		pass.addActionListener(handler);
	}

	private class TheHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event){
			
			String msg= "";
			if(event.getSource()==item1)
				msg = String.format("Field 1: %s", event.getActionCommand());
			else if (event.getSource()==item2)
				msg=String.format("Field 2: %s", event.getActionCommand());
			else if (event.getSource()==item3)
				msg=String.format("Field 3: %s", event.getActionCommand());
			else if (event.getSource()==pass)
				msg=String.format("Password field is: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
