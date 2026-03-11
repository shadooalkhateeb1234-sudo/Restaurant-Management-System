 package programproject;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;



public class MainFrame_swing  {
    ArrayList <Meal>mList=new ArrayList();
    Order or1,or2,or3;
    boolean actioncancel=false;
    boolean actioncount=false;
     private OrderManager ordermanager;
     HashMap<String,String>login=new HashMap<String,String>();
     int count =0;
     Timer timer;





     static boolean isLoginVisible = true;
     JFrame loginFrame;
     ImageIcon imagelog;
     static JPanel leftPanel;
     JLabel titleLabelleft;
    static JTextField nameText;
     JLabel name;
     JLabel email;
    static JTextField emailfieldsign;
     JLabel passwordSign;
     static JPasswordField passwordfieldsign;
     JCheckBox checkpassword1;
     JButton sign_in;
     static JPanel rightPanel;
     JLabel titleLoginLabel;
     JLabel emaillogin;
     JTextField emailfieldLog;
     JLabel password2;
     JPasswordField passwordfieldLog;
     JButton forgetpassword;
     JButton loginButton;
     JCheckBox checkpassword2;
     JButton loginmanager;
     static JPanel Panelcover;
     static JLabel welcometitle;
     static JLabel texttitle,text;
     static JButton creatAccount;
     static JLabel errorPasswordLog;
     static JLabel errorEmailLog;
     static JLabel errorEmailSign;
     static JLabel errorPasswordSign;
      JLabel errorNameSign;



