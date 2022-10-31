package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {

    public String name() {
        return super.name() + "\rTasty pizza and extra cheese";
    }
}