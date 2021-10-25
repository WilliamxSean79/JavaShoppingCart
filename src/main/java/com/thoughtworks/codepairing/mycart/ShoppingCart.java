package com.thoughtworks.codepairing.mycart;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author polaris
 * @date 2021 10月 24 17:14
 **/
public class ShoppingCart {
    private Customer customer;
    private List<Product> products;


    public ShoppingCart(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }


    @Override
    public String toString() {
        return "Customer: "+customer.getName()+"\n"+"Bought: \n"+products.stream().map(product -> product.getName()+": "+product.getPrice()).collect(Collectors.joining("\n"));
    }

    public Order checkout(){
        double totalPrice = 0;
        int loyalPoints = 0;

        for (Product product : products) {
            if(product.getProductCode().startsWith("DIS_10")){
                totalPrice+=product.getPrice()*0.9;
                loyalPoints+=product.getPrice()/10;
            }
            else if(product.getProductCode().startsWith("DIS_15")){
                totalPrice += product.getPrice()*0.85;
                loyalPoints+=product.getPrice()/15;
            }
            else{
                totalPrice += product.getPrice();
                loyalPoints+=product.getPrice()/5;
            }
        }
        return new Order(totalPrice,loyalPoints);

    }
}
