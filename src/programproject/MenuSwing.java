
package programproject;

import java.util.*; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.io.*;
import javax.swing.table.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
 
    

public class MenuSwing extends JFrame{
   
 private JTable orderTable;
 private DefaultTableModel tableModel;
  int numberadd=0;
  int numberdelete=0;
  int Quantity=0;
  Meal m1; 
  Order order1;
  static int counter_row=0;
  double totalprice=0.0;
   boolean isreceipt=false;
  ArrayList<Meal>mealList =new ArrayList();
    MenuSwing(){
         
   ImageIcon icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10;
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
  p1.setBackground(Color.decode("#FBB117"));
  p3.setBackground(Color.white);
  p4.setBackground(Color.white);
  
  JLabel text1=new JLabel("𝑟𝑒𝑠𝑡𝑢𝑟𝑎𝑛𝑡 𝑠𝑒𝑟𝑣𝑖𝑐𝑒");
  text1.setBounds(5, 0, 200, 100);
  text1.setFont(new Font("BOLD", Font.BOLD, 23));
  text1.setForeground(Color.black);
   p4.add(text1);
   p1.add(p4);
  
  JButton DashBoardButton=new JButton("DashBoard");
  JButton MenuButton=new JButton("Menu");
  JButton SettingButton=new JButton("about");
  JButton help=new JButton("Help!");

    DashBoardButton.setBounds(1, 150, 200, 65);
    MenuButton.setBounds(1, 240, 200, 65);
    SettingButton.setBounds(1, 330, 200, 60);
    help.setBounds(0, 520, 80, 40);
    
     
    help.setContentAreaFilled(false);
    help.setBorderPainted(false);
    help.setFocusable(false);
    help.setForeground(Color.WHITE);
    
    DashBoardButton.setContentAreaFilled(false);
    DashBoardButton.setBorderPainted(true);
    DashBoardButton.setFocusable(false);
    DashBoardButton.setForeground(Color.WHITE);
    DashBoardButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    
   
    MenuButton.setContentAreaFilled(false);
    MenuButton.setBorderPainted(true);
    MenuButton.setFocusable(false);
    MenuButton.setForeground(Color.WHITE);
    MenuButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    
    SettingButton.setContentAreaFilled(false);
    SettingButton.setBorderPainted(true);
    SettingButton.setFocusable(false);
    SettingButton.setForeground(Color.WHITE);
    SettingButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    
    
    p1.add(DashBoardButton);
    p1.add(MenuButton);
    p1.add(SettingButton);
    p3.setLayout(null);
   

    
    help.addMouseListener(new MouseAdapter() {
     @Override
     public void mouseClicked(MouseEvent e){
      String helpmessage=JOptionPane.showInputDialog("Enter your matter for help you:");
      JOptionPane.showConfirmDialog(null, "we sure help you fastly!");
     }
     @Override
        public void mouseEntered(MouseEvent e) {
         
          help.setForeground(Color.RED);
          
               }

      @Override
        public void mouseExited(MouseEvent e) {
         help.setForeground(Color.WHITE);
               }
           });
    p1.add(help);
    
    DashBoardButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        new Customer();
        }
     @Override
        public void mouseEntered(MouseEvent e) {
          DashBoardButton.setContentAreaFilled(true);
          
          DashBoardButton.setBackground(Color.decode("#E8A317"));
               }

