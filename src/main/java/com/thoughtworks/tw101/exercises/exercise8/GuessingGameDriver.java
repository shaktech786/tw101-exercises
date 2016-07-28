package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Shakeel on 7/27/2016.
 */
public class GuessingGameDriver {
    private final Scanner scanner;
    private final Randomizer randomizer;
    private final int ANSWER;
    private List<Integer> database;

    public GuessingGameDriver() {
        scanner = new Scanner(System.in);
        randomizer = new Randomizer();
        ANSWER = randomizer.getAnswer();
        database = new ArrayList<>();
    }

    public void playGame() {
        System.out.println("Guess the magic number from 1-100!");
        int guess = 0;
        while (guess != ANSWER) {
            try {
                guess = Integer.parseInt(scanner.nextLine());
                storeGuess(guess);
                if (guess > ANSWER) {
                    System.out.println("Too high. Guess lower!");
                } else {
                    System.out.println("Too low. Guess higher!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input an integer!");
            }
        }
        System.out.println("You win! The answer was indeed " + ANSWER + "!");
        printGuesses();
    }

    private void storeGuess(int guess) {
        database.add(guess);
    }

    private void printGuesses() {
        System.out.println("Your guesses:");
        for (int guess : database) {
            System.out.println(guess);
        }
    }
}
