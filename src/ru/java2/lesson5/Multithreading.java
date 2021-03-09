package ru.java2.lesson5;

public class Multithreading {

    static final int size = 10000000;
    static final int h = size / 2;

    private static float[] arr = new float[size];


    public static void main(String[] args) {

        for (int i = 0; i < size; i++){
            arr[i] = 1;
 //           System.out.println("i = " + i);

        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(i + " = " + arr[i]);
        }
        long b = System.currentTimeMillis();
        System.out.println((float)(b-a)/1000 + " секунд");

    }

}
