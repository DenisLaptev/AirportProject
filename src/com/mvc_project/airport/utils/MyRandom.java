package com.mvc_project.airport.utils;

public class MyRandom {

    public static void main(String... args) {
        final int max = 20; // Максимальное число для диапазона от 0 до max
        final int ARRAY_LENGTH = 10;

        int[] arrayOfRandomInt = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            final int rnd = rnd(max);
            arrayOfRandomInt[i] = rnd;
        }
        System.out.println("---Список из " + ARRAY_LENGTH + " случайных чисел [0,max]=[0," + max + "]---");
        for (int i = 0; i < arrayOfRandomInt.length; i++) {
            System.out.println(arrayOfRandomInt[i]);
        }
    }

    /**
     * Метод получения псевдослучайного целого числа от 0 до max (включая max);
     */
    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }
}
