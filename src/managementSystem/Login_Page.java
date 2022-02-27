/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementSystem;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author HP
 */
public final class Login_Page extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
      public Login_Page(String title ){
          
       super(title);
       setLayoutManager();
       setSize();
       addComponent();
       addActionEvent();
      }
      public void setLayoutManager() {
       setLayout(null);
    }
 
        public void addComponent() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        
        
      
       
      
      }
      public void setSize()
      {
       userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 250, 30);
        passwordField.setBounds(150, 220, 250, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
      }
        public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Login_Page login_Page = new Login_Page("LOGIN");
        
        login_Page.setVisible(true);
       login_Page. setBounds(10, 10, 370, 600);
        login_Page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == loginButton) {
            String userText;
            String passwordText;
            userText = userTextField.getText();
            passwordText = passwordField.getText();
            if (userText.equalsIgnoreCase("one") && passwordText.equalsIgnoreCase("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
               Home d=new Home();
                d.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            
           }
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
 
 
        }
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
