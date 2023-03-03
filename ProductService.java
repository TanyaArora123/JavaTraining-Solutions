package com.ericssonB.service;

import java.util.Set;

import com.ericsson.dao.ProductDaoImpl;
import com.ericsson.dao.IProductDao;
import com.ericsson.model.Product;

public class ProductService implements IProductService {

    IProductDao dao = new ProductDaoImpl();

    @Override
    public String addProduct(Product pro) {

        return dao.addProduct(pro);
    }

    @Override
    public String updateProduct(Product pro) {

        return dao.updateProduct(pro);
    }

    @Override
    public String deleteProduct(int productId) {

        return dao.deleteProduct(productId);
    }

    @Override
    public Product getProductById(int productId) {

        return dao.getProductById(productId);
    }

    @Override
    public Set<Product> getAllProducts() {

        return dao.getAllProducts();
    }

    @Override
    public Set<Product> getAllProductInBetweenPrices(Double intialPrice, Double finalPrice) {

        return dao.getAllProductInBetweenPrices(intialPrice,finalPrice);
    }

    @Override
    public Set<Product> getAllProductsByProductName(String productName) {

        return dao.getAllProductsByProductName(productName);
    }

    @Override
    public Set<Product> getAllProductsByCategory(String productCategory){
        return dao.getAllProductsByCategory(productCategory);
    }

}
