package com.spring.quickstart.hello;

/**
 * Created by asus on 2019/2/25.
 */
public class Phone {
    private String brand;
    private int price;
    private String colour;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public Phone(){

    }
    public Phone(String brand, int price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }




}
