package com.ericssonB.service;


import java.util.Set;

import com.ericsson.model.Product;

public interface IProductService {

    public abstract String addProduct(Product pro);

    public abstract String updateProduct(Product pro);

    public abstract String deleteProduct(int productId);

    public abstract Product getProductById(int productId);

    public abstract Set<Product> getAllProducts();
    public abstract Set<Product> getAllProductsByCategory(String productCategory);

    public abstract Set<Product> getAllProductInBetweenPrices(Double intialPrice, Double finalPrice);

    public abstract Set<Product> getAllProductsByProductName(String productName);
}