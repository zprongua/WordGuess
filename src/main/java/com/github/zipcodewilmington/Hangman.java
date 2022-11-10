package com.github.zipcodewilmington;
//Zachary Prongua

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    Scanner in = new Scanner(System.in);
    String[] words = {"cat", "cut", "dog", "dig", "sip", "sap", "top", "tip", "tic", "toc"};
    Character[] givenWord;
    Character[] displayWord;
    int nog;

    public Hangman() {
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.runGame();
    }

    public void runGame() {
        initializeGameState();
        announceGame();
        nog=0;

        while (nog<givenWord.length+3) {
            printCurrentState();
            char guess = getNextGuess();
            process(guess);
            nog++;
            if (isWordGuessed()) {
                playerWon();
                break;
            }
        }
        playerLost();
        if (askToPlayAgain()) {
            runGame();
        }
        gameOver();
    }

    public String printArray(Character[] word) {
        StringBuilder str = new StringBuilder();
        for (Character c : word) {
            str.append(c).append(" ");
        }
        return str.toString();
    }

    public void announceGame() {
        System.out.println("Welcome to Guess. That. WORD!");
    }

    public void gameOver() {
        System.out.println("Spiel ist aus!");
    }

    public void initializeGameState() {
        int num = (int) (Math.random()*words.length);
        givenWord = new Character[words[num].length()];
        displayWord = new Character[words[num].length()];
        for (int i=0; i<words[num].length(); i++) {
            givenWord[i] = words[num].charAt(i);
            displayWord[i] = '_';
        }
    }

    public Character getNextGuess() {
//        returns a char from player input
        System.out.println("Guess a letter:");
        return in.nextLine().charAt(0);
    }

    public Boolean isWordGuessed() {
        return Arrays.equals(givenWord, displayWord);
    }

    public Boolean askToPlayAgain() {
        System.out.println("Wanna play a game?");
        return (in.nextLine().equalsIgnoreCase("yes"));
    }

    public void printCurrentState() {
        System.out.println(printArray(displayWord));
    }

    public void process(Character guess) {
        for (int i=0; i< givenWord.length; i++) {
            if (givenWord[i].equals(guess)) {
                displayWord[i] = guess;
            }
        }
    }

    public void playerWon() {
        printCurrentState();
        System.out.println("Yippee. "+nog+" guesses.");
    }

    public void playerLost() {
        System.out.println(printArray(givenWord));
        System.out.println("So sad. ");
    }
}
