package org.example.creational;

public class Prototype implements PrototypeInterface{

    private int rank;
    private String name;

    public Prototype(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    @Override
    public Prototype cloneIt() {
        return new Prototype(this.rank, this.name);
    }

    @Override
    public String toString() {
        return "Prototype [rank=" + rank + ", name=" + name + "]";
    }
}
