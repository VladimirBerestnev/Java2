package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 5;
    private static final char[][] map = new char[SIZE][SIZE];
    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    public static final Scanner SCANNER = new Scanner(System.in);
    private static final int countWin = 4;

        public static void main(String[] args){
        initializeGame();
        printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkEndGame(DOT_X)) {break;}

                computerTurn();
                printMap();

                if (checkEndGame(DOT_O)) {break;}
            }

        }

    private static boolean checkEndGame(char symbol) {
        if (checkWin(symbol)){
            System.out.println(symbol == DOT_X ? "Человек победил" : "Компьютер победил");
            return true;
        }

        if (isMapFull()){
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int rowIndex;
        int colIndex;
        do {
            System.out.print("Введите значение строки: ");
            rowIndex = SCANNER.nextInt() - 1;

            System.out.print("Введите значение столбца: ");
            colIndex = SCANNER.nextInt() - 1;
        } while ( !isCellValid(rowIndex, colIndex, DOT_X));

        map[rowIndex][colIndex] = DOT_X;
    }


    private static void computerTurn() {
        int[] cell = getNextCellToWin(DOT_O);
        if (cell == null) {
            cell = getNextCellToWin(DOT_X);
            if (cell == null) {
                cell = getRandomEmptyCell(DOT_O);
            }
        }
        int rowIndex = cell[0];
        int colIndex = cell[1];

        setCell(rowIndex, colIndex, DOT_O);
    }

    private static int[] getRandomEmptyCell(char symbol) {
        int rowIndex, colIndex;
        Random random = new Random();
        do {
            rowIndex = random.nextInt(SIZE);
            colIndex = random.nextInt(SIZE);
        } while (!isCellValid(rowIndex, colIndex, symbol));
        return new int[] {rowIndex, colIndex};
    }

    private static int[] getNextCellToWin(char symbol) {
        for (int rowIndex = 0; rowIndex < map.length; rowIndex++) {
            for (int colIndex = 0; colIndex < map[rowIndex].length; colIndex++) {
                if (map[rowIndex][colIndex] == DOT_EMPTY && isGameMoveWinning(rowIndex, colIndex, symbol)) {
                    return new int[]{rowIndex, colIndex};
                }
            }
        }

        return null;
    }

    private static boolean isGameMoveWinning(int rowIndex, int colIndex, char symbol) {
        setCell(rowIndex, colIndex, symbol);
        boolean result = checkWin(symbol);
        setCell(rowIndex, colIndex, DOT_EMPTY);
        return result;
    }

    private static void setCell(int rowIndex, int colIndex, char symbol) {
        map[rowIndex][colIndex] = symbol;
    }



    private static boolean isMapFull(){
        for (char[] rows : map) {
            for (char cellValue : rows) {
                if (cellValue == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    private static boolean checkWin (char symbol) {
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < SIZE-1; i++) {
            for (int j = 0; j < SIZE-1; j++){

                if (map[i][j] == symbol) {
                    rowIndex++;
                } else rowIndex = 0;

                if (map[j][i]== symbol) {
                    colIndex++;
                } else colIndex = 0;
                if (rowIndex == countWin || colIndex == countWin) return true;
            }
        }
        int mainDiag = 0;
        int backDiag = 0;

        for (int i = 0; i < SIZE-1; i++){

            if (map[i][i] == symbol) {
                mainDiag++;
            } else mainDiag = 0;

            if (map[i][map.length - 1 - i] == symbol){
                backDiag++;
            } else mainDiag = 0;
            if (mainDiag == countWin || backDiag == countWin) return true;
        }

        return false;
    }


    private static boolean isCellValid(int rowIndex, int colIndex, char symbol) {
        if (!isArrayIndexValid(rowIndex) | (!isArrayIndexValid(colIndex)))
        {
            System.out.println("Индексы строки и колонки должны быть в диапазоне от 0 до " + SIZE);
            return false;
        }

        if (map[rowIndex][colIndex] != DOT_EMPTY ){
            if (symbol == DOT_X) {
                System.out.println("Данная ячейка уже занята");
            }
            return false;
        }
        return true;
    }

    private static boolean isArrayIndexValid(int Index) {
        return Index >= 0 && Index < SIZE;


    }
    private static void printMap() {
        printHeader();
        printMapState();
        System.out.println();

    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            System.out.print( (rowIndex+1) + " ");
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map[rowIndex][colIndex] + " ");
            }

            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initializeGame() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {

                map [rowIndex][colIndex] = DOT_EMPTY;


            }


        }


    }

}
