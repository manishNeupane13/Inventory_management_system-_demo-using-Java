/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementSystem;

import java.awt.Color;
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
public final class product extends JFrame implements ActionListener {
 JPanel p1,p2,p3;
    JLabel productId,ProductName,Quantity,description,Category,bprice,sprice,list;
    JTextField ProIdtxt,Pronametxt,quantitytxt,destxt,spricetxt,bpricetxt;
   JButton add,update,delete,home ;
   JTable DefaultTable;
   
   public product()
   {
      initialize();
      setLayout();
      addComponent();
                //actionEvent(); 
  
   
   
   }
   public void initialize()
   {
   p1=new JPanel();
   p2=new JPanel();
   p3=new JPanel();
   
   productId=new JLabel("PRODUCT ID");
   ProductName=new JLabel("PRODUCT NAME");
   Quantity=new JLabel("QUANTITY");
   description=new JLabel("DESCRIPTION");
   Category=new JLabel("CATEGORIES");
   sprice =new JLabel("SELLING PRICE PER QUANTITY");
   bprice=new JLabel("BOUGHT PRICE PER QUANTITY");
   list=new JLabel("PRODUCT LIST");
   ProIdtxt=new JTextField(25);
   Pronametxt=new JTextField(25);
   quantitytxt=new JTextField(25);
   destxt=new JTextField(25);
  spricetxt=new JTextField(25);
   bpricetxt=new JTextField(25);
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
   p1.add(productId);
   p1.add(ProIdtxt);
   p1.add(ProductName);
   p1.add(Pronametxt);
   p1.add(Quantity);
   p1.add(quantitytxt);
    p1.add(bprice);
   p1.add(bpricetxt);
   p1.add(sprice);
   p1.add(spricetxt);
   p1.add(description);
   p1.add(destxt);
   p1.add(Category);
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
        product pro=new product();
        pro.setTitle("PRODUCT");
        pro.setSize(600,600);
        pro.setVisible(true);
        pro.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
