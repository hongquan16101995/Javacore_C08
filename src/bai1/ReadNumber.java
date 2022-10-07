package bai1;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần đọc: ");
        int number = scanner.nextInt();
        String finalWord;
        int hundred = number / 100;
        int dozen = (number % 100) / 10;
        int unit = (number % 10);
        if (hundred != 0 && dozen == 1) {
            finalWord = readOneToTwenty(hundred) + "hundred " + readOneToTwenty(Integer.parseInt(dozen + "" + unit));
        } else if (hundred != 0) {
            finalWord = readOneToTwenty(hundred) + "hundred " + readToDozens(dozen) + readOneToTwenty(unit);
        } else if (dozen == 1) {
            finalWord = readOneToTwenty(Integer.parseInt(dozen + "" + unit));
        } else {
            finalWord = readToDozens(dozen) + readOneToTwenty(unit);
        }
        System.out.println(finalWord);
    }

    public static String readToDozens(int unit) {
        String unitString = "";
        switch (unit) {
            case 2:
                unitString = "twenty";
                break;
            case 3:
                unitString = "thirty";
                break;
            case 4:
                unitString = "forty";
                break;
            case 5:
                unitString = "fifty";
                break;
            case 6:
                unitString = "sixty";
                break;
            case 7:
                unitString = "seventy";
                break;
            case 8:
                unitString = "eighty";
                break;
            case 9:
                unitString = "ninety";
                break;
        }
        return unitString;
    }

    public static String readOneToTwenty(int unit) {
        String unitString = "";
        switch (unit) {
            case 1:
                unitString = "one";
                break;
            case 2:
                unitString = "two";
                break;
            case 3:
                unitString = "three";
                break;
            case 4:
                unitString = "four";
                break;
            case 5:
                unitString = "five";
                break;
            case 6:
                unitString = "six";
                break;
            case 7:
                unitString = "seven";
                break;
            case 8:
                unitString = "eight";
                break;
            case 9:
                unitString = "nine";
                break;
            case 10:
                unitString = "ten";
                break;
            case 11:
                unitString = "eleven";
                break;
            case 12:
                unitString = "twelve";
                break;
            case 13:
                unitString = "thirteen";
                break;
            case 14:
                unitString = "fourteen";
                break;
            case 15:
                unitString = "fifteen";
                break;
            case 16:
                unitString = "sixteen";
                break;
            case 17:
                unitString = "seventeen";
                break;
            case 18:
                unitString = "eighteen";
                break;
            case 19:
                unitString = "nineteen";
                break;
            case 20:
                unitString = "twenty";
                break;
        }
        return unitString;
    }
}
