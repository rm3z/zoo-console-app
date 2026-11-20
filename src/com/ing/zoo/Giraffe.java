package com.ing.zoo;

/** A giraffe that feeds on leaves. */
public class Giraffe extends Animal implements EatsLeaves {
    /** Registers the giraffe under the name used in console commands. */
    public Giraffe(String name) {
        super(name, "hello from up here");
    }

    /** Prints the giraffe's reaction to being fed leaves. */
    @Override
    public void eatLeaves() {
        System.out.println("munch munch acacia leaves");
    }
}
