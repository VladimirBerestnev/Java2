package ru.java2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Collection {

    public static void main(String[] args) {

        ArrayList <String> technoList = new ArrayList<>();
        technoList.add("Samsung");
        technoList.add("Sony");
        technoList.add("Xiaomi");
        technoList.add("LG");
        technoList.add("Samsung");
        technoList.add("Acer");
        technoList.add("Philips");
        technoList.add("Samsung");
        technoList.add("LG");
        technoList.add("Huawei");
        technoList.add("Sharp");
        technoList.add("Apple");
        technoList.add("Samsung");
        technoList.add("LG");
        technoList.add("Irbis");

        for (int i = 0; i < technoList.size(); i++){
            int counter = 1;
        for (int j = 0; j < technoList.size(); j++) {

            if (technoList.get(i) == technoList.get(j) && i!=j) {

               technoList.remove(j);
                counter++;
               j--;

            }
        }
            System.out.println(technoList.get(i) + " повторяется " + counter + " раз");
        }

        System.out.println(technoList);



//-----------------------------------------------------------------------

        HashMap<Integer, PhoneGuide> phoneGuide = new HashMap<>();
        phoneGuide.put(1, new PhoneGuide("123454533", "Ivan", "Ivanov" ));
        phoneGuide.put(2, new PhoneGuide("3342424", "Petr", "Ivanov"));
        phoneGuide.put(3, new PhoneGuide("43456533", "Leonid", "Vetrov"));
        phoneGuide.put(4, new PhoneGuide("35345423", "Stepan", "Vasilyev"));
        phoneGuide.put(5, new PhoneGuide("6343235", "Vlad", "Pechkin"));
        phoneGuide.put(6, new PhoneGuide("953479", "Vladimir", "Vetrov"));

        for (Map.Entry<Integer, PhoneGuide> o : phoneGuide.entrySet()) {


            if (o.getValue().getLastName() == "Vetrov") {
                System.out.println(o.getKey() + ": " + o.getValue());

            }
        }




    }


}
