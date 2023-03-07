import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();


    }

    private static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");

        }
        System.out.println();

    }

    private static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && 2015 > clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && 2015 <= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && 2015 > clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

    }

    private static void task3() {
        System.out.println("Задача 3");
        int year = 2000;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else  {
            System.out.println(year+" год не является високосным");
        }
        System.out.println();




    }

    private static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 2;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }else {
            int deliveryDays = 1;
            if (deliveryDistance > 20){
                deliveryDays++;
            }

            if (deliveryDays > 60 ){
                deliveryDays++;
            }
                System.out.println("Доставка занимает "+ deliveryDays);
        }
        System.out.println();

        /*int deliveryDistance = 95;
        if (deliveryDistance <= 20  ){
            System.out.println("Доставка в пределах 20 км занимает сутки.");
        }else if (deliveryDistance > 20 && 60 >= deliveryDistance ){
            System.out.println("Доставка в пределах от 20 км до 60 км 2 дня доставки.");
        } else if (60 < deliveryDistance && 100 >= deliveryDistance) {
            System.out.println("Доставка в пределах 60 км до 100 км 3 дня доставки");

        }
        else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println();*/
    }

    private static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень!");
                break;
        }




    }



}