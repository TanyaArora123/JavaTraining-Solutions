package com.ericsson.ui;

import java.util.Scanner;
import java.util.Set;

import com.ericsson.model.Product;
import com.ericssonB.service.ProductService;
import com.ericssonB.service.IProductService;

public class ProductClient {

    public static void main(String[] args) {
        int productId = 0;
        String productName = null;
        Double productPrice = 0.00;
        String productCategory = null;
        IProductService service = new ProductService();
        System.out.println("*********Product Management Application*******");
        while (true) {
            System.out.println("1.Add Product");
            System.out.println("2.Update Product");
            System.out.println("3.Delete Product");
            System.out.println("4.Get Product By Id");
            System.out.println("5.Get All Products");
            System.out.println("6.Get All Products By Category");
            System.out.println("7.Get All Products Between Prices");
            System.out.println("8.Get Products By ProductName");

            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Info To Add Product");
                    System.out.println("Enter Product Id ");
                    productId = scan.nextInt();
                    System.out.println("Enter Product Name ");
                    productName = scan.next();
                    System.out.println("Enter Product Price ");
                    productPrice = scan.nextDouble();
                    System.out.println("Enter Product Category ");
                    productCategory = scan.next();
                    Product pro = new Product( productId,  productName,  productPrice,  productCategory);
                    System.out.println(service.addProduct(pro));
                    break;
                case 2:
                    System.out.println("Enter Info To Update Product");
                    System.out.println("Enter Product Exsisting Id ");
                    productId = scan.nextInt();
                    System.out.println("Enter Product Name ");
                    productName = scan.next();
                    System.out.println("Enter Product Price ");
                    productPrice = scan.nextDouble();
                    System.out.println("Enter Product Category ");
                    productCategory = scan.next();
                    Product pro1 = new Product(productId,  productName,  productPrice,  productCategory);
                    System.out.println(service.updateProduct(pro1));
                    break;

                case 3:
                    System.out.println("Enter Product Exsisting Id ");
                    productId = scan.nextInt();
                    System.out.println(service.deleteProduct(productId));
                    break;

                case 4:
                    System.out.println("Enter Product Exsisting Id ");
                    productId = scan.nextInt();
                    System.out.println(service.getProductById(productId));
                    break;

                case 5:
                    System.out.println("All Product Info:");
                    Set<Product> products = service.getAllProducts();
                    products.stream().forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("All Product Info By Category:");
                    System.out.println("Enter Product Category ");
                    productCategory = scan.next();
                    Set<Product> products0 = service.getAllProductsByCategory(productCategory);
                    products0.stream().forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("All Products Info Inbetween Prices:");
                    System.out.println("Enter Product IntialPrice ");
                    productPrice = scan.nextDouble();
                    System.out.println("Enter Product FinalPrice ");
                    Double productPrice1 = scan.nextDouble();
                    Set<Product> products1 = service.getAllProductInBetweenPrices(productPrice,productPrice1);
                    products1.stream().forEach(System.out::println);
                    break;

                case 8:
                    System.out.println("All Product Info By Name:");
                    System.out.println("Enter Product Name ");
                    productName = scan.next();
                    Set<Product> products2 = service.getAllProductsByProductName(productName);
                    products2.stream().forEach(System.out::println);
                    break;

                default:
                    System.out.println("Thank You !!!!");
                    System.exit(0);
                    break;
            }
        }
    }

}