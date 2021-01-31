package ru.java2.lesson1;

public class Human implements Actions {

    private final String name;
    private int run;
    private double jump;

    public Human(String name, int run, double jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;

    }

    public String getName() {
        return name;
    }

    public double getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }


    @Override
    public boolean run1(int maxRunDistance) {

        if (this.run > maxRunDistance) {

            System.out.println(getName() + " пробежал дистанцию " + maxRunDistance + " метров");
            return true;
        } else {
            System.out.println(getName() + " не добежал");
            return false;
        }


    }

    @Override
    public boolean jump1(double maxJumpHeight) {
        if (this.run > maxJumpHeight) {

            System.out.println(getName() + " прыгнул на " + maxJumpHeight + " метров");
            return true;
        } else {
            System.out.println(getName() + " не допрыгнул");
            return false;
        }
    }
}
