package com.thoughtworks.codepairing.mycart;

import java.util.List;

/**
 * @author polaris
 * @date 2021 10月 24 17:13
 **/
public class Product {
    private double price;
    private String productCode;
    private String name;

    public Product(double price, String productCode, String name) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }
}

