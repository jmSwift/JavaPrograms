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


public class Gui {
    
    public static void userLoginGui(JPanel panel)
    {
        JLabel userLabel = new JLabel("Email");
        userLabel.setBounds(70,30,80,25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100,10,160,25);
        panel.add(userText);
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(70, 150, 80, 25);
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField(20);
        passwordLabel.setBounds(100, 40, 160,25);
        panel.add(passwordText);
        
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);
        
        JButton signUpButton = new JButton("Sign up");
        signUpButton.setBounds(180,80,80,25);
        panel.add(signUpButton);
        
        
        
        
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Demo");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        userLoginGui(panel);
        
        frame.setVisible(true);
        
    }
    
}
