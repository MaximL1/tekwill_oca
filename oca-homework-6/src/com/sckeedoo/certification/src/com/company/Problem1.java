package com.company;

public class Problem1 {

    static class Animal {
        String name;
        int numberOfLegs;
        double weight;
    }

    /**
     * Create an Animal object. Give it a state (name, numberOfLegs, weight)
     * print the object in this format : ex Animal = {name='Mickey', age=110, numberOfLegs=2}
     *
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name="Vasika";
        animal.weight=4.6;
        animal.numberOfLegs=3;

        System.out.println("Animal = {name='"+animal.name+"'"+", weight="+animal.weight+", numberOfLegs="+animal.numberOfLegs+"}");
    }
}
