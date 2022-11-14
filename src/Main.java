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


    }
}