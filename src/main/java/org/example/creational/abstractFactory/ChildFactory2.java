package org.example.creational.abstractFactory;

public class ChildFactory2 implements ParentFactory{
    // Child Factory instantiating abstract products which are closely related
    // eg: Child Factory: Cruiser Vehicles Factory
    // AbstractProduct1: Bike, AbstractProduct2: Car
    // ConcreteProduct1: Royal Enfield Interceptor, ConcreteProduct2: Mahindra Thar
    @Override
    public AbstractProduct1 createProductOfType1() {
        return new ConcreteProduct4();
    }

    @Override
    public AbstractProduct2 createProductOfType2() {
        return new ConcreteProduct3();
    }
}
