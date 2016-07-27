package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int answer = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the magic number from 1-100!");
        int guess = scan.nextInt();
        while (guess != answer) {
            if (guess > answer) {
                System.out.println("Too high. Guess lower!");
            } else {
                System.out.println("Too low. Guess higher!");
            }
            guess = scan.nextInt();
        }
        System.out.println("You win! The answer was indeed " + answer + "!");
    }
}
