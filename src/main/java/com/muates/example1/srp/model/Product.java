package com.muates.example1.srp.model;

public class Product {

    private String productName;
    private Integer stock;
    private Integer price;

    public Product() {
    }

    public Product(String productName, Integer stock, Integer price) {
        this.productName = productName;
        this.stock = stock;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
