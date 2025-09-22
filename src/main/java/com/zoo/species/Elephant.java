package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {

    public Elephant(String name, int age, int weight, int energyLevel, int happinessLevel, String furColor) {
        super(name, age, weight, energyLevel, happinessLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "says Тrubа-bа-bа! ");
    }

    public void spraySelf() {
        decreaseEnergyLevel(15);
        increaseHappinessLevel(20);
    }
}
