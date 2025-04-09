package org.example.creational.builder;

public interface ProductBuilder {
    public void buildId();
    public void buildName();
    public void buildDescription();
    public void buildCategory();
    public void buildQuantity();
    Product getProduct();
}
