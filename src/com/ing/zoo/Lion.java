package com.ing.zoo;

public class Lion extends Animal {
    public String eatText;

    public Lion(String name)
    {
        super(name, "roooaoaaaaar");
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
