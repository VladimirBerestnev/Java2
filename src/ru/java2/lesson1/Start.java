package ru.java2.lesson1;

import java.lang.reflect.Array;

public class Start {



    public static void main(String[] args) {


    Human Alesha = new Human("Alex", objectRun(), objectJump());
    Cat cat1 = new Cat("Barsik", objectRun(), objectJump());

    Track track7 = new Track(500);
 //   Alesha.run1(track7.getTrackLenght());



    Object [] persons = {
            new Human("Vasya", objectRun(), objectJump()),
            new Cat("Murzik", objectRun(), objectJump()),
            new Robot("T-1000", objectRun(), objectJump()),
            new Human("Stepan", objectRun(), objectJump()),
            new Cat ("Red", objectRun(), objectJump()),
            new Robot ("R2D2", objectRun(), objectJump()),

    };

    Object [] barriers = {

            new Wall(1),
            new Track(100),
            new Wall (1.5),
            new Track(300),
            new Track(200)

    };


    for (int i = 0; i < persons.length; i++){

        for (int j = 0; j < barriers.length; j++){

            boolean checkJump;
            boolean checkRun;
            
            if (barriers[j] instanceof Wall) {
                Wall wall1 = (Wall)barriers[j];

                if (persons[i] instanceof Human) {

                    Human human1 = (Human) persons[i];
                    checkJump = human1.jump1(wall1.getWallHeight());

                } else if (persons[i] instanceof Cat) {

                    Cat cat2 = (Cat) persons[i];
                    checkJump = cat2.jump1(wall1.getWallHeight());

                } else {

                    Robot robot3 = (Robot) persons[i];
                    checkJump = robot3.jump1(wall1.getWallHeight());

                }
                
                if (!checkJump) {
                    System.out.println("Сошел с дистанции");
                    break;}
                
            }

            else {

                Track track1 = (Track) barriers[j];

                if (persons[i] instanceof Human) {

                    Human human1 = (Human) persons[i];
                    checkRun = human1.run1(track1.getTrackLenght());

                } else if (persons[i] instanceof Cat) {

                    Cat cat2 = (Cat) persons[i];
                    checkRun = cat2.run1(track1.getTrackLenght());

                } else {

                    Robot robot3 = (Robot) persons[i];
                    checkRun = robot3.run1(track1.getTrackLenght());

                }
                if (!checkRun) {
                    System.out.println("Сошел с дистанции");
                    break;}

            }


        }

    }




    }

    private static int objectRun() {
        return (int) (Math.random() * 1000);
    }
    private static double objectJump() {
        double jump =  (int)(Math.random() * 5) / 10;
        return jump;

    }


}
