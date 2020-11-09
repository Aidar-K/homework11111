package com.company;

public final class Healer extends AntiMage {
    private int height;

    public Healer(int health, int damage, MagicalAttack magicalAttack, int protection, int height) {
        super(health, damage,magicalAttack,protection, height);
        this.height = height;
    }

    private int getHeight() {
        return height;
    }

    public String getInfo() {
        return "Healer = " +
                "\nHeight = " + height +
                "\nMagicalAttack = " + getMagicalAttack() +
                "\nProtection = " + protection() +
                "\nHealth = " + getHealth() +
                "\nHealth = " + getDamage();
    }
    }







