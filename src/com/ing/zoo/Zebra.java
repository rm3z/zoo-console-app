package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal {
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        super(name, "zebra zebra");
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
