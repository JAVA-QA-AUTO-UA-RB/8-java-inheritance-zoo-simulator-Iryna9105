package com.zoo.animals;

public class Animal {

    protected String name;
    protected int age;
    protected double weight;
    protected int energyLevel = 100; // змінила модифікатор доступу з приватного, бо не було можливості наслідувати це поле.
    protected int happinessLevel = 100;
    protected int amountOfMeals = 0;


    public Animal(String name, int age, double weight, int energyLevel, int happinessLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        setEnergyLevel(energyLevel);
        setHappinessLevel(happinessLevel);

    }

    public void eat() {
        amountOfMeals ++;
        increaseEnergyLevel(20);
        increaseHappinessLevel(10);
        System.out.println(getName() + " ate and became more active and more happy. Its energy: " + energyLevel + " and level of happiness: " + happinessLevel);


    }

    public void sleep() {
        increaseEnergyLevel(30);
        increaseHappinessLevel(5);
        System.out.println(getName() + " has rested and is now in a good mood. Its energy: " + energyLevel + " and level of happiness: " + happinessLevel);
    }

    public void makeSound() {
        decreaseEnergyLevel(15);
        increaseHappinessLevel(5);
        System.out.println("Animal makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight());
        System.out.println("EnergyLevel: " + getEnergyLevel());
        System.out.println("HappinessLevel: " + getHappinessLevel());
        System.out.println("Meals today: " + getAmountOfMeals());
    }

    public int getAmountOfMeals () {
        return amountOfMeals;

    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
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

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        if (happinessLevel < 0) {
            this.happinessLevel = 0;
        } else if (happinessLevel > 100) {
            this.happinessLevel = 100;
        } else {
            this.happinessLevel = happinessLevel;
        }

    }

    public void increaseHappinessLevel(int h) {
        setHappinessLevel(this.happinessLevel + h);
    }

    }


