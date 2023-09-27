package firstapp;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Task 1 CheckOddEven");
        int fstnum = 12;
        int sndnum = 4;
        double result = fstnum % sndnum;
        if (result != 0) {
            System.out.println("Odd number");
        } else if (result == 0) {
            System.out.println("Even number");
        }
        System.out.println("BYE");

        System.out.println("Task 2 PrintMonthInWord");

        System.out.println("1st variant if-else");
        int month = 1;
        if (month == 1) {
            System.out.println("JAN");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MAR");
        } else if (month == 4) {
            System.out.println("APR");
        } else if (month == 5) {
            System.out.println("MAY");
        } else if (month == 6) {
            System.out.println("JUNE");
        } else if (month == 7) {
            System.out.println("JULY");
        } else if (month == 8) {
            System.out.println("AUG");
        } else if (month == 9) {
            System.out.println("SEPT");
        } else if (month == 10) {
            System.out.println("OCT");
        } else if (month == 11) {
            System.out.println("NOV");
        } else if (month == 12) {
            System.out.println("DEC");
        } else if (month > 12 && month < 1 ) {
            System.out.println("Not a valid month");
        }

        System.out.println("2nd variant switch");
        int month2 = 15;
        switch (month2) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEPT");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }

        System.out.println("Task 3 Absolute value");
        int trdnum = 3;
        int fthnum = -9;
        int abs1 = Math.abs(trdnum);
        int abs2 = Math.abs(fthnum);
        if (abs1 > abs2) {
            System.out.println(trdnum + " has a greater absolute value than " + fthnum);
        } else if (abs1 < abs2) {
            System.out.println(fthnum + " has a greater absolute value than " + trdnum);
        } else if (abs1 == abs2) {
            System.out.println(trdnum + " has equal absolute value as " + fthnum);
        }

        System.out.println("Task 4 Isosceles triangle");
        int sideA = 5;
        int sideB = 5;
        if (sideA == sideB) {
            System.out.println("Triangle is isosceles");
        } else if (sideA != sideB) {
            System.out.println("Triangle is not isosceles");
        }

        System.out.println("Task 5 Middle symbols");
        String str1 = "Hillel";
        String str2 = "Java";
        String str3 = "Hometask";

        System.out.println("Middle symbols of " + str1 + " is " + str1.substring(2,4));
        System.out.println("Middle symbols of " + str2 + " is " + str2.substring(1,3));
        System.out.println("Middle symbols of " + str3 + " is " + str3.substring(3,5));

    }
}