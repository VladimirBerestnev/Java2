package ru.geekbrains.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }


    public void decreaseFood(int appetite) {
        this.food -= appetite;
    }

    public void increaseFood(int appetite) {
        this.food += appetite;
        System.out.println("Еда добавлена в миску");
    }
}
