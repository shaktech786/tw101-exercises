package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by Shakeel on 7/27/2016.
 */
public class Randomizer {
    private final int ANSWER;

    public Randomizer() {
        Random rand = new Random();
        ANSWER = rand.nextInt(100);
    }

    public int getAnswer() {
        return ANSWER;
    }
}
