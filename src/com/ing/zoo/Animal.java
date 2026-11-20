package com.ing.zoo;

/** Stores the name and greeting shared by zoo animals. */
public abstract class Animal {
    private final String name;
    private final String greeting;

    /** Registers the name used in commands and the text printed when greeted. */
    protected Animal(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    /** Returns the name used in commands such as {@code hello henk}. */
    public String getName() {
        return name;
    }

    /** Prints this animal's greeting. */
    public void sayHello() {
        System.out.println(greeting);
    }
}
