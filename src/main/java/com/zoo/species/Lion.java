package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {

    public Lion(String name, int age, double weight, int energyLevel, int happinessLevel, String furColor) {
        super(name, age, weight, energyLevel, happinessLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Рррр!");
    }

    public void hunt() {
        decreaseEnergyLevel(25);
    }

}
