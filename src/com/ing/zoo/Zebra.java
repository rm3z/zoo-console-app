package com.ing.zoo;

public class Zebra extends Animal implements EatsLeaves{
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        super(name, "zebra zebra");
    }

    @Override 
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
