package ru.geekbrains.lesson6;

public class Dog extends Animal {

    private double maxRunForDog = 500;
    private double maxJumpForDog = 0.5;
    private double maxSwimForDog = 10;

    protected Dog(String name, String color, int age, double LIMIT_RUN, double LIMIT_JUMP, double LIMIT_SWIM) {
        super(name, color, age, LIMIT_RUN, LIMIT_JUMP, LIMIT_SWIM);
    }

    @Override
    public void run(double metresToRun) {
        if (maxRunForDog >= metresToRun){
            System.out.println("Собака пробежала " + metresToRun + " метров");
        } else {
            double remainingDistance = metresToRun - maxRunForDog;
            System.out.println("Собака пробежала " + maxRunForDog + " метров ,но не добежала " + remainingDistance + " метров");
        }


    }

    @Override
    public void jump(double metresToJump) {
        if (maxJumpForDog >= metresToJump){
            System.out.println("Собака прыгнула на " + metresToJump + " метров");
        } else {
            double remainingDistance = metresToJump - maxJumpForDog;
            System.out.println("Собака прыгнула на " + maxJumpForDog + " метров ,но не допрыгнула " + remainingDistance + " метров");
        }
    }

    @Override
    public void swim(double metresToSwim) {
        if (maxSwimForDog >= metresToSwim){
            System.out.println("Собака проплыла " + metresToSwim + " метров");
        } else {
            double remainingDistance = metresToSwim - maxSwimForDog;
            System.out.println("Собака проплыла " + maxSwimForDog + " метров ,но не доплыла " + remainingDistance + " метров");
        }
    }
}
