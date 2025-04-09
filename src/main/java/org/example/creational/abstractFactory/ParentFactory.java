package org.example.creational.abstractFactory;

public interface ParentFactory {
    // Parent Factory class containing details about abstract products, to be used by Child Factories
    // Vehicles Factory
    AbstractProduct1 createProductOfType1();
    AbstractProduct2 createProductOfType2();
}
