package com.ericsson.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.ericsson.model.Product;

public class ProductDaoImpl implements IProductDao {

    HashMap<Integer, Product> products = new HashMap<Integer, Product>();

    @Override
    public String addProduct(Product pro) {
        products.put(pro.getProductId(), pro);
        return "Product Added Successfully";
    }

    @Override
    public String updateProduct(Product pro) {
        products.put(pro.getProductId(), pro);
        return "Product Updated Successfully";
    }

    @Override
    public String deleteProduct(int proId) {
        products.remove(proId);
        return "Product Deleted Successfully";
    }

    @Override
    public Product getProductById(int proId) {

        return products.get(proId);
    }

    @Override
    public Set<Product> getAllProducts() {
        HashSet<Product> productHashSet = new HashSet<Product>();
        Set<Integer> keys = products.keySet();
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            productHashSet.add(products.get(key));
        }
        return productHashSet;
    }

    @Override
    public Set<Product> getAllProductInBetweenPrices(Double intialPrice, Double finalPrice) {// 1000 2000

        HashSet<Product> productHashSet = new HashSet<Product>();// 500
        Set<Integer> keys = products.keySet();
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            Product pro = products.get(key);
            Double productPrice = pro.getProductPrice();
            if (productPrice >= intialPrice && productPrice <= finalPrice)
                productHashSet.add(pro);
        }
        return productHashSet;
    }

    @Override
    public Set<Product> getAllProductsByProductName(String productName) {
        HashSet<Product> productHashSet = new HashSet<Product>();
        Set<Integer> keys = products.keySet();
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            Product pro = products.get(key);
            if (pro.getProductName().equalsIgnoreCase(productName))
                productHashSet.add(pro);
        }
        return productHashSet;
    }
    @Override
    public Set<Product> getAllProductsByCategory(String productCategory) {
        HashSet<Product> productHashSet = new HashSet<Product>();
        Set<Integer> keys = products.keySet();
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            Product pro = products.get(key);
            if (pro.getProductCategory().equalsIgnoreCase(productCategory))
                productHashSet.add(pro);
        }
        return productHashSet;
    }

}