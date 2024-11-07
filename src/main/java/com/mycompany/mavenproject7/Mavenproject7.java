/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author Oleh
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        Product name = new Product("La mor", 4, 20);
        name.displayInfo();
        
    }
}
class Product{
    String name;
    int price;
    int quantity;
    
    Product(){
    
    }
    Product(String name){
        this.name = name;
    }
    Product(String name,int price){
        this.name = name;
        this.price = price;
    }
    Product(String name,int price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    void displayInfo(){
     System.out.printf("Name: %s Price: %d Qu: %d", name, price,quantity);
    }
}   
