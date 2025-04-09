package org.example.creational.builder;

public class ProductDirector {
    private ProductBuilder productBuilder;

    public ProductDirector(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public void constructProduct(){
        productBuilder.buildId();
        productBuilder.buildName();
        productBuilder.buildDescription();
        productBuilder.buildCategory();
        productBuilder.buildQuantity();
    }

    public Product getProduct(){
        return productBuilder.getProduct();
    }
}
