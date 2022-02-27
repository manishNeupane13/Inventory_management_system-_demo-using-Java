/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementSystem;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public final class Customer extends JFrame implements ActionListener {
JPanel p1,p2,p3;
    JLabel custId,custName,Address,Phone,Email,list;
    JTextField cusIdtxt,cusnametxt,addresstxt,phonetxt;
   JButton add,update,delete,home ;
   JTable DefaultTable;
   public Customer()
   {
    initialize();
      setLayout();
      addComponent();
   
   
   }
    public void initialize()
   {
   p1=new JPanel();
   p2=new JPanel();
   p3=new JPanel();
   
  custId=new JLabel("CUSTOMER ID");
   custName=new JLabel("CUSTOMER NAME");
   Address=new JLabel("ADDRESS");
   Phone=new JLabel("PHONE NUMBER");
   Email=new JLabel("E-MAIL");
  list=new JLabel("CUSTOMER LIST");
  
   cusIdtxt=new JTextField(25);
   cusnametxt=new JTextField(25);
   addresstxt=new JTextField(25);
   phonetxt=new JTextField(25);
   
   
   add=new JButton("ADD");
   update=new JButton("UPDATE");
   delete=new JButton("DELETE");
   home=new JButton("HOME");
   
   DefaultTable =new JTable(60,6);
   
    }
   public void setLayout()
   {
   setLayout(new GridLayout(1,0));
   
   p1.setLayout(new FlowLayout());
   p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
   p3.setLayout(new BoxLayout(p3,BoxLayout.X_AXIS));
   
   }
   public void addComponent()
   {
   add(p1);
   add(p2);
   p1.add(custId);
   p1.add(cusIdtxt);
   p1.add(custName);
   p1.add(cusnametxt);
   p1.add(Address);
   p1.add(addresstxt);
   p1.add(Phone);
   p1.add(phonetxt);
   
   p1.add(p3);
   p2.add(list);
   p2.add(DefaultTable);
   p3.add(add);
   p3.add(update);
   p3.add(delete);
   p3.add(home);
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Customer cus=new Customer();
        cus.setTitle("CUSTOMER");
        cus.setSize(600,600);
        cus.setVisible(true);
        cus.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
