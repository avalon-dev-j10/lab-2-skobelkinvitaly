package ru.avalon.java.dev.j10.labs;

import java.util.Random;

public class FigureNumberInitializer implements ArrayInitializer {

    public void initialize(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

        }
    }
}
