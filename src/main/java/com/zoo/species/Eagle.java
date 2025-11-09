package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IPlayable;

public class Eagle extends Bird implements IPlayable {

    public Eagle(String name, int energyLevel, double wingSpan) {
        super(name, energyLevel, wingSpan);
    }

    @Override
    public void uniqueBirdAction() {
        buildNest();
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating a mouse!");
        increaseEnergyLevel(25);
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping!");
        increaseEnergyLevel(15);

    }


    @Override
    public void makeSound() {
        System.out.println(name + "says Kri-kri");
    }

    @Override
    public void fly() {
        System.out.println("The eagle flew in and now wants to rest and raise its energy level.");
        decreaseEnergyLevel(20);
    }

    @Override
    public void play() {
        System.out.println( name + " is playing with its chicks.");
        decreaseEnergyLevel(10);
        makeSound();

    }

    private void buildNest() {
        System.out.println(name + " is building a beautiful nest!");
        int energy = getEnergyLevel();
        if (energy >= 25) {
            setEnergyLevel(energy - 25);
        } else {
            System.out.println(name + " doesn't have enough energy. He needs to rest.");
            decreaseEnergyLevel(20);
        }
    }

}

