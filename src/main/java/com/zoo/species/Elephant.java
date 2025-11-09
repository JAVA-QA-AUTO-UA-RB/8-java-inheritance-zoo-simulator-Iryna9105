package com.zoo.species;

import com.zoo.animals.IPlayable;
import com.zoo.animals.Mammal;

public class Elephant extends Mammal implements IPlayable {

    public Elephant(String name, int energyLevel, String furColor) {
        super(name, energyLevel, furColor);
    }

    @Override
    public void move() {
        System.out.println("Elephant stomps heavily.");
        decreaseEnergyLevel(15);
    }

    @Override
    public void eat() {
        System.out.println( name + " is eating bananas! Yum Yum!");
        increaseEnergyLevel(20);
    }

    @Override
    public void sleep() {
        System.out.println( name + " is sleeping.");
        increaseEnergyLevel(20);

    }

    @Override
    public void makeSound() {
        System.out.println( name + "says Тrubа-bа-bа! ");
    }

    public void spraySelf() {
        System.out.println("The elephant is hot and he splashes water on himself.");
        increaseEnergyLevel(10);

    }

    @Override
    public void play() {
        System.out.println( name + "is playing with a branch of a tree!");
        decreaseEnergyLevel(10);
        makeSound();
    }
}
