package GameGuess;

import java.util.Scanner;

public class GuessGame {

    /*
        Create a method name is randomGenerator().

        This method will create random number from 0 to 100.

        This method will return that random number.

        Return type is int

     */

    public int randomGenerator() {
        int randomNum = (int) (Math.random() * 101);
        return randomNum;
    }


  /*
        Create a method name is LetsGuess().

        This method take one int as a parameter.

        Return type is void.

        In this method you must continue to guess numbers until the you guess the correct number.

        When your number is less than random number then print "Your number is too low".

        When your number is more than random number then print "Your number is too high".

        When your guess number is equal to random number than print "You got it !!".

        And stop execution.

        Your maximum attempt to guess is 5.

        If your guess reach to 5 than print "You didn't get it dude!!!"

        Note:
         1) While guessing the numbers you must use the scanner class.
         2) Both of these methods are not a static methods

     */

    public void LetsGuess(int randomNum) {

        Scanner input = new Scanner(System.in);
        System.out.println("Guess Number Please between 0 to 100!!!");

        int count = 0;

        do {
            int guessNum = input.nextInt();
            if (count == 4) {
                System.out.println("You didn't get it dude!!!");
                break;
            }

            if (randomNum < guessNum) {
                System.out.println("Your number is too high");
                System.out.println("Guess again");
            } else if (randomNum > guessNum) {
                System.out.println("Your number is too low");
                System.out.println("Guess again");
            } else {
                System.out.println("You got it !!");
                break;
            }

            count++;

        } while (count < 5);
    }
}
