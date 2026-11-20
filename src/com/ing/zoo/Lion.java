package com.ing.zoo;

public class Lion extends Animal implements EatsMeat{
    public String eatText;

    public Lion(String name)
    {
        super(name, "roooaoaaaaar");
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
