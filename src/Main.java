public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
       int age = 200;
       if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");


        int term = 10;
        if (term > 5) {
            System.out.println("На улице " + term + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + term + " градусов, нужно надеть шапку");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");

        byte speed = 10;
        byte speedNormal = 60;
        if (speedNormal < speed) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
    }
}