/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoFactorAuthentication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author jose
 */
public class SendingEmails {
    
    public static File file = new File("userInfo.txt");
        
    public static String emailFrom = "beastie805@yahoo.com";
    public static String pass = "Tantyana!";
    public static String host = "smtp.mail.yahoo.com";
   // public StringBuilder emailTo = new StringBuilder();
    
    public static String userEmail ="";
    public static String userPassword ="";
   
    public static Scanner input = new Scanner(System.in);
    
   
    
  
    
    public static boolean checkInfo(String username, String password) throws IOException
    {
        boolean accountValid = false;
        
        //PrintWriter output = new PrintWriter(new FileWriter(file, true));
        Scanner fileInput = new Scanner(file); // input reads from a file
        
        String textFileLine = (username + " " + password);
        String tempLine = "";
        
        //int lineNumber = 0;
        
        while(fileInput.hasNext())
        {
           tempLine = input.nextLine();
           // String [] tokens = textFileLine.split("\\s+");
          
            if(tempLine.equalsIgnoreCase(textFileLine));
            {
                return true;
            }
           // lineNumber++;
        }
        
        fileInput.close();
        
        if(accountValid == false)
            System.out.println("Incorrect Username or password");
        
        return accountValid;
        
    }
    
    public static void createNewFile(File file)
    {
        
    }
    
    public static void createAccount() throws IOException
    {
        PrintWriter output = new PrintWriter(new FileWriter(file, true));
        Scanner fileInput = new Scanner(file);
        String tempLine = "";
        
        boolean found = false;
        
        System.out.print("Enter your Email: ");
        userEmail = input.next();
        
      
       while(fileInput.hasNext())
       {
           tempLine = fileInput.nextLine();
           String tokens[] = tempLine.split("\\s+");
           
           if(tokens[0].equalsIgnoreCase(userEmail))
           {
               System.out.println("Email is already taken, please choose another");
               userEmail = input.next();
               
           }
       }
        
        System.out.print("Enter your password: ");
        userPassword = input.next();
        
        System.out.print("Re-enter your password: ");
        String secondPassword = input.next();
        
        while(!userPassword.equalsIgnoreCase(secondPassword))
        {
            System.out.print("Enter your password");
            userPassword = input.next();

            System.out.print("Re-enter your password: ");
            secondPassword = input.next();
        
        }
        
        output.println(userEmail + " " + userPassword);
        
        output.close();
        
        
    }
    
    public static String generateRandomCode()throws IOException
    {
       
        String code = "";
        
        Scanner scanner = new Scanner(file);
        int count = 0; 
        
        for(int i = 0; i < 6; i++)
            code += (int)(9*Math.random()+1);

        
        
        return code;
    }
    
    
    
    public static void main(String[] args)throws IOException,MessagingException
    {
        SendingEmails email= new SendingEmails();
       // MimeMessage message = new MimeMessage(session);
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server

        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.user", emailFrom);
        properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(session);
        Transport transport = session.getTransport("smtp");
        
        int choice;
        
        do{
        System.out.println("Menu");
        System.out.println("1.Login");
        System.out.println("2.Create Account");
        System.out.println("3.Exit");
        System.out.print("Choice : ");
        
        choice = input.nextInt();
        
        
        
            switch(choice)
            {
                case 1:System.out.print("Email: ");
                       userEmail = input.next();
                       System.out.print("Password: ");
                       userPassword = input.next();
                       //boolean infoReal = checkInfo(userEmail,userPassword)
                       if(checkInfo(userEmail,userPassword))
                       {

                         // Set From: header field of the header.
                         message.setFrom(new InternetAddress(emailFrom));

                         // Set To: header field of the header.
                         message.addRecipient(Message.RecipientType.TO,
                                                     new InternetAddress(userEmail));
                         String temp = generateRandomCode();
                         // Set Subject: header field
                         message.setSubject("Email Authentication Code");
                         //Actual message
                         message.setText("Here is your Authentication code: " + temp);

                           transport.connect(host, emailFrom, pass);
                           transport.sendMessage((message), message.getAllRecipients());
                           transport.close();

                         System.out.print("Enter authentication code: ");
                         String codeEntered = input.nextLine();

                         if(codeEntered.equals(temp))
                         {
                             System.out.println("Successful login!");
                             break;
                        } 
                       }
                       break;
                case 2:createAccount();
                       break;
                default:System.out.println("Program is now closing");
                        System.exit(0);
                        break;
            }
        }while(choice!=1 && choice!=2);
        
    }
}
    

        /*

        try{
           // Create a default MimeMessage object.
           //MimeMessage message = new MimeMessage(session);

           // Set From: header field of the header.
           message.setFrom(new InternetAddress(emailFrom));

           // Set To: header field of the header.
           message.addRecipient(Message.RecipientType.TO,
                                    new InternetAddress(userEmail));

           // Set Subject: header field
           message.setSubject("Email Authentication Code");

           // Now set the actual message
           message.setText("This is actual message");

           // Send message
           //Transport transport = session.getTransport("smtp");
           transport.connect(host, emailFrom, pass);
           transport.sendMessage(message, message.getAllRecipients());
           transport.close();
           System.out.println("Sent message successfully....");
        }catch (MessagingException mex) 
        {
           mex.printStackTrace();
        }

        /*


    }
}
    
*/
