public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void softwareDefinition(int clientDeviceYear, int clientOS) {


        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию для iOS");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию для Android");
        }
    }

    public static int calculationOfDelivery  (int deliveryDistance) {


        int deliveryDays = 1;
        System.out.println("Потребуется дней: " + deliveryDays);
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return deliveryDays;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays+=1;
            return deliveryDays;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            return deliveryDays;
        } else {
            System.out.println("Доставка недоступна на расстояние более 100 км");
            return -1;
        }
    }


    public static void main (String[] args) {
        System.out.println("Задание 1");
        Main.checkLeapYear (2025);


        System.out.println("Задание 2");
        softwareDefinition(2015, 0);


        System.out.println("Задание 3");
        calculationOfDelivery (500);
    }
}