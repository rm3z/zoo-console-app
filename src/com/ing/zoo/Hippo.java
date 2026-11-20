package com.ing.zoo;

public class Hippo extends Animal {
    public String eatText;

    public Hippo(String name)
    {
        super(name, "splash");
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
