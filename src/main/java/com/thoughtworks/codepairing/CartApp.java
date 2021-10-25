package com.thoughtworks.codepairing;


import com.thoughtworks.codepairing.mycart.Customer;
import com.thoughtworks.codepairing.mycart.Order;
import com.thoughtworks.codepairing.mycart.Product;
import com.thoughtworks.codepairing.mycart.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author polaris
 * @date 2021 10月 24 17:14
 **/
public class CartApp {
    public static void main(String[] args) {
        Customer customer = new Customer("halo");

        Product apple = new Product(10,"DIS_0_p1","Apple");
        Product cola = new Product(20,"DIS_10_p2","Cola");
        Product phone = new Product(30,"DIS_15_p3","Phone");

        List<Product> products = new ArrayList<Product>();
        products.add(apple);
        products.add(cola);
        products.add(phone);

        ShoppingCart shoppingCart = new ShoppingCart(customer, products);
        Order order = shoppingCart.checkout();
        System.out.println(shoppingCart);
        System.out.println(order);
    }
}
