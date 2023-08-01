package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private FelineInfo felineInfo;

    public Lion(Feline feline) {
        this.felineInfo = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return felineInfo.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineInfo.getFood();
    }
}