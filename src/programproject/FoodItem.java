/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programproject;

public class FoodItem
{
private String name;
private String imagePath;
private double price;
private String ingredients;
private int quantity;

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public FoodItem(String name, double price,String imagePath, String ingredients) {
        this.name = name;
        this.imagePath = imagePath;
        this.price = price;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }




}
