package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (180-100)*1.15;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = (160-110)*1.15;
        return rsl;
    }

    public static void main(String [] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Man 180 is " + man);
        short height1 = 160;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 160 is " + woman);
    }
}
