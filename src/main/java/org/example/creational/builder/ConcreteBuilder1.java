package org.example.creational.builder;

public class ConcreteBuilder1 implements ProductBuilder {
    private Product product = new Product();

    @Override
    public void buildId() {
        product.setId(1);
    }

    @Override
    public void buildName() {
        product.setName("name1");
    }

    @Override
    public void buildDescription() {
        product.setDescription("description1");
    }

    @Override
    public void buildCategory() {
        product.setCategory("category1");
    }

    @Override
    public void buildQuantity() {
        product.setQuantity(1);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
