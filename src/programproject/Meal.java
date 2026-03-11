/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programproject;

/**
 *
 * @author EslieM
 */
public class Meal {
    private String name;
   private double price;
   private String ingredience;
   private int quantity=1;

    public int getQuantity() {
        return quantity;
    }
   static int counter=0;

    public Meal() {}

    public Meal(String name, double price) {
        this.name = name;
        this.price = price;
    }
   
   
    public Meal(String name, double price, String ingredience) {
        this.name = name;
        this.price = price;
        this.ingredience = ingredience;
    }
    public Meal(String name, double price,int quantity)
    {
      this.name = name;
      this.price = price; 
      this.quantity=quantity;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price*quantity;
    }

    public String PrintInfo() {
        return "Meal{" + "name=" + name + ", price=" + price + ", ingredience=" + ingredience + '}';
    }
    

    

    public String getIngredience() {
        return ingredience;
    }
}
