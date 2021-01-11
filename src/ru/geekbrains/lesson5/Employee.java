package ru.geekbrains.lesson5;

public class Employee {

    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван Иванович", "Генеральный директор", "ivanov@mail.ru", "89156157548",150000, 45);
        Employee employee2 = new Employee("Петров Петр Петрович", "Главный инженер","petrov@mail.ru", "83547388548", 60000, 38);
        Employee employee3 = new Employee("Алексеев Алексей Алексеевич", "Стажер", "alekseev@yandex.ru", "838754683", 20000, 23);
        Employee employee4 = new Employee("Холодова Лидия Петровна", "Бухгалтер", "buh1945", "4783483757", 50000, 70);
        Employee employee5 = new Employee("Вислоухова Аглая Ильинична", "Менеджер по продажам", "vislouh@yahoo.com", "95856875945", 45000, 50);


 //       printEmployee(employee1);
 //       printEmployee(employee3);

//Задание с массивом

        Employee[] persArray = new Employee[6]; // Вначале объявляем массив объектов
        persArray[0] = new Employee("Матвеев Дмитрий Степанович", "Коммерческий директор", "matveev@mail.ru", "8985758496",100000, 35);;
        persArray[1] = employee1;
        persArray[2] = employee2;
        persArray[3] = employee3;
        persArray[4] = employee4;
        persArray[5] = employee5;

        for (int i = 0; i < persArray.length; i++){

            if (persArray[i].getAge() > 40) {

               printEmployee(persArray[i]);
            }
        }
    }

    private static void printEmployee(Employee employee) {
        System.out.printf("%s; %s; %s; %s; %d; %d \n",
                employee.fullName, employee.position, employee.email, employee.phone, employee.salary, employee.age);
    }

    public int getAge(){
        return age;
    }

}
