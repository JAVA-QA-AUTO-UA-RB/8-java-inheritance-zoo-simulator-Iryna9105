package com.zoo.animals;

public class Bird extends Animal {

    protected double wingSpan;

    public Bird(String name, int age, double weight, int energyLevel, int happinessLevel, double wingSpan) {
        super(name, age, weight, energyLevel, happinessLevel);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Cheep-cheep");
    }

    public void fly() {
        decreaseEnergyLevel(20);

    }

}
