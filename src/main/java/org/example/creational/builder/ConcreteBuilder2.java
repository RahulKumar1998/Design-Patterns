package org.example.creational.builder;

public class ConcreteBuilder2 implements ProductBuilder {
    private Product product = new Product();

    @Override
    public void buildId() {
        product.setId(2);
    }

    @Override
    public void buildName() {
        product.setName("name2");
    }

    @Override
    public void buildDescription() {
        product.setDescription("description2");
    }

    @Override
    public void buildCategory() {
        product.setCategory("category2");
    }

    @Override
    public void buildQuantity() {
        product.setQuantity(2);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
