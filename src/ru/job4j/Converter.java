package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int rubleToJena(int value) {
        int rsl = value / 1;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(150);
        System.out.println("150 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToEuro(1234);
        System.out.println("1234 rubles are " + dollar + " dollar.");
        int jena = Converter.rubleToJena(230);
        System.out.println("230 rubles are " + jena + " jena.");

    }
}



