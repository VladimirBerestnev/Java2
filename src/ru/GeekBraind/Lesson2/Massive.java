package ru.GeekBraind.Lesson2;

import java.util.Arrays;

public class Massive {

    public static void main(String[] args) {
//задание 1
        int [] invertmassive = {1,0,1,0,1,1,1,0,0,0,1,0,1};

        for (int i = 0; i < invertmassive.length; i++)
        {
            if (invertmassive[i] == 1)
            {
                invertmassive[i] = 0;
            } else
            {
                invertmassive[i] = 1;
            }

        }
        System.out.println(Arrays.toString(invertmassive));

        //    задание 2

        int[] arreight = new int[8];

        for (int i = 0; i < arreight.length-1; i++)

        {
            arreight[i] = i * 3;

        }
        System.out.println(Arrays.toString(arreight));

//задание 3

        int[] lesssix = {1,5,3,2,11,4,5,2,4,8,9,1};

        for (int i = 0; i < lesssix.length-1; i++)
        {
            if (lesssix[i] < 6)
            {
             lesssix[i] = lesssix[i] * 2;
            }
        }
        System.out.println(Arrays.toString(lesssix));

// задание 4

        int [][] doublemass = new int[5][5];

        for (int i = 0; i < doublemass.length-1; i++)
        {
            for (int j = 0; j < doublemass[i].length-1; j++)
            {
                if (i == j)
                {
                    doublemass[i][j] = 1;
                    System.out.println(i + " и " + j);
                }
            }
         int j = (doublemass.length - 1) - i;
            doublemass[i][j] = 1;
            System.out.println(i + " и " + j);
        }

// задание 5

        int[] minimax = {7,35,67,23,43,3,9,1,35,63,55,28};
        int maxsign = minimax[0];
        int minsign = minimax[0];
        for (int i = 0; i < minimax.length-1; i++)
        {
            if (maxsign < minimax[i])
            {
               maxsign = minimax[i];

            } else if (minsign > minimax[i])
            {
                minsign = minimax[i];
            }
        }
        System.out.println(maxsign);
        System.out.println(minsign);


       int [] masleftright = {1,2,3,4,5,10,5};
    boolean sum = sumOfleftAndRightPart(masleftright);
    System.out.println(sum);

        int[] lastmassive = {3,6,3,7,5,3,5,7,7,8,3,0,0,0,0,0,0,0,0,0,0,0,0};
        removeMassiveNPosition(lastmassive, 3);

// задание 6



    }

    static boolean sumOfleftAndRightPart(int[] masleftright)
    {
        int sumleft = 0;
        int sumright = 0;
        boolean sum = false;
        for (int i = 0; i < masleftright.length-1; i++)

        {
            sumleft = sumleft + masleftright[i];
            for (int j = masleftright.length-1; j == (i); j--)
            {
                sumright = sumright + masleftright[j];
            }

            if (sumleft == sumright) {
                sum = true;
                break;
            }

        }
    return sum;
    }

// задание 7

    static void removeMassiveNPosition(int[] lastmassive, int n)
    {


    }

}
