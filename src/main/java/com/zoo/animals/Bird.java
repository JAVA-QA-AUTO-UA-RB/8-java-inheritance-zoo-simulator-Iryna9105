package com.zoo.animals;

public abstract class Bird extends Animal {

    protected double wingSpan;

    public Bird(String name, int energyLevel, double wingSpan) {
        super(name, energyLevel);
        this.wingSpan = wingSpan;
    }

    public abstract void uniqueBirdAction();

    @Override
    public void makeSound() {
        System.out.println("Cheep-cheep");
        decreaseEnergyLevel(5);

    }

    public void fly() {
        decreaseEnergyLevel(20);
    }

}
