package com.example;

import java.util.List;

public class Feline extends Animal implements Kitty, Predator{

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
    @Override
    public int getKittens() {
        return getKittens(1);
    }

    @Override
    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }
}