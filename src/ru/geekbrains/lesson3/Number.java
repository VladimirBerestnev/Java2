package ru.geekbrains.lesson3;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        int n;
        do {
            GuessWhatComputerSelect();
            System.out.println("Если Вы хотите продолжить, нажмите 1 \nЕсли хотите завершить, нажмите 0");
            Scanner doYouWantContinue = new Scanner(System.in);
            n = doYouWantContinue.nextInt();
        } while(n == 1);
    }


    public static void GuessWhatComputerSelect(){
        int r = (int)(Math.random() * 10);
        System.out.println(r);
        System.out.println("Угадайте число от 0 до 9");
        for (int i = 1; i <= 4; i++)
        {

            if (i == 4) {
                System.out.println("Вы не угадали");
                break;
            }

            Scanner number = new Scanner(System.in);
            int yourNumber = number.nextInt();

            if (yourNumber == r)
            {
                System.out.println("Вы угадали");
                break;
            } else if (yourNumber > r) {
                System.out.println("Число меньше");
            } else {
                System.out.println("Число больше");
            }
        }

    }
}
