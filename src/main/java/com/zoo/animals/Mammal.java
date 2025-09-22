package com.zoo.animals;

public class Mammal extends Animal {

    protected String furColor;


    public Mammal(String name, int age, double weight, int energyLevel, int happinessLevel, String furColor) {
      super(name, age, weight, energyLevel, happinessLevel );
      this.furColor = furColor;
    }

    public void groom() {
        increaseHappinessLevel(25);
        System.out.println(getName() + " liked the grooming!! Its happiness level has increased to " + happinessLevel);

    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrrrr");
    }

}
