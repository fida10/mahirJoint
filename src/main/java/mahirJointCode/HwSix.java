package mahirJointCode;

import java.util.Scanner;

public class HwSix {
    public static void main(String[] args){
        HwSix hwSix = new HwSix();
        //hwSix.qOneFibonacciSeq();
        hwSix.qTwoPrintShiftedTriangle(8, 6, '+');
    }
    public void qOneFibonacciSeq(){
        //denoting the fibonacci series; enter an int n and it will give you the nth term of the series
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int n = sc.nextInt();
        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 1;
        if(n > 1) {
            fibonacciArray[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        System.out.println(fibonacciArray[n - 1]); //-1 to select index, as n is the length which is 1 more than index
    }
    public void qTwoPrintShiftedTriangle(int n, int m, char symbol){
        //the number of symbols per column should be (2 * index number) + 1; and the index number is always n - 1 while the length of the array to store this thing in is n
        String symbolInString = Character.toString(symbol);
        for (int i = 0; i < n; i++) {
            String noOfSpaces = " ".repeat(m + (n - 1) - i);
            String currentRow = noOfSpaces.concat(symbolInString.repeat((2 * i) + 1));
            System.out.println(currentRow);
        }
    }
}
