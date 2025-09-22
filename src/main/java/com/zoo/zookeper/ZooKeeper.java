package com.zoo.zookeper;

import com.zoo.animals.Animal;

public class ZooKeeper {

    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding the " + animal.getName() + "!");
        animal.eat();

    }

    public void playWithAnimal(Animal animal) {
        System.out.println(name + "is playing with a " + animal.getName() + "!");
        animal.makeSound();

    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energyOfAnimal = animal.getEnergyLevel();
        if (energyOfAnimal >= 0 && energyOfAnimal <= 30) {
            System.out.println("The "  + animal.getName() + " has low energy levels!");
        }
         else if (energyOfAnimal >= 31 && energyOfAnimal <= 70) {
            System.out.println("The "  + animal.getName() + " has an average energy level!");
        }
         else if (energyOfAnimal >= 71 && energyOfAnimal <= 100) {
            System.out.println("The "  + animal.getName() + " has a high energy level!");
        }
    }

    public String getZooKeeperName() {
        return name;
    }


}
