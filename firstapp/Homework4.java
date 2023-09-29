package firstapp;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Task 1 CheckOddEven");
        int fstNumber = 12;
        int sndNumber = 4;
        double result = fstNumber % sndNumber;
        if (result != 0) {
            System.out.println("Odd number");
        } else {
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
        } else {
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
        int trdNumber = 3;
        int fthNumber = -9;
        int abs1 = Math.abs(trdNumber);
        int abs2 = Math.abs(fthNumber);
        if (abs1 > abs2) {
            System.out.println(trdNumber + " has a greater absolute value than " + fthNumber);
        } else if (abs1 < abs2) {
            System.out.println(fthNumber + " has a greater absolute value than " + trdNumber);
        } else {
            System.out.println(trdNumber + " has equal absolute value as " + fthNumber);
        }

        System.out.println("Task 4 Isosceles triangle");
        int sideA = 5;
        int sideB = 5;
        int sideC = 8;
        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is not isosceles");
        }

        System.out.println("Task 5 Middle symbols");
        //ver1
        String str1 = "Hometask";
        if (str1.length() == 4) {
            System.out.println("Middle symbols of " + str1 + " are " + str1.substring(1,3));
        } else if (str1.length() == 6) {
            System.out.println("Middle symbols of " + str1 + " are " + str1.substring(2,4));
        } else if (str1.length() == 8) {
            System.out.println("Middle symbols of " + str1 + " are " + str1.substring(3,5));
        } else {
            System.out.println("not coded");
        }
        //ver2
        String str2 = "Hillel";
        int length = str2.length();
        int lResult1 = length / 2 - 1;
        int lResult2 = length / 2;
        char valueFst = str2.charAt(lResult1);
        char valueSnd = str2.charAt(lResult2);
        System.out.println("Middle symbols of " + str2 + " are " + valueFst + valueSnd);


    }
}