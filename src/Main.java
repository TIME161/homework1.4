public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    public static void task4() {
        System.out.println("Задача 4");
        int age = 55;
        boolean lowAge = age >= 2 && age <= 6;
        boolean middleAge = age >= 7 && age < 18;
        boolean universityAge = age >= 18 && age < 24;
        boolean workAge = age >= 24;

        if (lowAge) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        }
        if (middleAge) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в в школу");
        }
        if (universityAge) {
            System.out.println("Если возраст человека равен " + age + " , то его место в университете");
        }
        if (workAge) {
            System.out.println("Если возраст человека равен " + age + " , то ему пора ходить на работу");
        }
        if (lowAge || middleAge || universityAge || workAge) {}
        else {
            System.out.println("Если возраст человека равен " + age + " , то он вне рамок задачи");}
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 13;
        boolean noFunny = age < 5;
        boolean funnyFithParents = age >= 5 && age < 14;
        if (noFunny) {
            System.out.println("Если возраст ребенка равен " + age + " , то он не может кататься на аттракционе");
        }
        if (funnyFithParents) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (noFunny || funnyFithParents) {}
        else {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int passenger = 60;
        byte mVagon = 102;
        byte mSit = 60;
        boolean sitIStoya = passenger < mVagon && passenger < mSit;
        boolean onlyStoya = passenger < mVagon && passenger >= mSit;
        boolean full = passenger == mVagon;

        if (sitIStoya) {
            System.out.println("Если в вагоне поезда " + passenger + " человек, то есть и сидячее и стоячее место");
        }
        if (onlyStoya) {
            System.out.println("Если в вагоне поезда " + passenger + " человек, то есть только стоячее место");
        }
        if (full) {
            System.out.println("Если в вагоне поезда " + passenger + " человек, то вагон уже полностью забит");
        }
        if (sitIStoya || onlyStoya || full) {}
        else {
            System.out.println("Если в вагоне поезда " + passenger + " человек, то вместимость вагона превышена");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 25;
        int two = 30;
        int three = 45;

        boolean bigOne = one > two && one > three;
        boolean bigTwo = two > one && two > three;
        boolean bigThree = three > one && three > two;

        if (bigOne) {System.out.println("Число " + one + " большее");}
        if (bigTwo) {System.out.println("Число " + two + " большее");}
        if (bigOne || bigTwo) {}
        else {System.out.println("Число " + three + " большее");}
        }
    }