package com.ing.zoo;

/** A sea lion that eats fish and can perform a balancing trick. */
public class SeaLion extends Animal implements EatsMeat, TrickPerformer {
    /** Registers the sea lion under the name used in console commands. */
    public SeaLion(String name) {
        super(name, "arf arf");
    }

    /** Prints the sea lion's reaction to being fed fish. */
    @Override
    public void eatMeat() {
        System.out.println("nom nom tasty fish");
    }

    /** Prints the sea lion's balancing trick. */
    @Override
    public void performTrick() {
        System.out.println("balances a ball on its nose");
    }
}