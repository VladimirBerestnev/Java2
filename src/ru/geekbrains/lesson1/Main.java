package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        // Инициализация переменных
        byte typeByte = 10;
        short typeShort = 100;
        int typeInt = 1000;
        long typeLong = 100000;
        float typeFloat = (float) 10.8; // без float в скобках выдавал ошибку
        float typeFloatt = 345;
        double typeDouble = 1809.568;
        char typeChar = 'C';
        boolean typeBoolean = true;

        formula(5,8,9,2);
        checksum(5,15);
        signofnumber(-5);
        returnsign(-3);
        getname("Владимир");
        yearV(800);
    }
    // задание 3
    static int formula(int a, int b, int c, int d){
        int sum = a * (b + (c / d));
        return (sum);
    }
    // задание 4
    static boolean checksum (int e, int f) {
        if ((e + f) >= 10 && (e + f) <= 20) {
            return true;
        } else {
            return false;
        }
    }
// задание 5

    static void signofnumber(int g) {
        if (g >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

// задание 6

    static boolean returnsign(int h){
        if (h < 0){
            return true;
        } else {
            return false;
        }
    }

// задание 7

    static void getname(String j){
        System.out.println("Привет, " + j);
    }

    // задание 8
    static void yearV(int vis){
        if (vis % 400 == 0) {
            System.out.println("Год високосный");
        } else if (vis % 100 == 0 || vis % 4 != 0){
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный");
        }
    }
}
