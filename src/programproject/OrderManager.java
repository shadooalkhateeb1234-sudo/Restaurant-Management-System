/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programproject;

import java.util.List;

/**
 *
 * @author EslieM
 */
public class OrderManager {
    private List<Order>orders;
    private String password;
    private String email;
    static int count=0;
    public OrderManager() { }

    public OrderManager(String email, String password) {
        this.email = email;
        this.password = password; 
    }

    public OrderManager(List<Order> orders, String password) {
        this.orders = orders;
        this.password = password;
    }

    
    
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int managerNumber()
    {
        return count;
    }
    

   
}
