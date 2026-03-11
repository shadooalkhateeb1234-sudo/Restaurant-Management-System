/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static programproject.MenuSwing.counter_row;



public class Managment_Swing extends JFrame {
 private JTable managerTable;
 private DefaultTableModel tableModel;
 String newname,newprice,namepath,ing ;
   
     Managment_Swing(){
    ImageIcon icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10,newphoto;
     icon1=new ImageIcon("src\\kabsa.jpg");
     icon2=new ImageIcon("src\\yalanjee.jpg");
     icon3=new ImageIcon("src\\Chicken.jpg");
     icon4=new ImageIcon("src\\shawarmah.png");
     icon5=new ImageIcon("src\\Burger.jpg");
     icon6=new ImageIcon("src\\pizza.jpg");
     icon7=new ImageIcon("src\\Chicken Alfredo.jpg");
     icon8=new ImageIcon("src\\fry_fish.jpg");
     icon9=new ImageIcon("src\\pasta.jpg");
     icon10=new ImageIcon("src\\crispy.jpg");
     newphoto=new ImageIcon("\\programProject\\src\\Tost&Eage.jpg");
  
     this.setTitle("Managment");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   setSize(1050,620);    
   setVisible(true);    
   setLayout(null);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JPanel p1=new JPanel();
  JPanel p3=new JPanel();
  JPanel p4=new JPanel();
 
  p1.setBounds(0, 0, 210, 600);
  p3.setBounds(710, 0, 400, 600);
  p4.setBounds(0, 0, 210, 100);
  p4.setLayout(null);
   
  //#FBB917
  //#C11B17احمر
  //#FFBF00
  //#FFFACDبيج
  p1.setBackground(Color.decode("#C11B17"));
  p3.setBackground(Color.decode("#C11B17"));
  p4.setBackground(Color.white);
  
  JLabel text1=new JLabel("𝑟𝑒𝑠𝑡𝑢𝑟𝑎𝑛𝑡 𝑠𝑒𝑟𝑣𝑖𝑐𝑒");
  text1.setBounds(5, 0, 200, 100);
  text1.setFont(new Font("BOLD", Font.BOLD, 23));
  text1.setForeground(Color.black);
   p4.add(text1);
   p1.add(p4);
  
  JButton Add=new JButton("Add Meal");
  JButton removeButton=new JButton("Remove");
  JButton editButton=new JButton("Edit");
   

    Add.setBounds(1, 150, 200, 65);
    removeButton.setBounds(1, 240, 200, 65);
    editButton.setBounds(1, 330, 200, 60);
     
     
    
    Add.setContentAreaFilled(false);
    Add.setBorderPainted(true);
    Add.setFocusable(false);
    Add.setForeground(Color.WHITE);
    Add.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    
   
    removeButton.setContentAreaFilled(false);
    removeButton.setBorderPainted(true);
    removeButton.setFocusable(false);
    removeButton.setForeground(Color.WHITE);
    removeButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    
    editButton.setContentAreaFilled(false);
    editButton.setBorderPainted(true);
    editButton.setFocusable(false);
    editButton.setForeground(Color.WHITE);
    editButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    
    
    p1.add(Add);
    p1.add(removeButton);
    p1.add(editButton);
    p3.setLayout(null);
   

    
   
    Add.addMouseListener(new MouseAdapter() {
        
     @Override
        public void mouseEntered(MouseEvent e) {
          Add.setContentAreaFilled(true);
          
          Add.setBackground(Color.decode("#E8A317"));
               }

      @Override
        public void mouseExited(MouseEvent e) {
          Add.setContentAreaFilled(false);
          Add.setBorderPainted(true);
         
               }
           });
    
     
    
    removeButton.addMouseListener(new MouseAdapter() {

     @Override
        public void mouseEntered(MouseEvent e) {
          removeButton.setContentAreaFilled(true);
          removeButton.setBackground(Color.decode("#E8A317"));
               }

      @Override
        public void mouseExited(MouseEvent e) {
          removeButton.setContentAreaFilled(false);
          removeButton.setBorderPainted(true);
         
               }
           });
     
    editButton.addMouseListener(new MouseAdapter() {
     @Override
        public void mouseClicked(MouseEvent e){
        
        
        }
        
     @Override
        public void mouseEntered(MouseEvent e) {
          editButton.setContentAreaFilled(true);
         //"#FFAE42"
          editButton.setBackground(Color.decode("#E8A317"));
               }

      @Override
        public void mouseExited(MouseEvent e) {
          editButton.setContentAreaFilled(false);
          editButton.setBorderPainted(true);
         
               }
           });
   
   
         JPanel p2=new JPanel();
          p2.setBounds(200, 5, 500, 650);
          p2.setBackground(Color.WHITE);
          p2.setLayout(new GridLayout(4,3,20,20));
          p2.setBorder(BorderFactory.createLineBorder(Color.white, 5));
         //..................................................
               
         String[] columnNames = {"Product Name","Price"};
        tableModel = new DefaultTableModel(columnNames, 0);
        managerTable = new JTable(tableModel);
        managerTable.setPreferredSize(new Dimension(110, 250));
        managerTable.setForeground(Color.BLUE);
        this.setupTableSelectionListener();
            JTableHeader header = managerTable.getTableHeader();
            header.setBackground(Color.decode("#FFBF00")); // تغيير خلفية الرأس
            header.setForeground(Color.WHITE); // تغيير لون النص
            header.setFont(new Font("Arial", Font.BOLD, 11));
        JScrollPane tableScrollPane = new JScrollPane(managerTable);
        tableScrollPane.setPreferredSize(new Dimension(110, 250));
         tableScrollPane.setBounds(10, 10, 300, 200);
        
        tableScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            protected void configureScrollBarColors() {
                this.thumbColor = Color.LIGHT_GRAY;
                this.trackColor = Color.white;
            }
        });
        // إضافة الأقسام إلى الإطار
       p3.add(tableScrollPane);
          
           
        //.....................................................
          ArrayList<String> ingred=new ArrayList<>(Arrays.asList("rice & sous with chicken","grape leaves with rice inside","chicken & sous","meats & sous","Burger with cheese","Tomato & Chees","spackatee&chicken&sous","fishcooking by fry & sous","makarounah&sous","crisp chicken"));
          ArrayList <String> namemeals=new ArrayList(Arrays.asList("kabsa","yalanjee","Chicken ","shawarmah","Burger","pizza","Chicken Alfredo","fry fish","Pasta","Crispy"));
          ArrayList <Icon>photoes=new ArrayList(Arrays.asList(icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10));
          ArrayList <Double>pricemeal=new ArrayList(Arrays.asList(10.0,5.0,1.0,6.0,5.5,11.0,6.0,7.0,9.0,11.0));
          
          for (int i =0; i < namemeals.size(); i++) {
              
            JPanel mealPanel = new JPanel();
             mealPanel.setBackground(Color.white);
             mealPanel.setLayout(new BorderLayout());
            double price=pricemeal.get(i);
            JLabel mealLabel,stringlabel,checklabel;
            stringlabel = new JLabel(namemeals.get(i)+"  "+pricemeal.get(i)+" $", SwingConstants.CENTER);
            stringlabel.setPreferredSize(new Dimension( 100,15));
             checklabel=new JLabel(); 
             checklabel.setPreferredSize(new Dimension(20,20));
             JCheckBox ch=new JCheckBox();
             ch.setName(namemeals.get(i));
              ch.setBackground(Color.WHITE);
              ch.setSize(20,20);
              
            int index=i;
            editButton.addActionListener((ActionEvent ac)->{
              ch.setVisible(true);
              checklabel.add(ch);
              checklabel.setVisible(true);
              mealPanel.add(checklabel,BorderLayout.SOUTH);
               });
            
            removeButton.addActionListener((ActionEvent e)->{
              if(ch.isSelected()==true){
               String name= ch.getName();
               if(namemeals.get(index)==name){
                  namemeals.remove(index);
                  photoes.remove(index);
                  pricemeal.remove(index);
                  p2.remove(index);
                  tableModel.removeRow(index);
                  p2.repaint();
               }
              }
            });
            
            Add.addActionListener((ActionEvent e)->{
             
                 newname= JOptionPane.showInputDialog("enter the name meal: ");
                 namemeals.add(newname);
                 
                 newprice= JOptionPane.showInputDialog("enter the price meal: ");
                 Double pricetodouble= Double.parseDouble(newname);
                 pricemeal.add(pricetodouble);
                 if(namemeals.get(index)==newname){
             tableModel.addRow(new Object[]{newname, pricetodouble+"$"});
                         }
             namepath= JOptionPane.showInputDialog("enter the path photo: ");
              photoes.add(newphoto);
              JLabel photoLabel= new JLabel();
            mealPanel.setPreferredSize(new Dimension(100, 200));
            photoLabel.setBackground(Color.white);
            photoLabel.setPreferredSize(new Dimension(100, 180));
            photoLabel.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00"),2));
            photoLabel.setIcon(photoes.get(photoes.size()));
            
                 ing = JOptionPane.showInputDialog("enter the ingredient meal: ");
                 ingred.add(ing);
                 FoodItem fI=new FoodItem(newname,pricetodouble,"\\programProject\\src\\Tost&Eage.jpg",ing);
                 mealPanel.add(ch);
                  
           JLabel name_pricelabel=new JLabel(namemeals.get(namemeals.size())+" "+ pricemeal.get(pricemeal.size())+"$");
            mealPanel.add(name_pricelabel,BorderLayout.NORTH);
            mealPanel.add(photoLabel,BorderLayout.CENTER);
  
                 p2.add(mealPanel);
                 p2.repaint();
               
              
            });
                    
            mealLabel= new JLabel();
            mealPanel.setPreferredSize(new Dimension(100, 200));
            mealLabel.setBackground(Color.white);
            mealLabel.setPreferredSize(new Dimension(100, 90));
            mealLabel.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00"),2));
            mealLabel.setIcon(photoes.get(index));
 
            mealPanel.add(stringlabel,BorderLayout.NORTH);
            mealPanel.add(mealLabel,BorderLayout.CENTER);
            p2.add(mealPanel);
            
           tableModel.addRow(new Object[]{namemeals.get(index), pricemeal.get(index)+"$"});
          
          }
       
        JScrollPane scrollPane = new JScrollPane(p2);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(500, 600));   
        scrollPane.setBounds(220, 15, 475, 555);
       
          this.add(scrollPane , BorderLayout.EAST);
          scrollPane.setVisible(true);
            
      scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            protected void configureScrollBarColors() {
                this.thumbColor = Color.LIGHT_GRAY;
                this.trackColor = Color.white;
             }
        });

 
      
      
      
      
      
      
      
      
      
      
    //..........................................
     Planner planner=new Planner();
     planner.setBounds(10, 250, 300, 200);
     p3.add(planner);
      
      MostCustomer mc=new MostCustomer();
      mc.setBounds(10, 250, 300, 200);
      p3.add(mc);
     
      
     JButton most_customer=new JButton("Always Customer");
     most_customer.setBounds(19, 465, 120, 30);
     most_customer.setForeground(Color.WHITE);
     most_customer.setContentAreaFilled(false);
     most_customer.setBorderPainted(true);
     most_customer.setBorder(BorderFactory.createLineBorder(Color.WHITE));
     p3.add(most_customer);
     
     JButton best_meal=new JButton("Best Meal");
     best_meal.setBounds(169, 465, 120, 30);
     best_meal.setForeground(Color.WHITE);
     best_meal.setContentAreaFilled(false);
     best_meal.setBorderPainted(true);
     best_meal.setBorder(BorderFactory.createLineBorder(Color.WHITE));
     p3.add(best_meal);
      best_meal.addActionListener((ActionEvent ebest)->{
        planner.setVisible(false);
         mc.setVisible(true);
      });
     most_customer.addActionListener((ActionEvent ecustomer)->{
        planner.setVisible(true);
        mc.setVisible(false);
       });
     
    p2.setVisible(true);
    add(p1,BorderLayout.WEST);
    add(p3,BorderLayout.EAST); 
    p1.setLayout(null);   
    p1.setVisible(true);
    p3.setVisible(true);
    p4.setVisible(true);
    setResizable(false);
     
     
     }
        private void setupTableSelectionListener() {
        managerTable.getSelectionModel().addListSelectionListener(event -> {
            counter_row = managerTable.getSelectedRow(); // تحديث الصف الحالي عند الاختيار
        });
    }
    
}