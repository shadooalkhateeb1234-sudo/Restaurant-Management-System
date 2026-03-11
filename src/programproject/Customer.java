/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programproject;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
 import java.util.*;
 import javax.swing.*;
import javax.swing.table.*;
 
public class Customer {
    
   private ArrayList<Order>orderList=new ArrayList<Order>();
   private static int counter=0;
   private String name;
   private String email;
   private String password;
   static int customNumber=0;
    PrintWriter customeFile=null;

     public Customer(ArrayList<Order> orderList, String name, String email, String password) {
        this.orderList = orderList;
        this.name = name;
        this.email = email;
        this.password = password;
        customNumber++;


    }

    
    public Customer() {
         JFrame DashBourd=new JFrame();
        DashBourd.setDefaultCloseOperation(3);
        DashBourd.setSize(1050, 620);
        DashBourd.setLayout((LayoutManager)null);
       JPanel panel = new JPanel();
        panel.setBounds(0, 0, 100, 620);
        panel.setBackground(Color.decode("#FFBF00"));
        panel.setVisible(true);
        Vector<String> columns = new Vector();
        columns.add("Order Number");
        columns.add("State");
        columns.add("The Bill");
        columns.add("The Order");
        new Vector();
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        JPanel panell = new JPanel();
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.decode("#FFBF00"));
        header.setForeground(Color.WHITE);
        panell.setBounds(100, 0, 960, 620);
        panell.setLayout(new BorderLayout());
        panell.setVisible(true);
        panell.add(tableScrollPane);
        DashBourd.add(panel);
        DashBourd.add(panell);
        DashBourd.setVisible(true);
    }
     
   
    Customer(String name,String email, String password) {
        this.name = name;
        this.email=email;
        this.password=password;
    }
    Customer(String email, String password)
    {
        this.email = name;

        this.password=password;      
    }
    void save(){
        //flash
        try {
            customeFile =new PrintWriter("customFile.txt"+customNumber);
            customeFile.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(customeFile!=null)
                customeFile.close();
        }
    }

    void newOrder(){
        Order order=new Order();
        counter++;
        try {
            customeFile =new PrintWriter("customFile.txt"+customNumber);
            customeFile.write(2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(customeFile!=null)
                customeFile.close();
        }
    }


}
