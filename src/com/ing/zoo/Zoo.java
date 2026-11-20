package com.ing.zoo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    /** Registers the animals in order and reads one command from the console. */
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
            new Lion("henk"),
            new Hippo("elsa"),
            new Pig("dora"),
            new Tiger("wally"),
            new Zebra("marty")
        );

         try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Voer uw command in: ");
            if (scanner.hasNextLine()) {
                handleCommand(scanner.nextLine().trim(), animals);
            }
        }
    }

    /** Greets all animals or finds a single animal when a name is provided. */
    private static void handleCommand(String command, List<Animal> animals) {
        if (command.equals("hello")) {
            for (Animal animal : animals) {
                animal.sayHello();
            }
        } else if (command.startsWith("hello ")) {
            String name = command.substring("hello ".length()).trim();
            greetByName(name, animals);
        } else {
            System.out.println("Unknown command: " + command);
        }
    }

    /** Prints one animal's greeting or reports that its name could not be found. */
    private static void greetByName(String name, List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animal.sayHello();
                return;
            }
        }
        System.out.println("Unknown animal: " + name);
    }
}