     public MainFrame_swing()
     {
          loginFrame=new JFrame("User_Login");
          loginFrame.setSize(1000, 600);
          loginFrame.setLayout(null);
          loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


          leftPanel = new JPanel();
          leftPanel.setBounds(0, 0, 500, 600);
          leftPanel.setLayout(null);
          leftPanel.setBackground(Color.white);

 class Iconlogin extends JPanel{
         private ImageIcon imagelog;
         Iconlogin(){
           imagelog=new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\User-Profile-PNG-File.png");  
         }
         @Override
         protected void paintComponent(Graphics g){
         super.paintComponent(g);
         int x=(getWidth()-imagelog.getIconWidth())/2;
         int y=(getHeight()-imagelog.getIconHeight())/2;
         g.drawImage(imagelog.getImage(),150,100,this);
         }
     }
 



              titleLabelleft = new JLabel("Sign In ^_^");
              titleLabelleft.setForeground(Color.decode("#FFBF00"));
              titleLabelleft.setFont(new Font("BOLD", Font.CENTER_BASELINE, 26));
              titleLabelleft.setBounds(160,160, 200, 100);
              Iconlogin photo=new Iconlogin();
              photo.setBounds(165, 30, 120, 120);
              leftPanel.add(photo);
              leftPanel.add(titleLabelleft);

              name=new JLabel("Name");
              name.setBounds(120, 250, 50, 20);
              leftPanel.add(name);



              nameText=new JTextField();
              nameText.setBounds(120,270, 220, 20);
              leftPanel.add(nameText);

              errorNameSign=new JLabel();
              errorNameSign.setBounds(120, 290, 250, 20);
              leftPanel.add(errorNameSign);

              email =new JLabel("Email:");
              email.setBounds(120, 310, 90, 20);
              leftPanel.add(email);

              emailfieldsign =new JTextField("");
              emailfieldsign.setBounds(120,330, 220, 20);
              leftPanel.add(emailfieldsign);


              errorEmailSign=new JLabel();
              errorEmailSign.setBounds(120, 350, 250, 20);
              leftPanel.add(errorEmailSign);

              passwordSign =new JLabel("Password:");
              passwordSign.setBounds(120, 370, 90, 20);
              leftPanel.add(passwordSign);

              passwordfieldsign =new JPasswordField();
              passwordfieldsign.setBounds(120,390, 220, 20);
              leftPanel.add(passwordfieldsign);

              errorPasswordSign=new JLabel();
              errorPasswordSign.setBounds(120, 410, 250, 20);
              leftPanel.add(errorPasswordSign);

              checkpassword1 =new JCheckBox();
              checkpassword1.setBounds(380,390, 18, 18);
              leftPanel.add(checkpassword1);

                checkpassword1.addActionListener((ActionEvent echeckpass)->{
               if(checkpassword1.isSelected()){
               passwordfieldsign.setEchoChar((char)0);
               }
               else{
                 passwordfieldsign.setEchoChar('*');
               }
           });

               sign_in=new JButton(" Sign In ");
               sign_in.setBounds(130,450,200, 30);
               sign_in.setForeground(Color.WHITE);
               sign_in.setFocusable(false);
               sign_in.setContentAreaFilled(true);
               sign_in.setBackground(Color.decode("#FFBF00"));
               sign_in.setBorderPainted(false);
               leftPanel.setVisible(false);
               leftPanel.add(sign_in);

          rightPanel = new JPanel();
          rightPanel.setBounds(500, 0, 500, 600);
          rightPanel.setBackground(Color.WHITE);
          rightPanel.setLayout(null);
          loginFrame.add(rightPanel);



          titleLoginLabel = new JLabel("Login");
          titleLoginLabel.setForeground(Color.decode("#FFBF00")); // اللون الذهبي
          titleLoginLabel.setFont(new Font("BOLD", Font.BOLD, 50));
          titleLoginLabel.setBounds(150,40, 200, 200);
          rightPanel.add(titleLoginLabel);

          emaillogin=new JLabel("Email:");
          emaillogin.setBounds(120, 250, 90, 20);
          rightPanel.add(emaillogin);


          errorEmailLog=new JLabel(" ");
          errorEmailLog.setBounds(120, 290, 250, 10);
          rightPanel.add(errorEmailLog);


          emailfieldLog=new JTextField("");
          emailfieldLog.setBounds(120,270, 220, 20);
          rightPanel.add(emailfieldLog);

          password2 =new JLabel("Password:");
          password2.setBounds(120, 300, 90, 20);
          rightPanel.add(password2);

           errorPasswordLog=new JLabel("");
           errorPasswordLog.setBounds(120, 345, 250, 10);
           rightPanel.add(errorPasswordLog);

          passwordfieldLog =new JPasswordField();
          passwordfieldLog.setBounds(120,320, 220, 20);
          rightPanel.add(passwordfieldLog);

              forgetpassword =new JButton("Are you forget your Password ?");
              forgetpassword.setBounds(110, 380, 220, 20);
              forgetpassword.setForeground(Color.PINK);
              forgetpassword.setFocusable(false);
              forgetpassword.setContentAreaFilled(false);
              forgetpassword.setBorderPainted(false);
              forgetpassword.setVisible(false);
              forgetpassword.addMouseListener(new MouseAdapter()
              {
                 @Override
                  public void mouseEntered(MouseEvent e)
                  {
                forgetpassword.setForeground(Color.decode("#FF3399"));
                  }

                 @Override
               public void mouseExited(MouseEvent e)
               {
                forgetpassword.setForeground(Color.PINK);
               }
           });
              rightPanel.add(forgetpassword);


               loginButton = new JButton("Login");
               loginButton.setBounds(130,410,200, 30);
               loginButton.setForeground(Color.WHITE);
               loginButton.setFocusable(false);
               loginButton.setContentAreaFilled(true);
               loginButton.setBackground(Color.decode("#FFBF00"));
               loginButton.setBorderPainted(false);
               rightPanel.add(loginButton);

              checkpassword2=new JCheckBox();
              checkpassword2.setBounds(350,300, 18, 18);
              rightPanel.add(checkpassword2);

           checkpassword2.addActionListener((ActionEvent echeckpass)->{
               if(checkpassword2.isSelected())
               {
               passwordfieldLog.setEchoChar((char)0);
               }
               else
               {
                 passwordfieldLog.setEchoChar('*');
               }
           });

               loginmanager =new JButton(" As Manager ");
               loginmanager.setBounds(130,450,200, 30);
               loginmanager.setForeground(Color.decode("#FFBF00"));
               loginmanager.setFocusable(false);
               loginmanager.setContentAreaFilled(false);
               loginmanager.setBackground(Color.decode("#FFBF00"));
               loginmanager.setBorderPainted(true);
               loginmanager.setBorder(BorderFactory.createLineBorder(Color.decode("#FFBF00")));
               rightPanel.add(loginmanager);
 
          Panelcover = new JPanel();
          Panelcover.setSize(500, 600);
          Panelcover.setBackground(Color.decode("#FFBF00"));
          Panelcover.setLayout(new GridBagLayout());
          GridBagConstraints gbc=new GridBagConstraints();
          gbc.fill=GridBagConstraints.FIRST_LINE_START;
          gbc.insets=new Insets(15,15,15,15);
          gbc.gridx=0;
          gbc.gridy=0;

          welcometitle = new JLabel("Hello,friend!");
          welcometitle.setForeground(Color.WHITE);
          welcometitle.setFont(new Font("BOLD", Font.BOLD, 45));
          //welcometitle.setBounds(100, 100, 200, 200);
          Panelcover.add(welcometitle,gbc);

          texttitle = new JLabel("enter your information please ^_^");
          texttitle.setForeground(Color.WHITE);
          texttitle.setFont(new Font("BOLD", Font.ROMAN_BASELINE, 14));
          gbc.gridy=1;
          Panelcover.add(texttitle,gbc);

          text=new JLabel("(email & password) for joining us.");
          text.setForeground(Color.WHITE);
          text.setFont(new Font("BOLD", Font.ROMAN_BASELINE, 14));
          gbc.gridy=2;
          Panelcover.add(text,gbc);

          creatAccount=new JButton("Creat new Account");
          gbc.gridy=3;
          creatAccount.setForeground(Color.WHITE);
          creatAccount.setFocusable(false);
          creatAccount.setVisible(false);
          creatAccount.setContentAreaFilled(true);
          creatAccount.setBackground(Color.decode("#FF4500"));
          creatAccount.setBorderPainted(true);
          Panelcover.add(creatAccount,gbc);
          Panelcover.setVisible(true);

          creatAccount.addActionListener(new ActionListener() {
       @Override
            public void actionPerformed(ActionEvent e) {
              MainFrame_swing .togglePanels();

            }
        });
           loginFrame.add(Panelcover);
           loginFrame.add(leftPanel);




           loginmanager.addActionListener((ActionEvent emanager)->{
               try{
                 MainFrame_swing.cheackEmail(emailfieldLog.getText());
               }catch(MyException e){

                   errorEmailLog.setForeground(Color.red);
                   errorEmailLog.setText(e.getMessage());
                   errorEmailLog.setVisible(true);

               }
               try{
                   MainFrame_swing.cheackPassword(passwordfieldLog.getText());
               }
               catch(MyException e){
                   errorPasswordLog.setForeground(Color.red);
                   errorPasswordLog.setText(e.getMessage());
                   errorPasswordLog.setVisible(true);
                  
               }
               
               
                try( BufferedReader buffer=new BufferedReader(new FileReader(InsertInfo.getCustomerFile())))
        {
             boolean chackEmail=false;
             boolean chackPassword=false;
               String Line;
                   while((Line=buffer.readLine())!=null)
                   {
                       String []row=Line.split(",");
                       
        
                if(!(row.length>1&&row[1].equals(emailfieldLog.getText())))
                {
                   
                     errorEmailLog.setForeground(Color.red);
                     errorEmailLog.setText("you entered wrong email");
                     errorEmailLog.setVisible(true);
                    
                }
                else
                {
                    chackEmail=true;
                }
                if(!(row.length>2&&row[2].equals(passwordfieldLog.getText())))
                {
                     errorPasswordLog.setForeground(Color.red);
                     errorPasswordLog.setText("you entered wrong password");
                     errorPasswordLog.setVisible(true);
                     forgetpassword.setVisible(true); 
                }
                else
                {
                  chackPassword=true;  
                }
                
                if(chackPassword&&chackEmail)
                {
                    new Managment_Swing();
                }
                               
                   }
        }
               catch(IOException e){
                  e.printStackTrace();
               }
      







         
           });


            sign_in.addActionListener((ActionEvent esign)->{
                 try{
                 MainFrame_swing.cheackEmail(emailfieldsign.getText());
               }catch(MyException e){

                   errorEmailSign.setForeground(Color.red);
                   errorEmailSign.setText(e.getMessage());
                   errorEmailSign.setVisible(true);

               }
               try{
                   MainFrame_swing.cheackPassword(passwordfieldsign.getText());
               }
               catch(MyException e){
                   errorPasswordSign.setForeground(Color.red);
                   errorPasswordSign.setText(e.getMessage());
                   errorPasswordSign.setVisible(true);
               }
               try{
                   MainFrame_swing.cheackName(nameText.getText());
               }
               catch(MyException e){
               
                   errorNameSign.setForeground(Color.red);
                   errorNameSign.setText(e.getMessage());
                   errorNameSign.setVisible(true);
               }
               try{
               if(cheackName(nameText.getText())&&cheackPassword(passwordfieldsign.getText())&&cheackEmail(emailfieldsign.getText()))
              MainFrame_swing.saveCustomer();
               new MenuSwing();
               }
               catch(MyException e){
                   System.out.println("");
               }
                });
           // .............................................

              loginButton.addActionListener((ActionEvent enext)->{

            try{
                 MainFrame_swing.cheackEmail(emailfieldLog.getText());
               }catch(MyException e){

                   errorEmailLog.setForeground(Color.red);
                   errorEmailLog.setText(e.getMessage());
                   errorEmailLog.setVisible(true);

               }
               try{
                   MainFrame_swing.cheackPassword(passwordfieldLog.getText());
               }
               catch(MyException e){
                   errorPasswordLog.setForeground(Color.red);
                   errorPasswordLog.setText(e.getMessage());
                   errorPasswordLog.setVisible(true);
               }


         try( BufferedReader buffer=new BufferedReader(new FileReader(InsertInfo.getCustomerFile())))
        {
             boolean chackEmail=false;
             boolean chackPassword=false;
               String Line;
                   while((Line=buffer.readLine())!=null)
                   {
                       String []row=Line.split(",");
                       
                      //  System.out.println(+row[i]);
                          //  String[] row=line.split(",");
                if(!(row.length>1&&row[1].equals(emailfieldLog.getText())))
                {
                   
                     errorEmailLog.setForeground(Color.red);
                     errorEmailLog.setText("you don't have an account sign up first");
                     errorEmailLog.setVisible(true);
                     creatAccount.setVisible(true);

                    
                }
                else
                {
                    chackEmail=true;
                }
                if(!(row.length>2&&row[2].equals(passwordfieldLog.getText())))
                {
                     errorPasswordLog.setForeground(Color.red);
                     errorPasswordLog.setText("wrong password");
                     errorPasswordLog.setVisible(true);
                     forgetpassword.setVisible(true); 
                }
                else
                {
                  chackPassword=true;  
                }
                
                if(chackPassword&&chackEmail)
                {
                    new MenuSwing();
                }
                               
                   }
        }
               catch(IOException e){
                  e.printStackTrace();
               }
      
       });






                loginFrame.setLayout(null);
                loginFrame.setResizable(false);
                loginFrame.setVisible(true);

     }



