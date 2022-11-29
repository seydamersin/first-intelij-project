package com.muates.example1.srp.service;

import com.muates.example1.srp.model.Product;

public class ProductServiceImpl implements IProductService {

    @Override
    public Product createProduct() {
        Product product = new Product();
        product.setProductName("Iphone11");
        product.setStock(5);
        product.setPrice(16000);
        return product;
    }

    @Override
    public Product getProduct() {
        return createProduct();
    }
}
