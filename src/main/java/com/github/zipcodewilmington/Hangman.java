package com.github.zipcodewilmington;
//Zachary Prongua

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    String[] words = {"cat", "cut", "dog", "dig", "sip", "sap", "top", "tip", "tic", "toc"};
    Character[] userAnswer = new Character[3];
    Character[] givenWord = new Character[3];

    public void Hangman() {
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        int nog = 0;
        game.runGame();
    }

    public void runGame() {
//        choose a random word from a list
        initializeGameState();
        //NumberOfGuesses
        int nog = 0;

        announceGame();
//
//        while (you want to play) { //outer loop
        while (nog<=givenWord.length+3) {
//            start the game

//            set word guessed to false
            while (!isWordGuessed()){ //(the word isn't guessed) { //inner loop
//            print the current game state
                printCurrentState();
//            ask for a guess (a single letter)
                char guess = getNextGuess();
//            check the letter against the word
                process(guess);
//            using the two character arrays discussed above
//            increment the number of guesses
                nog++;
//
//            if the word is guessed
//            player won, congrats
                playerWon();
//
//            if too many guesses
//            player lost, too bad, quit game
                playerLost();
            }
//        ask if player wants to play again
            if (askToPlayAgain()) {
                nog=0;
            };
        }
//    display game over
    gameOver();
    }

    public String printArray() {
        return null;
    }

    public void announceGame() {
        System.out.println("Welcome to Guess. That. WORD!");
    }

    public void gameOver() {
        System.out.println("Spiel ist aus!");
    }

    public void initializeGameState() {
//        sets up char[] for secret word and guesses
    }

    public Character getNextGuess() {
//        returns a char from player input
        return null;
    }

    public Boolean isWordGuessed() {
//    returns boolean
        return false;
    }

    public Boolean askToPlayAgain() {
//        returns boolean
        return false;
    }

    public void printCurrentState() {
//    uses printArray to show player where they are at
        printArray();
    }

    public void process(Character guess) {
//        loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
    }

    public void playerWon() {
//    prints happy message
    }

    public void playerLost() {
//    print sad message
    }
}
