public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int age = 18;
        if(age >= 18){
            System.out.println("Поздравляю тебя с совершеннолетием!");
        } if(age < 18) {
            System.out.println("Тебе еще нет 18, нужно немного подождать.");
        }

        System.out.println("Задание 2");

        int years = 26;
        if(years >= 7 && years < 18) {
            System.out.println("Ребенок ходит в школу");
        } if(years >= 18 && years < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } if(years >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }


        System.out.println("Задание 3");

        int trainCarCapacity = 102;
        int freeSeatsOnTheTrain = 30;
        if(freeSeatsOnTheTrain >= 60 && freeSeatsOnTheTrain <= 102) {
            System.out.println("Есть сидячие и стоячие места");
        } if(freeSeatsOnTheTrain < 60 && freeSeatsOnTheTrain >= 1) {
            System.out.println("Есть только стоячие места");
        } if(freeSeatsOnTheTrain < 1) {
            System.out.println("Все места заняты");
        }


    }
}