package mahirJointCode;

import java.util.Scanner;

public class HwSix {
    public static void main(String[] args){
        HwSix hwSix = new HwSix();
        //hwSix.qOneFibonacciSeq();
        //hwSix.qTwoPrintShiftedTriangle(8, 6, '+');
        //hwSix.qTwoPrintPineTree(17, '*');
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
    public void qTwoPrintPineTree(int n, char symbol){
        //repeating one, three, five, seven, etc. as the pine tree goes on
        String symbolInChar = Character.toString(symbol);
        /*
        -- each pine tree will have one more row than its number, i.e. the first one will have two rows, second will have three, etc.
        -- the top row on each tree will be the same number of spaces as the number of rows the pine tree has, minus one
        -- each row itself will go in a series of 1, 3, 5, 7, etc. The number of rows is the current pine tree, + 1
        -- A nested for loop will be used; the outer to generate the tree, the inner to generate each row on the tree
         */
        //n is the number of pine trees, and the maximum number of spaces will be on the first row of the lowest pine, which is just n. As we go down rows, the number of spaces decreases by 1
        for (int i = 1; i <= n; i++) { //the number of pine trees to generate
            String aPineTree = "";
            for(int j = 0; j < i + 1; j++){
                String noOfSpaces = " ".repeat(n - j);
                aPineTree = aPineTree.concat(noOfSpaces + symbolInChar.repeat((2 * j) + 1));
                if(j != i){
                    aPineTree = aPineTree.concat("\n");
                }
            }
            System.out.println(aPineTree);
        }
    }
    
}
