package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Shakeel on 7/27/2016.
 */
public class Troll implements Monster {

    private float hitPoints;
    private String name;

    public Troll() {
        name = "Troll";
        hitPoints = 40;
    }
    
    @Override
    public void takeDamage(int amount) {
        hitPoints -= (amount/2);
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name);
        System.out.println("Current Hitpoints: " + hitPoints);
    }
}
