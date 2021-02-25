package ru.java2.lesson2;

public class ExceptionHW {

    static String[][] mass = {
            {"1","4","7","4"},
            {"6", "23","h", "9"},
            {"4", "13", "10", "5"},
            {"6", "91", "s","25"},
};

    static String[][] mass2 = {
            {"1","4","7","4"},
            {"6", "23","1", "9"},
            {"4", "13", "10", "7"},

    };




    public static void main(String[] args) {

        try {
            int result = InputExcept(mass);

            System.out.println(result);

        } catch (MyArraySizeException e) {
   //         e.printStackTrace();
            System.out.println("Неверный размер массива");

        } catch (MyArrayDataException e) {
  //          e.printStackTrace();
            System.out.println("Массив не полностью из чисел");
        }


    }


    public static int InputExcept(String mass[][]) throws MyArrayDataException, MyArraySizeException {

        int Sum = 0;

        if ((mass.length - 1 != 3)|(mass[0].length-1 != 3)) {

            throw new MyArraySizeException();
        }



        for (int i = 0; i < mass.length; i++){

            for (int j = 0; j < mass[i].length; j++){

                try {int stringToNumber = Integer.parseInt(mass[i][j]);
                    Sum = Sum + stringToNumber;

                }catch (NumberFormatException e) {
                    System.out.println("Error in Index " + i + " " + j);
                    throw new MyArrayDataException();
                }

            }

        }

        return Sum;

    }


    static class MyArrayDataException extends Exception {
        MyArrayDataException (String mass[][]) {super();}

        public MyArrayDataException() {

        }
    }


    static class MyArraySizeException extends Exception {

        MyArraySizeException (String mass[][]) {super();}

        public MyArraySizeException() {

        }
    }


}
