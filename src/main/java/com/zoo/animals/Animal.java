package com.zoo.animals;

public abstract class Animal implements IEatable, ISleepable {

    protected String name;
    protected int energyLevel = 100;




    public Animal(String name, int energyLevel) {
        this.name = name;
        setEnergyLevel(energyLevel);
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }


    public void setEnergyLevel(int energyLevel) {
        if (energyLevel < 0) {
            this.energyLevel = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }

    }
    public void increaseEnergyLevel(int i) {
        setEnergyLevel(this.energyLevel + i);
    }

    public void decreaseEnergyLevel(int i) {
        setEnergyLevel(this.energyLevel - i);
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Energy: " + energyLevel);
    }
}



