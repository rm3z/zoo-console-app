package com.ing.zoo;

public class Hippo extends Animal implements EatsLeaves{
    public String eatText;

    public Hippo(String name)
    {
        super(name, "splash");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
