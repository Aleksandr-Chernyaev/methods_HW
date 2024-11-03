//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");

        checkIsLeapYear(2018);
        checkIsLeapYear(2028);
        checkIsLeapYear(1875);

        // task 2
        System.out.println("Задача 2");

        defineAppVersion(0, 2024);
        defineAppVersion(1, 2013);
        defineAppVersion(5, 2018);
        defineAppVersion(1, 2024);

        // task 3
        System.out.println("Задача 3");

        System.out.println("Потребуется дней: " + calcDeliveryDays(27));
        System.out.println("Потребуется дней: " + calcDeliveryDays(97));
        System.out.println("Потребуется дней: " + calcDeliveryDays(15));

    }

    private static void checkIsLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(+year + " год — високосный год.");
        } else {
            System.out.println(+year + " год — невисокосный год.");
        }
    }

    private static void defineAppVersion(int mobileOs, int mobileYear) {
        String mobileOsName;

        switch (mobileOs) {
            case 0:
                mobileOsName = "iOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "Неизвестная ОС";
        }

        int currentYear = 2020;

        if (mobileYear > currentYear) {
            System.out.println("Для ОС " + mobileOsName + " установите обычную версию приложения");
        } else {
            System.out.println("Для ОС " + mobileOsName + " установите облегченную версию приложения");
        }
    }

    private static int calcDeliveryDays(int distance) {
        int deliveryDays;

        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance > 20 && distance <= 60) {
            deliveryDays = 2;
        } else if (distance > 60 && distance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }

        return deliveryDays;
    }
}