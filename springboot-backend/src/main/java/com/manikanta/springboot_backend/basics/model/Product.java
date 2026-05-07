package com.manikanta.springboot_backend.basics.model;

public class Product {
    private  String name1;
    private double price1;

    public String getName()
    {
        return name1 ;
    }
    public double getPrice()
    {
        return price1;
    }

    public  void setName( String name)
    {
        name1=name;
    }
    public void setPrice(double price)
    {
        price1=price;
    }

}
