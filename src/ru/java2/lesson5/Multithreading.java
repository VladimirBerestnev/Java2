package ru.java2.lesson5;

import java.util.Arrays;

public class Multithreading {

    static final int size = 10000000;
    static final int h = size / 2;

    private static float[] arr = new float[size];


    public static void main(String[] args) {

        for (int i = 0; i < size; i++){
            arr[i] = 1;

        }
        firstMethod(arr);
        secondMethod(arr);

    }

    private static void firstMethod(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        long b = System.currentTimeMillis();
        System.out.println((float)(b-a)/1000 + " секунд");
        System.out.println(arr[size-2]);

 //       System.out.println("Massive1 " + Arrays.toString(arr));
    }


    private static void secondMethod(float[] arr){

        float[] arr1 = new float[size];
        float[] arr2 = new float[size];

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < h; i++) {
                    arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    arr2[i] = (float)(arr2[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));

                }
            }
        });

        long c = System.currentTimeMillis();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        long d = System.currentTimeMillis();
        System.out.println((float)(d-c)/1000 + " секунд");
        System.out.println(arr[size-2]);
  //      System.out.println("Massive2 " + Arrays.toString(arr));

    }


}
