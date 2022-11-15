public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int age = 8;
        if(age >= 18){
            System.out.println("Поздравляю тебя с совершеннолетием!");
        } else {
            System.out.println("Тебе еще нет 18, нужно немного подождать.");
        }

        System.out.println("Задание 2");

        int years = 28;
        if(years < 7) {
            System.out.println("Ребенок еще совсем маленький");
        } if(years >= 7 && years < 18) {
            System.out.println("Ребенок ходит в школу");
        } if(years >= 18 && years < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }


        System.out.println("Задание 3");

        int trainCarCapacity = 102;
        int freeSeatsOnTheTrain = 0;
        if(freeSeatsOnTheTrain < 103 && freeSeatsOnTheTrain > 59) {
            System.out.println("Есть сидячие и стоячие места");
        } if(freeSeatsOnTheTrain < 60 && freeSeatsOnTheTrain >= 1) {
            System.out.println("Есть только стоячие места");
        } else if(freeSeatsOnTheTrain < 1) {
            System.out.println("Все места заняты");
        }


        // Домашнее задание 3
        System.out.println("Задание 1");
        int ageOld = 15;
        if(ageOld > 1 && ageOld < 7) {
            System.out.println("Если возраст человека равен " + ageOld + ", то ему нужно ходить в детский садик");
        } else if(ageOld > 6 && ageOld < 18) {
            System.out.println("Если возраст человека равен " + ageOld + ", то ему нужно ходить в школу");
        } else if(ageOld > 17 && ageOld < 25) {
            System.out.println("Если возраст человека равен " + ageOld + ", то его место в университете");
        } else if(ageOld > 24) {
            System.out.println("Если возраст человека равен " + ageOld + ", то ему пора ходить на работу");
        }

        System.out.println("Задание 2");
        int childAge = 13;
        if(childAge < 5) {
            System.out.println("Если ребенку " + childAge + ", то он не может кататься на аттракционе");
        } else if(childAge > 4 && childAge < 14) {
            System.out.println ("Если ребенку " + childAge + ", то он может кататься только в сопровождении взрослого");
        } else if(childAge > 13) {
            System.out.println ("Если ребенку " + childAge + ", то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 3");

        int one = 3;
        int two = 5;
        int three = 10;
        if(one > two && one > three) {
            System.out.println(one + " больше чем, " + two + " и " + three);
        } else if(two > one && two > three) {
            System.out.println(two + " больше чем, " + one + " и " + three);
        } else if(three > one && three > two) {
            System.out.println(three + " больше чем, " + one + " и " + two);
        } else if(one == two && two == three && three == one) {
            System.out.println("Все числа равны");
        }


    }
}