      static void togglePanels()
      {
        if (isLoginVisible)
        {

           leftPanel.setVisible(false);
           rightPanel.setVisible(true);
             welcometitle.setText("Hello,friend!");
             welcometitle.getText();
             text.setText("(email & password) for joining us.");
             text.getText();
            Panelcover.setBounds(0, 0, 500, 600);
            isLoginVisible = false;
            creatAccount.setText(" Creat new Account ");
            creatAccount.getText();
        }
        else
           {
             leftPanel.setVisible(true);
             rightPanel.setVisible(false);
             welcometitle.setText("Welcome Back!");
             welcometitle.getText();
              text.setText("(TotalName & email & password) for joining us.");
              text.getText();
            Panelcover.setBounds(500, 0, 500, 600);
            isLoginVisible = true;
            creatAccount.setText(" Enter your Account! ");
            }


}
      
      static boolean cheackName(String name)throws MyException{
          if(nameText.getText().isEmpty())
               throw new MyException("please enter the name");
          else if((nameText.getText().matches("^[a-zA-Z0-9]")))
               throw new MyException("you entered wrong character ");
          return true;

      }

     static boolean cheackEmail(String email)throws MyException
     {
            if(email.isEmpty())
            {
              throw new MyException("please enter the email");
            }
           else if(email.matches("^[a-zA-Z0-9]&&[@.]"))
                {
                  throw new MyException("you entered wrong charecter");
                }
            return true;
         
     }



     static boolean cheackPassword(String password)throws MyException
     {

            if(password.isEmpty())
            {
              throw new MyException("please enter the password");
            }
        
          else  if(password.length()<8&&password.length()>20)
            {
              throw new MyException("you entered an valid password");

            }
            return true;
         

     }
     static void saveCustomer(){
        
         try( BufferedWriter buffer=new BufferedWriter(new FileWriter(InsertInfo.getCustomerFile(),true));PrintWriter printt=new PrintWriter(buffer)){
            printt.println(nameText.getText()+","+emailfieldsign.getText()+","+passwordfieldsign.getText());
         } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
         
         
     }



}