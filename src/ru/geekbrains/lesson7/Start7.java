package ru.geekbrains.lesson7;

public class Start7 {

    public static void main(String[] args) {

//        Cat cat = new Cat("Murzik", 10);

        Plate plate = new Plate(random());
        plate.info();

        Cat [] cat = new Cat[7];
        for (int i = 0; i < cat.length; i++){
            cat[i] = new Cat ("Vasya" + i, (int)(Math.random() * 10 + 10));
            System.out.println("Кот " + cat[i].getName() + ", аппетит " + cat[i].getAppetite());

            cat[i].eat(plate);
            plate.info();
        }

        for (int i = 0; i < cat.length; i++){

            System.out.println("Кот " + cat[i].getName() + ", сытость " + cat[i].getFullness());

            }



        for (int i = 0; i < cat.length; i++){


            if (!cat[i].getFullness()) {

                plate.increaseFood(cat[i].getAppetite() - plate.getFood());
                cat[i].eat(plate);
                plate.info();
            }

        }



 //       cat.eat();
 //       plate.setFood(plate.getFood() - cat.getAppetite());
 //       cat.setAppetite(0);
// plate.info();


//        String stroka1 = "I like Java!!!";

//        System.out.println("Последний символ в строке - " + stroka1.charAt(stroka1.length() - 1));
//        System.out.println(stroka1.endsWith("!!!"));
//        System.out.println(stroka1.startsWith("I like"));
//        System.out.println(stroka1.contains("Java"));
//        System.out.println("Позиция подстроки в строке - " + stroka1.indexOf("Java"));
//        System.out.println(stroka1.replace("a", "o"));
//        System.out.println(stroka1.toUpperCase());
//        System.out.println(stroka1.toLowerCase());
//        System.out.println(stroka1.substring(7,11));

    }


    private static int random() {
        int plateFood = (int) (Math.random() * 50 + 30);
        return plateFood;
    }

}
