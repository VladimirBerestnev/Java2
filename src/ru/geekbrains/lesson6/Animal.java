package ru.geekbrains.lesson6;

public abstract class Animal {


        protected final String name;
        protected final String color;
        protected final int age;
        protected final double LIMIT_RUN;
        protected final double LIMIT_JUMP;
        protected final double LIMIT_SWIM;


    public Animal(String name, String color, int age, double LIMIT_RUN, double LIMIT_JUMP, double LIMIT_SWIM) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.LIMIT_RUN = LIMIT_RUN;
        this.LIMIT_JUMP = LIMIT_JUMP;
        this.LIMIT_SWIM = LIMIT_SWIM;
    }


    public abstract void run(double metresToRun);
    public abstract void jump(double metresToJump);
    public abstract void swim(double metresToSwim);


}
