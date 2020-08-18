package mahirJointCode;

import org.apache.commons.math3.util.Precision;

import java.util.Scanner;

public class firstWeekAugustHW {
    public static void main(String[] args) {
        firstWeekAugustHW f = new firstWeekAugustHW();
        f.hwQTwoCleaner();
        //f.hwqQFourPartOne();
        //f.hwqQFourPartTwo();
        //f.hwqQSix();
    }

    public void hwQTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimalNumber = sc.nextInt();
        String noInRomanNumerals = "";

        int dividend = decimalNumber / 1000;
        if (dividend != 0) {
            noInRomanNumerals += "M".repeat(dividend);
            decimalNumber = decimalNumber - (1000 * dividend);
        }
        dividend = decimalNumber / 500;
        if (dividend != 0) {
            noInRomanNumerals += "D".repeat(dividend);
            decimalNumber = decimalNumber - (500 * dividend);
        }
        dividend = decimalNumber / 100;
        if (dividend != 0) {
            noInRomanNumerals += "C".repeat(dividend);
            decimalNumber = decimalNumber - (100 * dividend);
        }
        dividend = decimalNumber / 50;
        if (dividend != 0) {
            noInRomanNumerals += "L".repeat(dividend);
            decimalNumber = decimalNumber - (50 * dividend);
        }
        dividend = decimalNumber / 10;
        if (dividend != 0) {
            noInRomanNumerals += "X".repeat(dividend);
            decimalNumber = decimalNumber - (10 * dividend);
        }
        dividend = decimalNumber / 5;
        if (dividend != 0) {
            noInRomanNumerals += "V".repeat(dividend);
            decimalNumber = decimalNumber - (5 * dividend);
        }
        dividend = decimalNumber / 1;
        if (dividend != 0) {
            noInRomanNumerals += "I".repeat(dividend);
            decimalNumber = decimalNumber - (1 * dividend);
        }

        System.out.println(noInRomanNumerals);
    }

    public void hwQTwoCleaner() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimalNumber = sc.nextInt();
        String noInRomanNumerals = "";

        String[] arrayOfRomanNumSymb = {"M", "D", "C", "L", "X", "V", "I"};
        int[] arrayRomanNumInInt = {1000, 500, 100, 50, 10, 5, 1};

        for (int i = 0; i < arrayOfRomanNumSymb.length; i++) {
            int dividend = decimalNumber / arrayRomanNumInInt[i];
            if (dividend != 0) {
                noInRomanNumerals += arrayOfRomanNumSymb[i].repeat(dividend);
                decimalNumber = decimalNumber - (arrayRomanNumInInt[i] * dividend);
            }
            if (decimalNumber == 9) {
                noInRomanNumerals += "IX";
                break;
            }
            if (decimalNumber == 4) {
                noInRomanNumerals += "IV";
                break;
            }
        }
        System.out.println(noInRomanNumerals);
    }

    public void hwqQFourPartOne() {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases;
        int totalProduct = 1;
        System.out.println("Enter length of the sequence: ");
        noOfTestCases = sc.nextInt();

        System.out.println("Please enter your sequence: ");
        for (int i = 0; i < noOfTestCases; i++) {
            int currentInt = sc.nextInt();
            totalProduct = (totalProduct * currentInt);
        }
        double geometricMean = Math.pow(totalProduct, (1.0 / noOfTestCases)); //could put math.round to round the number
        System.out.println("The geometric mean is: " + Precision.round(geometricMean, 4));
    }

    public void hwqQFourPartTwo() {
        Scanner sc = new Scanner(System.in);
        int totalProduct = 1;
        int currentInt = 0;
        int sizeOfSequence = 0;
        System.out.println("Please enter your sequence: ");

        while (true) {
            currentInt = sc.nextInt();
            if (currentInt == -1) {
                break;
            }
            totalProduct = (totalProduct * currentInt);
            sizeOfSequence++;
        }

        double geometricMean = Math.pow(totalProduct, (1.0 / sizeOfSequence)); //could put math.round to round the number
        System.out.println("The geometric mean is: " + Precision.round(geometricMean, 4));
    }

    public void hwqQSix() {
        //more even digits then odd digits
        //pretty much everything about to 100 will be the even numbers, after 100 it will be even digits as well
        //after 200, it will be 200, 201, 202, 203, 204, 205, 206, 207, 208...
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number 'n' to go up to: ");
            n = sc.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.println("Please enter a positive number this time");
            }
        }
        for (int i = 1; i <= n; i++) {
            String currentIntInString = Integer.toString(i);
            int oddCounter = 0;
            int evenCounter = 0;
            for (int j = 0; j < currentIntInString.length(); j++) { //this loop will handle each individual digit of 'i'
                int currentInt = Character.getNumericValue(currentIntInString.charAt(j));
                if (((currentInt + 2) % 2) > 0) {
                    oddCounter++;
                } else {
                    evenCounter++;
                }
            }
            if (evenCounter > oddCounter) {
                System.out.println(currentIntInString);
            }
        }
    }
}