package com.zoo.animals;

public abstract class Mammal extends Animal {

    protected String furColor;


    public Mammal(String name, int energyLevel, String furColor) {
      super(name, energyLevel);
      this.furColor = furColor;
    }

    public abstract void move();

    public void groom() {
        System.out.println( name + " liked the grooming!!");
        increaseEnergyLevel(20);
    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrrrr");
    }

}
