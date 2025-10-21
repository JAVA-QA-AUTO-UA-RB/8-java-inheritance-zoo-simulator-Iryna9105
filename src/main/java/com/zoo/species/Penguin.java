package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IPlayable;

public class Penguin extends Bird implements IPlayable {

    public Penguin(String name, int energyLevel, double wingSpan) {
        super(name,  energyLevel,  wingSpan);
    }

    @Override
    public void uniqueBirdAction() {
        surfOnIce();
    }

    @Override
    public void eat() {
        System.out.println( name + " is eating a fish!");
        increaseEnergyLevel(15);

    }

    @Override
    public void sleep() {
        System.out.println( name + " is sleeping!");
        increaseEnergyLevel(25);

    }

    private void surfOnIce() {
        System.out.println( name + " is surfing on ice");
        int energy = getEnergyLevel();
        if (energy >= 20) {
            setEnergyLevel(energy - 20);
        } else {
            System.out.println(name + " doesn't have enough energy. He needs to rest or eat.");
        }
        decreaseEnergyLevel(15);
    };

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Krya-krya");
    }


    @Override
    public void fly() {
        swim();
    }

    public void swim() {
        System.out.println( name + " swam a lot and got tired. His energy level has decreased.");
        decreaseEnergyLevel(25);
    }

    @Override
    public void play() {
        System.out.println( name + " plays sliding on his stomach.");
        decreaseEnergyLevel(15);
        makeSound();

    }
}
