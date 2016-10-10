import javax.swing.JFrame;

public class TestSmiley
{
	public static void main(String[] args)
	{
		DrawSmiley panel = new DrawSmiley();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(230,230);
		app.setVisible(true);
		
	
	}
}