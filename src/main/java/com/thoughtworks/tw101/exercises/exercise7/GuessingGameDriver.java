package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Shakeel on 7/27/2016.
 */
public class GuessingGameDriver {
    private final Scanner scanner;
    private final Randomizer randomizer;
    private final int ANSWER;

    public GuessingGameDriver() {
        scanner = new Scanner(System.in);
        randomizer = new Randomizer();
        ANSWER = randomizer.getAnswer();
    }

    public void startGame() {
        System.out.println("Guess the magic number from 1-100!");
        int guess = scanner.nextInt();
        while (guess != ANSWER) {
            if (guess > ANSWER) {
                System.out.println("Too high. Guess lower!");
            } else {
                System.out.println("Too low. Guess higher!");
            }
            guess = scanner.nextInt();
        }
        System.out.println("You win! The answer was indeed " + ANSWER + "!");
    }
}
