package mahirJointCode;

import java.util.Scanner;

public class HwFive {
    public static void main(String[] args){
        HwFive five = new HwFive();
        //five.nByNTable();
        five.numberGuessingGame();
    }
    public void nByNTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int n = sc.nextInt();
        //a nested for loop should suffice
        for(int i = 1; i <= n; i++){
            String column = "";
            for(int j = 1; j <= n; j++){
                int noIntoColumn = i * j;
                column = column.concat(noIntoColumn + "\t");
            }
            System.out.println(column);
        }
    }
    public void numberGuessingGame(){
        int randomNumber = (int) (Math.random() * (101 + 1)); //formula is Math.random() * (max - min + 1) + min
        Scanner sc = new Scanner(System.in);
        System.out.println("I thought of a number between 1 and 100! Try to guess it. ");
        int lowerRange = 1;
        int higherRange = 100;
        for(int i = 0; i < 5; i++){
            System.out.printf("Range: [%d, %d], Number of guesses left: %d %n", lowerRange, higherRange, (5 - i)); //does the same thing as string.format. the %n forces a new line to be formed
            int userGuess = sc.nextInt();
            System.out.printf("Your guess: %d %n", userGuess);
            if(userGuess == randomNumber){
                System.out.printf("Congrats! You guessed my number in %d guesses.", (i + 1));
                break;
            } else if(userGuess != randomNumber){
                if(i == 4){
                    System.out.printf("Out of guesses! My number is %d", randomNumber);
                    break;
                }
                if(userGuess > randomNumber){
                    System.out.println("Wrong! My number is smaller.");
                    if(userGuess < higherRange) {
                        higherRange = userGuess;
                    }
                } else if(userGuess < randomNumber){ //bullshit, this is NOT always true
                    System.out.println("Wrong! My number is larger.");
                    if(userGuess > lowerRange) {
                        lowerRange = userGuess;
                    }
                }
            }
        }
    }
}
