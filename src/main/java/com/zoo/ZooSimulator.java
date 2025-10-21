package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.animals.IPlayable;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {

    public static void main(String[] args) {

        Lion lion = new Lion("Simba", 100,"yellow" );
        Elephant elephant = new Elephant("Dumbo", 100,"grey");
        Eagle eagle = new Eagle("Feniks", 100,1.7);
        Penguin penguin = new Penguin("Riko",100, 0.7);

        ZooKeeper zooKeeper = new ZooKeeper("Vasyl Petrovych");

        System.out.println("Hello! Welcome to our zoo!");
        System.out.println();
        System.out.println("Today you can observe the life of animals in the zoo. Your guide will be " + zooKeeper.getZooKeeperName() + "!");
        System.out.println();
        System.out.println("You will meet some of the zoo's animals and watch how they spend their day.");
        System.out.println();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(elephant);
        animals.add(eagle);
        animals.add(penguin);
    //    animals.forEach(animal -> {    //  тут хотіла надрукувати тварин, але друкує таке com.zoo.species.Lion@2d98a335
    //    System.out.println(animal);
    //    });


        System.out.println("Meet our animals: ");
        for (Animal animal : animals) {
            animal.displayInfo();
        }

        System.out.println();
        System.out.println("Let's feed the animals!");
        for (Animal animal : animals)
            zooKeeper.feedAnimal(animal);

        System.out.println();
        System.out.println("Now it's time for activities. Let's play with the animals!");

        ArrayList<IPlayable> playWithAnimals = new ArrayList<>();
        playWithAnimals.add(lion);
        playWithAnimals.add(elephant);
        playWithAnimals.add(eagle);
        playWithAnimals.add(penguin);

        for (IPlayable animal : playWithAnimals) {
            animal.play();
        }

        System.out.println();
        System.out.println("The animals had an active time and were tired. It was time to sleep.");
        for (Animal animal : animals) {
            animal.sleep();
        }

        System.out.println();
        System.out.println("Time for fun!");
        lion.groom();
        lion.hunt();
        elephant.spraySelf();
        elephant.groom();
        eagle.fly();
        penguin.swim();
        System.out.println();

        System.out.println("The animals are hungry again");
        zooKeeper.feedAnimal(lion);
        System.out.println("Simba didn't eat enough so he went hunting. ");
        lion.hunt();
        zooKeeper.feedAnimal(elephant);
        zooKeeper.feedAnimal(eagle);
        zooKeeper.feedAnimal(penguin);
        System.out.println();


        System.out.println("Time for fun again! Animals can do something else interesting)))");
        lion.move();
        elephant.move();
        eagle.uniqueBirdAction();
        penguin.uniqueBirdAction();
        System.out.println();

        System.out.println("Let's check the energy level of animals!");
        for (Animal animal : animals) {
            animal.displayInfo();
        }

        for (Animal animal : animals) {
            zooKeeper.checkAnimalEnergyLevel(animal);
        }

        System.out.println();
        System.out.println("I hope you enjoyed your day at our zoo. We look forward to seeing you here again.");

    }
}
