/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementSystem;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public final class Home extends JFrame implements ActionListener{
    
 JButton user,product,category,customer,order;
 JLabel userlabel,productlabel,categorylabel,customerlabel,orderlabel;
  JPanel leftPanel,rightPanel;
 

   public  Home() {
        
    setLayout();
   initilize();
   setSize();
   addComponent();
    addActionEvent() ;
    
  
  
    }

  
 
 
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
   
 
 

    public static void main(String[] args)  {
    
    Home database = new Home();
    database.setTitle("Home");
    
    database.setDefaultCloseOperation(EXIT_ON_CLOSE);
    database.setSize(300,300);
    database.setVisible(true);
  
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==user){
       user m=new user();
        m.setVisible(true);
        dispose();
        }
        else if (e.getSource()==product){
        product pro=new product();
        pro.setVisible(true);
        dispose();
        
        }
        else if (e.getSource()==customer){
        Customer cus =new Customer();
        cus.setVisible(true);
        dispose();
        
        }
         else if (e.getSource()==category){
        Category cat =new Category();
         
        dispose();
        
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    