import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter 1 for Rectangles \nEnter 2 for Ovals");
		
		int choice = Integer.parseInt(input);
		
		Shapes panel = new Shapes(choice);
		
		JFrame newApp = new JFrame();
		
		newApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		newApp.add(panel);
		newApp.setSize(300,300);
		newApp.setVisible(true);
		

	}
}