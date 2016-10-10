import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class labelDemo
{
	public static void main(String[] args)
	{
		
		
		ImageIcon labelIcon = new ImageIcon("Lakers.png");
		JLabel northLabel = new JLabel(labelIcon);
		northLabel.setText("north");
		JFrame app = new JFrame();
	
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(northLabel, BorderLayout.CENTER);
		app.setSize(300,300);
		//app.setSize(500,500);
		app.setVisible(true);
	}
}
		