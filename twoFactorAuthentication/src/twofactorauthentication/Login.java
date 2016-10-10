/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twofactorauthentication;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo application");
		frame.setSize(750, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(240, 150, 80, 35);
		panel.add(userLabel);

		JTextField userText = new JTextField(35);
		userText.setBounds(300, 150, 160, 35);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(240, 200, 80, 35);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(35);
		passwordText.setBounds(300, 200, 160, 35);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(220, 250, 80, 35);
		panel.add(loginButton);
		
		JButton registerButton = new JButton("register");
		registerButton.setBounds(370, 250, 80, 35);
		panel.add(registerButton);
	}

}
