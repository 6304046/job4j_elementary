package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        return (height-100)*1.15;
    }

    public static double womanWeight(short height1) {
        return (height1-110)*1.15;
    }

    public static void main(String [] args) {
        short height = 185;
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man);
        short height1 = 175;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman " + height1 + " is " + woman);
    }
}
