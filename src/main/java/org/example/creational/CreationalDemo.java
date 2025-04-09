package org.example.creational;

import org.example.creational.abstractFactory.*;

import java.util.Scanner;

public class CreationalDemo {
    private static ParentFactory parentFactory;
    public static void main(String[] args) {
        //abstract factory implementation from client code:

        try{
            int productType;
            Scanner sc = new Scanner(System.in);
            productType = sc.nextInt();
            if(productType == 1){
                parentFactory = new ChildFactory1();
            }
            else if(productType == 2){
                parentFactory = new ChildFactory2();
            }
            else{
                throw new IllegalArgumentException("Invalid product type");
            }
            //use factory to create concrete products:
            AbstractProduct1 concreteProduct1 = parentFactory.createProductOfType1();
            AbstractProduct2 concreteProduct2 = parentFactory.createProductOfType2();

            concreteProduct1.details();
            concreteProduct2.information();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
