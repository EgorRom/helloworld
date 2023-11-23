import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №4");
        System.out.println("Задача №1");
        int clientOS = 1;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Ваше устройство не поддерживает наше приложение, приносим свои извинения");

        }
        System.out.println("Задача №2");
        int clientDeviceYear = 2010;
        int clientOs = 0;
        if (clientOs==1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOs==1 && clientDeviceYear>2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOs==0 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else  if (clientOs==0 && clientDeviceYear>2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Ваше устройство не поддерживает наше приложение, приносим свои извинения");
        }
        System.out.println("Задача №3");
        int year = 1700;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не високосный");
        }
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней "+ deliveryDays);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка дней "+ (deliveryDays+1) );
        }
        else if (deliveryDistance >=60 && deliveryDistance <= 100) {
            System.out.println("Доставка дней "+ (deliveryDays+2));
        }
        else {
            System.out.println("Доставки не будет");
        }
        System.out.println("Задача №5");
        int month = 13;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }







    }
}

