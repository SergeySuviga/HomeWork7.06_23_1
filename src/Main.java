// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int clientOS = 2;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("OS не поддерживается");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");

        int iOs = 0;
        int android = 1;
        int checkYear = 2015;

        int divaceOff = 2015;
        String osType;

        if (iOs == 0) {
            osType = "iOS";
        } else if (android == 1) {
            osType = "Android";
        } else {
            System.out.println("Неизвестное OS");
            return;
        }

        if (checkYear < divaceOff) {
            System.out.println("Установите облегченную версию приложения для " + osType + " по ссылке.");
        } else {
            System.out.println("Установите версию приложения для " + osType + " по ссылке.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным.");
        } else {
            System.out.println("Год " + year + " не является високосным.");

        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance  = 160;
        int deliveryDaes = 1;

        if(deliveryDistance < 20){

            System.out.println("Потребуется дней: " + deliveryDaes);

        }else if(deliveryDistance <= 60) {

            System.out.println("Потребуется дней: " + (deliveryDaes + 1));

        }else if(deliveryDistance <= 100) {

            System.out.println("Потребуется дней: " + (deliveryDaes + 2));

        }else{

            System.out.println("Свыше 100 км доставки нет");

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNomber = 12;
        switch (monthNomber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Неверный номер месяца");
                break;

        }
    }
}
