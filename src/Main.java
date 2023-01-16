public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}