package com.thoughtworks.codepairing.mycart;

/**
 * @author polaris
 * @date 2021 10月 24 17:13
 **/
public class Order {
    private double totalPrice;
    private int loyalPoints;

    public Order(double totalPrice, int loyalPoints) {
        this.totalPrice = totalPrice;
        this.loyalPoints = loyalPoints;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getLoyalPoints() {
        return loyalPoints;
    }

    @Override
    public String toString() {
        return "TotalPrice=" + totalPrice + "\n"+ "LoyalPoints=" + loyalPoints;
    }
}
