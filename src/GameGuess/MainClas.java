package GameGuess;

public class MainClas {

    /*
     In the main method

     First get the random number from the randomGenerator method

     Then call the LetsGuess method . randomGenerator num is parameter of the LetsGuess method

      */

    public static void main(String[] args) {

        GuessGame guess1 = new GuessGame();
        int random = guess1.randomGenerator();
        System.out.println(random);
        guess1.LetsGuess(random);

    }
}
