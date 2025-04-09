package org.example.creational.abstractFactory;

public class ChildFactory1 implements ParentFactory {
    // Child Factory instantiating abstract products which are closely related
    // eg: Child Factory: Super Vehicles Factory
    // AbstractProduct1: Bike, AbstractProduct2: Car
    // ConcreteProduct1: Kawasaki Ninja, ConcreteProduct2: Lambhorgini gallardo
    @Override
    public AbstractProduct1 createProductOfType1() {
        return new ConcreteProduct1();
    }

    @Override
    public AbstractProduct2 createProductOfType2() {
        return new ConcreteProduct2();
    }
}
