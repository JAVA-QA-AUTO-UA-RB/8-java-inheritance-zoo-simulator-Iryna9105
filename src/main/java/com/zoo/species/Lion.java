package com.zoo.species;

import com.zoo.animals.IEatable;
import com.zoo.animals.IPlayable;
import com.zoo.animals.ISleepable;
import com.zoo.animals.Mammal;

public class Lion extends Mammal implements IPlayable {

    public Lion(String name, int energyLevel, String furColor) {
        super(name, energyLevel, furColor);
    }

    @Override
    public void move() {
        System.out.println("Lion runs swiftly.");
        decreaseEnergyLevel(25);
    }

    @Override
    public void eat() {
        System.out.println( name + " is eating a large piece of meat!");
        increaseEnergyLevel(15);
    }

    @Override
    public void sleep() {
        System.out.println( name + " is tired and is resting now!");
        increaseEnergyLevel(25);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Рррр!");
        decreaseEnergyLevel(5);
    }

    public void hunt() {
        System.out.println( " Wow!" + name + " hunted his prey!");
        decreaseEnergyLevel(20);

    }

    @Override
    public void play() {
        System.out.println( name + " is playing with toy. Lion looks satisfied!");
        decreaseEnergyLevel(15);
        makeSound();

    }
}