      @Override
        public void mouseExited(MouseEvent e) {
          DashBoardButton.setContentAreaFilled(false);
          DashBoardButton.setBorderPainted(true);
         
               }
           });
    
     
    
    MenuButton.addMouseListener(new MouseAdapter() {

     @Override
        public void mouseEntered(MouseEvent e) {
          MenuButton.setContentAreaFilled(true);
          
          MenuButton.setBackground(Color.decode("#E8A317"));
               }

      @Override
        public void mouseExited(MouseEvent e) {
          MenuButton.setContentAreaFilled(false);
          MenuButton.setBorderPainted(true);
         
               }
           });
     
    SettingButton.addMouseListener(new MouseAdapter() {
     @Override
        public void mouseClicked(MouseEvent e){
        new pFrame();
        
        }
        
     @Override
        public void mouseEntered(MouseEvent e) {
          SettingButton.setContentAreaFilled(true);
         //"#FFAE42"
          SettingButton.setBackground(Color.decode("#E8A317"));
               }

      @Override
        public void mouseExited(MouseEvent e) {
          SettingButton.setContentAreaFilled(false);
          SettingButton.setBorderPainted(true);
         
               }
           });
   
   
         JPanel p2=new JPanel();
          p2.setBounds(200, 5, 500, 650);
          p2.setBackground(Color.WHITE);
          p2.setLayout(new GridLayout(4,3,20,20));
          p2.setBorder(BorderFactory.createLineBorder(Color.white, 5));
         
           JLabel totalLabel=new JLabel("Total Price: "+totalprice+" $");
           totalLabel.setFont(new Font("bold",Font.BOLD,13));
           totalLabel.setBounds(50, 240, 150, 200);
    
         ArrayList<String> ingred=new ArrayList<>(Arrays.asList("rice & sous with chicken","grape leaves with rice inside","chicken & sous","meats & sous","Burger with cheese","Tomato & Chees","spackatee&chicken&sous","fishcooking by fry & sous","makarounah&sous","crisp chicken"));
          ArrayList <String> namemeals=new ArrayList(Arrays.asList("kabsa","yalanjee","Chicken ","shawarmah","Burger","pizza","Chicken Alfredo","fry fish","Pasta","Crispy"));
          ArrayList <Icon>photoes=new ArrayList(Arrays.asList(icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10));
          ArrayList <Double>pricemeal=new ArrayList(Arrays.asList(10.0,5.0,1.0,6.0,5.5,11.0,6.0,7.0,9.0,11.0));
          
          for (int i =0; i < 10; i++) {
              
            JPanel mealPanel = new JPanel();
             mealPanel.setBackground(Color.white);
             mealPanel.setLayout(new BorderLayout());
            double price=pricemeal.get(i);
            JLabel mealLabel,stringlabel;
            stringlabel = new JLabel(namemeals.get(i)+"  "+pricemeal.get(i)+" $", SwingConstants.CENTER);
            stringlabel.setPreferredSize(new Dimension( 100,15));
            JPanel delete_addpanel= new JPanel();
            delete_addpanel.setPreferredSize(new Dimension(150,25));
            delete_addpanel.setLayout(new BorderLayout());
            mealLabel= new JLabel();
            mealPanel.setPreferredSize(new Dimension(100, 200));
            mealLabel.setBackground(Color.white);
            mealLabel.setPreferredSize(new Dimension(100, 100));
            mealLabel.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00"),2));
            mealLabel.setIcon(photoes.get(i));
 
            JButton addButton=new JButton("add"); 
            addButton.setName(namemeals.get(i));
             addButton.setBackground(Color.decode("#FFBF00"));
             addButton.setPreferredSize(new Dimension(60, 20)); 
             
            JButton plusButton = new JButton("+"+ numberadd);
            plusButton.setBackground(Color.decode("#00CC66"));
            plusButton.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
             plusButton.setPreferredSize(new Dimension(60, 20));
             
             JButton delete=new JButton("-"+numberdelete); 
             delete.setBackground(Color.decode("#C11B17"));
             delete.setPreferredSize(new Dimension(50, 20)); 
             delete_addpanel.add(addButton,BorderLayout.EAST);
             delete_addpanel.add(plusButton,BorderLayout.CENTER);
             delete_addpanel.add(delete,BorderLayout.WEST);
              
            int mealIndex = i;
             
            plusButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
               //   playSound("src\\sound.m4a");
                  numberadd++;
                  Quantity++;
                 plusButton.setText("+ "+ (numberadd));
                 plusButton.getText();
                 ;
                  m1 =new Meal( namemeals.get(mealIndex),pricemeal.get(mealIndex),ingred.get(mealIndex));
                  mealList.add(m1);
         
                }
            });
            
            
       delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  //  playSound("src\\sound.m4a");
                    if(tableModel.getRowCount()==0&&(numberadd==0||numberdelete>=numberadd)){
                       JOptionPane.showMessageDialog(null, "you don't have any meal to delete!");
                   
                    }
                else if(Quantity>=0&&tableModel.getRowCount()!=0&&numberdelete<=Quantity){
                    numberdelete++;
                 if(orderTable.isRowSelected(counter_row)){
                    Quantity= (int) tableModel.getValueAt(counter_row, 2);
                    Quantity--;
                   delete.setText("- "+ (numberdelete));
                   delete.getText();
                    tableModel.setValueAt(Quantity, counter_row, 2);
                      tableModel.getValueAt(counter_row, 2);
                      double newprice = price*Quantity;
                        totalprice+=newprice;
                      tableModel.setValueAt(newprice, counter_row, 3);
                      tableModel.getValueAt(counter_row, 3);
                     totalLabel.setText("Total Price: "+totalprice+" $");
                     totalLabel.getText();
                    }
                 else {
                  JOptionPane.showMessageDialog(null, "select the row you want updait it !");
                   numberdelete=0;
                 }
                }
                }
                
            });
            
       addButton.addActionListener(new ActionListener() {
           
           
           
           
                @Override
              public void actionPerformed(ActionEvent e) {
                 // playSound("src\\sound.m4a");
                 if(tableModel.getRowCount()==0&&numberadd==0){
                     JOptionPane.showMessageDialog(null, "you don't have any meal to add!");
                    }
                 else if(tableModel.getRowCount()==0&&numberdelete<=numberadd){
                     Quantity= Quantity -numberdelete;
                     double newprice = price*numberadd;
                      totalprice+=newprice;
                  tableModel.addRow(new Object[]{mealIndex, namemeals.get(mealIndex), Quantity , newprice+"$"});
                       counter_row ++;
                        Meal.counter=Quantity;
                 totalLabel.setText("Total Price: "+totalprice+" $");
                 totalLabel.getText();                     
                    }
                 else if(tableModel.getRowCount()!=0 &&numberdelete==0){
                   double newprice = price*numberadd;
                   
                  totalprice+=newprice;
                  tableModel.addRow(new Object[]{mealIndex, namemeals.get(mealIndex), numberadd , newprice+"$"});
                       counter_row ++;
                  totalLabel.setText("Total Price: "+totalprice+" $");
                  totalLabel.getText();
 
                  }

              }
              
            });
       
       addButton.addMouseListener(new MouseAdapter() {
          @Override
        public void mouseClicked(MouseEvent e) {
                 numberadd=0;
                 numberdelete=0;
                  Quantity=0; 
        }
           });
               
            mealPanel.add(stringlabel,BorderLayout.NORTH);
            mealPanel.add(mealLabel,BorderLayout.CENTER);
            mealPanel.add(delete_addpanel,BorderLayout.SOUTH);
              p2.add(mealPanel);
                
              
               
          }
             
         
        JScrollPane scrollPane = new JScrollPane(p2);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(500, 600));   
        scrollPane.setBounds(220, 15, 475, 555);
       
          this.add(scrollPane , BorderLayout.EAST);
          scrollPane.setVisible(true);
            MenuButton.addActionListener((ActionEvent e)->{
               scrollPane.setVisible(true);
                 });
     
            // القسم الأيمن
        String[] columnNames = {"num","Product Name","Quantity ","Price "};
        tableModel = new DefaultTableModel(columnNames, 0);
        orderTable = new JTable(tableModel);
        orderTable.setPreferredSize(new Dimension(300, 300));       
        orderTable.setForeground(Color.CYAN.darker().darker());
        
        this.setupTableSelectionListener();
            JTableHeader header = orderTable.getTableHeader();
            header.setBackground(Color.decode("#FFBF00")); // تغيير خلفية الرأس
            header.setForeground(Color.WHITE); // تغيير لون النص
            header.setFont(new Font("Arial", Font.BOLD, 11));
        JScrollPane tableScrollPane = new JScrollPane(orderTable);
        tableScrollPane.setPreferredSize(new Dimension(300, 300));
         tableScrollPane.setBounds(20, 15, 280, 290);
         scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            protected void configureScrollBarColors() {
                this.thumbColor = Color.LIGHT_GRAY;
                this.trackColor = Color.white;
             }
        });
        tableScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            protected void configureScrollBarColors() {
                this.thumbColor = Color.LIGHT_GRAY;
                this.trackColor = Color.white;
            }
        });
        // إضافة الأقسام إلى الإطار
       p3.add(tableScrollPane);
       
   
     JLabel typeLabel=new JLabel("Type: ");
     typeLabel.setFont(new Font("bold",Font.BOLD,13));
     typeLabel.setBounds(60, 270, 100, 50);
     
     JLabel taxLabel=new JLabel("The Taxes is :");
     taxLabel.setFont(new Font("bold",Font.BOLD,13));
     taxLabel.setBounds(60, 380, 160, 50);
     taxLabel.setForeground(Color.BLUE);
     p3.add(taxLabel);
     
      String a[]={"inside resturant","Delivery","spicial &others"};
      JComboBox co=new JComboBox(a);
      co.setBackground(Color.white);
      co.setActionCommand("shahd");
      co.setBounds(100, 360, 170, 25);
      co.setFocusable(false);
      co.setBorder(new LineBorder(Color.WHITE, 1, false));
       InsertInfo insertInfo=new InsertInfo();
        insertInfo.completInfo(mealList,co.getItemAt(co.getSelectedIndex()).toString());
        System.out.println("here");
   co.setRenderer(new DefaultListCellRenderer() {
   
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (isSelected) {
                    component.setBackground(Color.decode("#C11B17"));
                    component.setForeground(Color.black);
                } else {
                    component.setBackground(Color.WHITE);
                    component.setForeground(Color.BLACK);
                }

                return component;
            }
        });
      //............this for add order...........
      JButton updaitButton=new JButton("UpDait");
      updaitButton.setBounds(30, 440, 250, 30);
      updaitButton.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00"), 2, true));
      updaitButton.setContentAreaFilled(false);
      updaitButton.setForeground(Color.decode("#FFBF00"));
      p3.add(updaitButton);
      
      JButton payButton=new JButton("Pay");
      payButton.setBounds(30, 480, 250, 30);
      payButton.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00"), 2, true));
      payButton.setContentAreaFilled(false);
      payButton.setForeground(Color.decode("#FFBF00"));
      
      JButton receiptButton=new JButton("Receipt");
      receiptButton.setBounds(180, 530, 100, 30);
      receiptButton.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00"), 2, true));
      receiptButton.setContentAreaFilled(false);//FFFACD
      receiptButton.setForeground(Color.decode("#FFBF00"));
      
      JButton removeAllButton=new JButton("removeAll");
      removeAllButton.setBounds(30, 530, 100, 30);
      removeAllButton.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00"), 2, true));
      removeAllButton.setContentAreaFilled(false);//FFFACD
      removeAllButton.setForeground(Color.decode("#FFBF00"));
     //..................................................
       SettingButton.addActionListener((ActionEvent echangecolor)->{
   
    });
      
      //.....................................................
       receiptButton.addMouseListener(new MouseAdapter() {
        
     @Override
        public void mouseEntered(MouseEvent e) {
          receiptButton.setContentAreaFilled(true);
          
               }

      @Override
        public void mouseExited(MouseEvent e) {
          receiptButton.setContentAreaFilled(false);
          receiptButton.setBorderPainted(true);
         
               }
           });
       removeAllButton.addMouseListener(new MouseAdapter() {
        
     @Override
        public void mouseEntered(MouseEvent e) {
          removeAllButton.setContentAreaFilled(true);
          
               }

      @Override
        public void mouseExited(MouseEvent e) {
          removeAllButton.setContentAreaFilled(false);
          removeAllButton.setBorderPainted(true);
         
               }
           });
       payButton.addMouseListener(new MouseAdapter() {
        
     @Override
        public void mouseEntered(MouseEvent e) {
          payButton.setContentAreaFilled(true);
          
               }

      @Override
        public void mouseExited(MouseEvent e) {
          payButton.setContentAreaFilled(false);
          payButton.setBorderPainted(true);
         
               }
           });
       updaitButton.addMouseListener(new MouseAdapter() {
     @Override
        public void mouseClicked(MouseEvent e) {
          String taxe=co.getItemAt(co.getSelectedIndex()).toString(); 
            if(taxe=="inside resturant"){
                taxLabel.setText("The Taxes is :"+1.0+" $");
                taxLabel.getText();
             }
            else if(taxe=="Delivery"){
                taxLabel.setText("The Taxes is :"+2.0+" $");
                 taxLabel.getText();
                    }
            else{ 
               taxLabel.setText("The Taxes is :"+0.0+" $");
               taxLabel.getText();
            }
           
        
        }  
             
     @Override
        public void mouseEntered(MouseEvent e) {
          updaitButton.setContentAreaFilled(true);
          
               }

      @Override
        public void mouseExited(MouseEvent e) {
          updaitButton.setContentAreaFilled(false);
          updaitButton.setBorderPainted(true);
         
               }
           });
       
       updaitButton.addActionListener((ActionEvent e)->{
         if(tableModel.getRowCount()!=0){ 
           totalprice=order1.getTotalPrice();
            totalLabel.setText("Total Price: "+totalprice+" $");
                  totalLabel.getText();
         }
         updaitButton.getMouseListeners();
            
        });
       
        receiptButton.addActionListener((ActionEvent e)->{
           // playSound("src\\sound.m4a");
            if(tableModel.getRowCount()==0){
           JOptionPane.showMessageDialog(null, "you don't have any order to receipt !");
           }
            else{
          order1=new Order(mealList, (String) co.getItemAt(co.getSelectedIndex()));
          for(Meal m:mealList){
              
             JOptionPane.showConfirmDialog(null,( m.PrintInfo()));
          }
           // JOptionPane.showConfirmDialog(null, "Are You Want Confirm This Order?");
            JOptionPane.showMessageDialog(null, "you  have been receipt successfully !");
              isreceipt=true;
            totalprice=order1.getTotalPrice();
            totalLabel.setText("Total Price: "+totalprice+" $");
                  totalLabel.getText();
            }
        });
        
       removeAllButton.addActionListener((ActionEvent e)->{
            // playSound("src\\sound.m4a");
           if(tableModel.getRowCount()==0){
           JOptionPane.showMessageDialog(null, "you don't have any order to remove");
           }
           else{
           tableModel.removeRow(orderTable.getSelectedRow());
           orderTable.repaint();
           mealList.remove(m1);
           order1.delete_order(order1, mealList);
           }
          });
  
        payButton.addActionListener((ActionEvent e)->{
           // playSound("src\\sound.m4a");
              if(tableModel.getRowCount()==0){
           JOptionPane.showMessageDialog(null, "you don't have any order to pay for it !");
           }
           else if(isreceipt==false){
               JOptionPane.showMessageDialog(null, "you don't make receipt!"); 
              }
              else {
           String messagepay=JOptionPane.showInputDialog("enter your number account :");
             int numberaccount=Integer.parseInt(messagepay);
             int length= messagepay.length();
              if((messagepay==null && messagepay.isEmpty())||length<8|| messagepay.contains("{[(-+_&^%*!@#]><)}")){
                  JOptionPane.showMessageDialog(null, "wrong in number!");
               }
               else {
                  JOptionPane.showConfirmDialog(null, "pay has been made succesfully");
                 
                //  mealList.remove(m1);
                  
                  }
              }
             
                          
           
          });
       
        
       
       
       
       
     p3.add(removeAllButton);
     p3.add(receiptButton);
     p3.add(payButton);   
     p3.add(co);
     p3.add(totalLabel);
     p3.add(typeLabel);
 
    add(p1,BorderLayout.WEST);
    add(p3,BorderLayout.EAST);
   
    
      MenuButton.addActionListener((ActionEvent e)->{
      p2.setVisible(true);
     
    });
    
    p1.setLayout(null);   
    
    p1.setVisible(true);
    p3.setVisible(true);
    p4.setVisible(true);
    setResizable(false);
  
   }

         private void setupTableSelectionListener() {
        orderTable.getSelectionModel().addListSelectionListener(event -> {
            counter_row = orderTable.getSelectedRow(); // تحديث الصف الحالي عند الاختيار
        });
    }
       
           static void playSound(String soundFile){
         
         try{
         File audiofile=new File(soundFile);
         AudioInputStream audiostrem=AudioSystem.getAudioInputStream(audiofile);
         Clip clip= AudioSystem.getClip();
         clip.open(audiostrem);
         clip.start();
         
         }
         catch(Exception excep){
           excep.printStackTrace();
         }

  }
         
           
//           
//           static void saveOrder(){
//               
//               try( BufferedWriter buffer=new BufferedWriter(new FileWriter(InsertInfo.getFoodFile(),true));PrintWriter printt=new PrintWriter(buffer)){
//            printt.println(nameText.getText()+","+emailfieldsign.getText()+","+passwordfieldsign.getText());
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//        }
//           }
         }

    

