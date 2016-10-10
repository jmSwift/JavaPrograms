 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoFactorAuthentication;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jose
 */
public class GUI extends JFrame{
    
    private JTextField emailField;
    private JTextField passWordField;
    
    private JButton loginButton;
    private JButton signUpButton;
    
    public static String email;
    public static String passWord;
    
    public static ArrayList<String> list  = new ArrayList<String>();
    
    
    public GUI()
    {
        super("Keystroke Authentication");
        setBounds(0,0,500,500);
        
        JPanel panel = new JPanel();
        
        JLabel emailLabel = new JLabel("Email",JLabel.RIGHT);
        emailLabel.setFont(new Font("Courier",Font.BOLD,12));
        //emailLabel.setText(" Email");
        
        emailField = new JTextField(20);
        panel.add(emailLabel);
        panel.add(emailField);
        
        
        JLabel passWordLabel = new JLabel("Password",JLabel.RIGHT);
        passWordLabel.setFont(new Font("Courier",Font.BOLD,12));
       // passWordLabel.setText("Password");
        
        passWordField = new JTextField(20);
        panel.add(passWordLabel);
        panel.add(passWordField);
        
       //panel.setLayout(new FlowLayout());
       //add(panel);
        add(panel, BorderLayout.CENTER);
        
        
        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Login");
        signUpButton = new JButton("Sign up");
        
        buttonPanel.add(loginButton);
        buttonPanel.add(signUpButton);
        
        add(buttonPanel,BorderLayout.SOUTH);
        
        loginButton.addActionListener(new ButtonListener());
        signUpButton.addActionListener(new ButtonListener());
        
        setResizable(false);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_ClOSE);
        
    }
    
    public static String getString()
    {
        return ("Email : " + email + "\nPassword: " + passWord);
    }
    
    private class ButtonListener implements ActionListener 
    {
    
    
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == loginButton)
                try
                {
                    email =  (emailField.getText());
                    passWord = (passWordField.getText());
                    
                    
                }
                catch(NumberFormatException ex)
                {
                    emailField.setText("illegal email");


                }
            else if(e.getSource() == signUpButton)
            {
                setVisible(false);
                signUpGui newAccount = new signUpGui();
            }
            System.out.println(getString());
        
        }
    }
 //-------------------------
    public class signUpGui extends JFrame {
    
    private JTextField emailField;
    private JTextField passWordField;
    
    private JButton createAccountButton;
    
    signUpGui()
    {
      super("Sign up Page");
        setBounds(0,0,500,500);
        
        JPanel panel = new JPanel();
        
        JLabel emailLabel = new JLabel("Email",JLabel.RIGHT);
        emailLabel.setFont(new Font("Courier",Font.BOLD,12));
        //emailLabel.setText(" Email");
        
        emailField = new JTextField(20);
        panel.add(emailLabel);
        panel.add(emailField);
        
        
        JLabel passWordLabel = new JLabel("Password",JLabel.RIGHT);
        passWordLabel.setFont(new Font("Courier",Font.BOLD,12));
       // passWordLabel.setText("Password");
        
        passWordField = new JTextField(20);
        panel.add(passWordLabel);
        panel.add(passWordField);
        
       //panel.setLayout(new FlowLayout());
       //add(panel);
        add(panel, BorderLayout.CENTER);
        
        
        JPanel buttonPanel = new JPanel();
        createAccountButton = new JButton("Create Account");
        //signUpButton = new JButton("Sign up");
        
        buttonPanel.add(createAccountButton);
        //buttonPanel.add(signUpButton);
        
        add(buttonPanel,BorderLayout.SOUTH);
        
        createAccountButton.addActionListener(new ButtonListener());
       // signUpButton.addActionListener(new GUI.ButtonListener());
        
        setResizable(false);
        setVisible(true);  
        
    }
    
    
}
    
}
