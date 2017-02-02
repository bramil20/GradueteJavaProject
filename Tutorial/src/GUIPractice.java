import javax.swing.JOptionPane;

public class GUIPractice {

	public static void main(String [] args){
		String firstMessage = JOptionPane.showInputDialog("Enter your first number");
		String secondMessage = JOptionPane.showInputDialog("Enter your second number");
		
		int firstNumber= Integer.parseInt(firstMessage);
		int secondNumber= Integer.parseInt(secondMessage);
		
		int sum = firstNumber + secondNumber;
		
		JOptionPane.showMessageDialog(null, "Your long expected answer is: "+sum, "the title",JOptionPane.PLAIN_MESSAGE);
		
	}
}
