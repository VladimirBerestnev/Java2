package ru.geekbrains.lesson6;

public class Start {


    public static void main(String[] args) {


        Cat cat1 = new Cat("Barsik","white",5, 200, 1,0);
        cat1.swim(100);
        cat1.run(50);
        cat1.jump(3);


        Dog dog1 = new Dog("Barbos", "Grey", 7,300,2,150);

        dog1.run(600);
        dog1.jump(1.5);
        dog1.swim(300);
    }

}
