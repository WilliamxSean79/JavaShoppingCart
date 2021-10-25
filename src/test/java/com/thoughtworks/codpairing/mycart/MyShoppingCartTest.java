package com.thoughtworks.codpairing.mycart;

import com.thoughtworks.codepairing.mycart.Customer;
import com.thoughtworks.codepairing.mycart.Order;
import com.thoughtworks.codepairing.mycart.Product;
import com.thoughtworks.codepairing.mycart.ShoppingCart;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * @author polaris
 * @date 2021 10月 24 17:15
 **/
public class MyShoppingCartTest {
        public static final int PRICE = 100;
        public static final String PRODUCT = "Product";
        Customer customer = new Customer("halo");

        @Test
        public void totalPriceWithNoDiscount(){
                Product product = new Product(PRICE,"DIS_0_a",PRODUCT);
                List<Product> products = new ArrayList<Product>();
                products.add(product);
                Order order = new ShoppingCart(customer,products).checkout();
                assertEquals((double)PRICE, order.getTotalPrice());
        }

        @Test
        public void loyalPointsWithNoDiscount() {
                Product product = new Product(PRICE,"DIS_0_a",PRODUCT);
                List<Product> products = new ArrayList<Product>();
                products.add(product);
                Order order = new ShoppingCart(customer,products).checkout();
                assertEquals(PRICE/5, order.getLoyalPoints());
        }

        @Test
        public void totalPriceWith10Discount(){
                Product product = new Product(PRICE,"DIS_10_a",PRODUCT);
                List<Product> products = new ArrayList<Product>();
                products.add(product);
                Order order = new ShoppingCart(customer,products).checkout();
                assertEquals((double)PRICE*0.9, order.getTotalPrice());
        }

        @Test
        public void loyalPointsWith10Discount() {
                Product product = new Product(PRICE,"DIS_10_a",PRODUCT);
                List<Product> products = new ArrayList<Product>();
                products.add(product);
                Order order = new ShoppingCart(customer,products).checkout();
                assertEquals(PRICE/10, order.getLoyalPoints());
        }

        @Test
        public void totalPriceWith15Discount(){
                Product product = new Product(PRICE,"DIS_15_a",PRODUCT);
                List<Product> products = new ArrayList<Product>();
                products.add(product);
                Order order = new ShoppingCart(customer,products).checkout();
                assertEquals((double)PRICE*0.85, order.getTotalPrice());
        }

        @Test
        public void loyalPointsWith15Discount() {
                Product product = new Product(PRICE,"DIS_15_a",PRODUCT);
                List<Product> products = new ArrayList<Product>();
                products.add(product);
                Order order = new ShoppingCart(customer,products).checkout();
                assertEquals(PRICE/15, order.getLoyalPoints());
        }
}
