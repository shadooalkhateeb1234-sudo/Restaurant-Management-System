/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programproject;

import java.util.ArrayList;
import java.util.List;

public class Order {

     private List<Meal>meals=new ArrayList<>();
    boolean done;
    private String type;//inside resturant,delivery,spicial and others
    private   String status;//preparing,Delivered,canceled
     static int number_order=0;
     String name;

    public String getName() {
        return name;
    }
    


     public Order(){}
     public Order(List<Meal> meals,String type){
         this.meals=meals;
         this.type=type;
     }
   
    public Order(List<Meal> meals, String type,String status) {
        this.meals = meals;
        this.type = type;
        this.status = status;
    }
  
    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
  public double getTotalPrice( ){
    if(type=="inside resturant"){
        return meals.stream().mapToDouble( Meal::getPrice).sum()+1.0;
    }
    else if(type=="delivery"){
        return meals.stream().mapToDouble( Meal::getPrice).sum()+2.0;
    }
    else{
        return meals.stream().mapToDouble( Meal::getPrice).sum();
    }
    
    }
    
       public void delete_order(Order o,List<Meal> meals){
         setMeals(null);
          o=new Order( getMeals(),null,null);            
       }

 

}
