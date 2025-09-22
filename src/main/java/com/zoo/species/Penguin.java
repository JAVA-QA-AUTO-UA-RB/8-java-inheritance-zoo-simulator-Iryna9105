package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {

    public Penguin(String name, int age, double weight, int energyLevel, int happinessLevel, double wingSpan) {
        super(name, age, weight, energyLevel, happinessLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Krya-krya");
    }


    @Override
    public void fly() {
        swim();
    }

    public void swim() {
        decreaseEnergyLevel(15);
        increaseHappinessLevel(10);
        System.out.println(getName() + " is tired. His energy level has decreased and is " + getEnergyLevel());
    }

}
