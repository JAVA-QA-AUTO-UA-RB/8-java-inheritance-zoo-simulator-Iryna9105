package com.zoo.species;

import com.zoo.animals.Bird;

public class Eagle extends Bird {

    public Eagle(String name, int age, double weight, int energyLevel, int happinessLevel, double wingSpan) {
        super(name, age, weight, energyLevel, happinessLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "says Kri-kri");
    }

    @Override
    public void fly() {
        decreaseEnergyLevel(20);
        System.out.println(getName() + " is tired. His energy level has decreased and is " + getEnergyLevel());
    }

}
