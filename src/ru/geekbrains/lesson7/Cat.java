package ru.geekbrains.lesson7;

public class Cat {

    private final String name;
    private int appetite;
    private boolean fullness;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void eat(Plate plate) {

        if (getAppetite() > plate.getFood()){
            System.out.println("В тарелке мало еды. Кот не поел. Ему нужно " + getAppetite() + " единиц");
        } else {
            System.out.println("Cat is eating...");
        plate.decreaseFood(getAppetite());
        appetite = 0;
        fullness = true;
            System.out.println("Cat is fullness");
        }


;    }


    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    public String getName() {
        return name;
    }

    public boolean getFullness() {
        return fullness;
    }
}
