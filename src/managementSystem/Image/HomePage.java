/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementSystem.Image;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class HomePage {
    
    JButton user,product,category,customer,order;
 JLabel userlabel,productlabel,categorylabel,customerlabel,orderlabel;
  JPanel leftPanel,rightPanel;
 

   public  static void createHome() {
       JFrame frame = new JFrame();
       frame.setTitle("Home Page");
       frame.setSize(460,460);
       frame.setLocationRelativeTo(null);
       System.out.println("abcd");       
       
       
       
       
       
       
       frame.setVisible(true);
        
//    setLayout();
//   initilize();
//   setSize();
//   addComponent();
//    addActionEvent() ;
//    
   }

  
  
    }

  
 
 /*
 public void setLayout()
 {
leftPanel=new JPanel();
rightPanel=new JPanel();
setLayout(new GridLayout(1,0));
 leftPanel.setLayout(new GridLayout(0,1));
 rightPanel.setLayout(new GridLayout(0,1));
  }
 public void initilize(){
  ImageIcon ui =new ImageIcon( "C:\\Users\\HP\\Documents\\NetBeansProjects\\In dividual project\\src\\managementSystem\\Image\\user.png");
  user =new JButton(ui);
  ImageIcon pi =new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\In dividual project\\src\\managementSystem\\Image\\Product.png");
product=new JButton(pi);
  ImageIcon ci =new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\In dividual project\\src\\managementSystem\\Image\\category.png");
  category=new JButton(ci);
    ImageIcon cui =new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\In dividual project\\src\\managementSystem\\Image\\customer.png");
  customer=new JButton(cui);
    ImageIcon oi =new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\In dividual project\\src\\managementSystem\\Image\\order.png");
  order=new JButton(oi);
   
  userlabel=new JLabel("USER");
productlabel=new JLabel("PRODUCT");
categorylabel=new JLabel("CATEGORY");
customerlabel=new JLabel("CUSTOMER");
orderlabel=new JLabel("ORDER");
  
 
 }
 public void setSize()
 {
user.setBounds(50,50,100,60);
product.setBounds(50,50,100,60);
category.setBounds(50,50,100,60);
customer.setBounds(50,50,100,60);
order.setBounds(50,50,100,60);
 
 }
 public void addComponent(){
 add(leftPanel);
 add(rightPanel);
 leftPanel.add(user);
 leftPanel.add(product);
 leftPanel.add(category);
 leftPanel.add(customer);
 leftPanel.add(order);
rightPanel. add(userlabel);
 rightPanel.add(productlabel);
 rightPanel.add(categorylabel);
 rightPanel.add(customerlabel);
 rightPanel.add(orderlabel);
 
 
 
 }
public void addActionEvent() {

user.addActionListener(this);
product.addActionListener(this);
category.addActionListener(this);
customer.addActionListener(this);
order.addActionListener(this);;
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/