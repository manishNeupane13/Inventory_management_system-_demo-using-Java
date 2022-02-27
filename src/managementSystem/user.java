/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementSystem;

/**
 *
 * @author HP
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public final class user extends JFrame implements ActionListener {

   JPanel leftPanel,middlepanel, rightPanel;
	JLabel label1, label2, label3,label4,list;
	JTextField name, email, phone,userId;
	JButton b1, b2, b3, b4;
        JTable defaulttable;
        
        public user()
        {
       
		initializeAll();
                setLayout();
                addcomponent();
                actionEvent();
        }
        public void initializeAll() {
		label1 = new JLabel("Name");
                label4=new JLabel("User Id");
		label2 = new JLabel("Email");
		label3 = new JLabel("Phone Number");
                list =new JLabel("USER LIST");
		name = new JTextField(25);
		email = new JTextField(25);
		phone = new JTextField(25);
                userId=new JTextField(25);
		
                b1 = new JButton("ADD");
		b2 = new JButton("UPDATE");
		b3 = new JButton("DELETE");
		b4 = new JButton("HOME");
                defaulttable=new JTable(40,4);

	}
	public void setLayout(){	
        setLayout(new GridLayout(1, 2));
		leftPanel = new JPanel();
                middlepanel=new JPanel();
                rightPanel = new JPanel();
                rightPanel.setBackground(Color.BLUE);
		leftPanel.setLayout(new FlowLayout());
                middlepanel.setLayout(new BoxLayout(middlepanel,BoxLayout.Y_AXIS));
                rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.X_AXIS));
        }
        public void addcomponent()
        {
		add(leftPanel);
                add(middlepanel);
		
                
		leftPanel.add(label1);
		leftPanel.add(name);
                leftPanel.add(label4);
                leftPanel.add(userId);
		leftPanel.add(label2);
		leftPanel.add(email);
		leftPanel.add(label3);
		leftPanel.add(phone);
                leftPanel.add(rightPanel);
                middlepanel.add(list);
                middlepanel.add(defaulttable);
                rightPanel.add(b1);
		rightPanel.add(b2);
                rightPanel.add(b3);
		rightPanel.add(b4);
        }       
		
 public void actionEvent()
{
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
	

	
        
        
        
        
    public static void main(String[] args) {
       // TODO code application logic here
       user us = new user();
       us.setTitle("USER");
         us.setSize(600, 700);
       us.setDefaultCloseOperation(EXIT_ON_CLOSE);
		us.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
