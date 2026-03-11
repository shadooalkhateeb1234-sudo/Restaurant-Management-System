
package programproject;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class InsertInfo {
    private static final String CustomerFileName="Customer.csv";
    private static final String ManagerFileName="Manager.csv";  
    private static final String FoodFileName="Food.csv";  

    
    private static final File CustomerFile=new File(CustomerFileName);
    private static final File ManagerFile=new File(ManagerFileName);
    private static final File FoodFile=new File(FoodFileName);

    public static File getFoodFile() {
        return FoodFile;
    }

    public static File getCustomerFile() {
        return CustomerFile;
    }

    public static File getManagerFile() {
        return ManagerFile;
    }

    

    
    
    
    
    
    private String name,email,password,type;
    private Customer customer;
    private OrderManager manager;
    private Order order;
    private PrintWriter managerWriter=null;
    private PrintWriter customerWriter=null;
    
    public  InsertInfo(String name,String email,String password)
    {
      this.name=name;
      this.email=email;
      this.password=password;
      
      customer=new Customer(name,email,password);
      File customerFile=new File("Customers\\"+name+".txt");
      try{
      customerWriter=new PrintWriter(new FileWriter(customerFile));
      customerWriter.println("customer name: "+name+"\n"+"email: "+email+" \n "+"password: "+password+" ."+"\n");
      customerWriter.flush();
      
      
      }
      catch(IOException e)
      {
          System.out.println(e.getMessage());
      }
      finally{
        if(customerWriter!=null)
        customerWriter.close();
      }
    }
    public InsertInfo(String email,String password,boolean isManager)
    {
      this.email=email;
      this.password=password; 
      if(isManager==true){
      manager=new OrderManager(email,password);
      
      File managerFile=new File("Managers\\manager "+OrderManager.count);
      
      try{
         managerWriter=new  PrintWriter(new FileWriter(managerFile));
         managerWriter.println("manager's email: "+email+" , "+"password: "+password+" .");
       
         managerWriter.flush();
      }
      catch(IOException e)
      {
          System.out.println(e.getMessage());
      }
      finally{
          
          if(managerWriter!=null)
              managerWriter.close();
      }
      }
      
    }
    InsertInfo()
    {
        
    }
    public  void  completInfo(ArrayList<Meal> meals,String type) 
    {
      meals=new ArrayList();
      order=new Order(meals,type);
      PrintWriter completWriter=null;
      File completFile=new File("kalb.txt");
      
      for(Meal m:meals)
      {
          System.out.println(true);
            
      try{  
        
      completWriter=new PrintWriter(new FileWriter(completFile));    
      completWriter.print("the order: "+m.getName()+" , "+m.getQuantity()+" , "+m.getPrice()+"\ntype: "+order.getType());
      completWriter.flush();
      }
      catch(IOException e)
      {
          System.out.println(e.getMessage());  
      }
    
      finally{
          if(customerWriter!=null)
          customerWriter.close();
      }
      
      }
    }
    
    
}

