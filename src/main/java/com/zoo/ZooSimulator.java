package com.zoo;

import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {

        Lion lion = new Lion("Simba", 3, 120, 50, 50, "yellow" );
        Elephant elephant = new Elephant("Dumbo", 2, 650, 60, 40, "grey");
        Eagle eagle = new Eagle("Feniks", 3, 2, 40, 40, 1.7);
        Penguin penguin = new Penguin("Riko", 1, 2.3,70, 50, 0.7);

        ZooKeeper zooKeeper = new ZooKeeper("Vasyl Petrovych");

        System.out.println("Hello! Welcome to our zoo!");
        System.out.println();
        System.out.println("Today you can observe the life of animals in the zoo. Your guide will be " + zooKeeper.getZooKeeperName() + "!");
        System.out.println();

        System.out.println("Today you will meet some of the zoo's animals and watch how they spend their day.");
        System.out.println("Let's feed the animals!");
        System.out.println();

        zooKeeper.feedAnimal(lion);
        zooKeeper.feedAnimal(elephant);
        zooKeeper.feedAnimal(eagle);
        zooKeeper.feedAnimal(penguin);
        System.out.println();

        System.out.println("Now it's time for activities. Let's play with the animals!");
        zooKeeper.playWithAnimal(lion);
        zooKeeper.playWithAnimal(elephant);
        elephant.spraySelf();
        zooKeeper.playWithAnimal(eagle);
        zooKeeper.playWithAnimal(penguin);
        System.out.println();


        System.out.println("The animals had an active time and were tired. It was time to rest.");
        lion.sleep();
        elephant.sleep();
        eagle.sleep();
        penguin.sleep();
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


        System.out.println("Time for fun again!");
        lion.groom();
        lion.hunt();
        elephant.spraySelf();
        elephant.groom();
        eagle.fly();
        eagle.fly();
        penguin.swim();
        penguin.swim();
        System.out.println();

        System.out.println("Check Animal Energy Level");
        zooKeeper.checkAnimalEnergyLevel(lion);
        zooKeeper.checkAnimalEnergyLevel(elephant);
        zooKeeper.checkAnimalEnergyLevel(eagle);
        zooKeeper.checkAnimalEnergyLevel(penguin);
        System.out.println();

        System.out.println("Information about animals: ");
        lion.displayInfo();
        System.out.println();
        elephant.displayInfo();
        System.out.println();
        eagle.displayInfo();
        System.out.println();
        penguin.displayInfo();

        System.out.println();
        System.out.println("I hope you enjoyed your day at our zoo. We look forward to seeing you here again.");




        // Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.

        // Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.

        // Додайте логіку, яка представляє типові події дня в зоопарку:
        // - Годування тварин: використання методу feedAnimal().
        // - Гра з тваринами: використання методу playWithAnimal().
        // - Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().

        // Симулюйте зміну стану тварин (наприклад, втома після грається, зростання енергії після їжі).

        // Виведіть фінальні результати та стани тварин наприкінці дня.

    }
}
