package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(short height) {
        double rs1 = (height - 110) * 1.15;
        return rs1;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 170;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
