package ru.geekbrains.lesson6;

public class Cat extends Animal {

    private double maxRunForCat = 200;
    private double maxJumpForCat = 2;
    private double maxSwimForCat = 0;

    protected Cat(String name, String color, int age, double LIMIT_RUN, double LIMIT_JUMP, double LIMIT_SWIM) {
        super(name, color, age, LIMIT_RUN, LIMIT_JUMP,LIMIT_SWIM);
    }

    @Override
    public void run(double metresToRun) {
        if (maxRunForCat >= metresToRun){
            System.out.println("Кошка пробежала " + metresToRun + " метров");
        } else {
            double remainingDistance = metresToRun - maxRunForCat;
            System.out.println("Кошка пробежала " + maxRunForCat + " метров ,но не добежала " + remainingDistance + " метров");
        }

    }


    @Override
    public void jump(double metresToJump) {
        if (maxJumpForCat >= metresToJump){
            System.out.println("Кошка прыгнула на " + metresToJump + " метров");
        } else {
            double remainingDistance = metresToJump - maxJumpForCat;
            System.out.println("Кошка прыгнула на " + maxJumpForCat + " метров ,но не допрыгнула " + remainingDistance + " метров");
        }
    }

    @Override
    public void swim(double metresToSwim) {
        System.out.println("Кошки не плавают");
    }

    }



