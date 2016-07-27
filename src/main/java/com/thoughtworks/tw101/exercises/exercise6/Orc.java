package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Shakeel on 7/27/2016.
 */
public class Orc implements Monster{
    private float hitPoints;
    private String name;

    public Orc() {
        name = "Orc";
        hitPoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name);
        System.out.println("Current Hitpoints: " + hitPoints);
    }
}
