import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void defineLeapYear() {
        System.out.println("Год является  високосным");
    }

    public static void defineNonLeapYear() {
        System.out.println("Год не является  високосным");
    }

    public static void task1() {
        System.out.println("Домашняя работа № 11");
        System.out.println("Задание №  1");


        int year = 2013;
        if (year % 4 == 0 || year % 400 == 0) {
            defineLeapYear();
        } else if (year % 100 != 0) {
            defineNonLeapYear();
        }

    }


    public static void outputTheLine1() {
        System.out.println("Установите версию приложения для iOS по ссылке. " +
                "Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void outputTheLine2() {
        System.out.println(" Установите версию приложения для Android по ссылке. " +
                " Установите облегченную версию приложения для Android по ссылке ");
    }

    public static void outputTheLine3() {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void outputTheLine4() {
        System.out.println("Установите версию приложения для iOS  по ссылке");
    }

    public static void task2() {
        System.out.println("Задание №  2");

        int clientOS3 = 0;
        int clientDeviceYear3 = 2015;
        if (clientOS3 == 0 && clientDeviceYear3 < 2015) {
            outputTheLine1();
        } else if (clientOS3 == 1 && clientDeviceYear3 < 2015) {
            outputTheLine2();
        } else if (clientOS3 == 1) {
            outputTheLine3();
        } else {
            outputTheLine4();
        }
    }

    public static void outputLineIfDistLessThanOrEqualTo20() {
        System.out.println("Потребуется один день для доставки");
    }

    public static void outputTheLineIfDistFrom20To60() {
        System.out.println("Потребуется два дня для доставки");
    }

    public static void outputTheLineIfDistFrom60To100() {
        System.out.println("Потребуется три дня для доставки");
    }

    public static void outputTheLineIfDistMore100() {
        System.out.println("Доставка не осуществляется");
    }

    public static void task3() {
        System.out.println("Задание №  3");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            outputLineIfDistLessThanOrEqualTo20();
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            outputTheLineIfDistFrom20To60();
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            outputTheLineIfDistFrom60To100();
        } else if (deliveryDistance > 100) {
            outputTheLineIfDistMore100();
        }



    }

}