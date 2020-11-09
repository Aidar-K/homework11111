package com.company;

public class AntiMage extends Wizards {
    private MagicalAttack magicalAttack;
    private int protection;
    private int height1;

    public AntiMage(int health, int damage, MagicalAttack magicalAttack, int protection, int height1) {
        super(health, damage);
        this.magicalAttack = magicalAttack;
        this.protection = protection;
        this.height1 = height1;
    }

    public MagicalAttack getMagicalAttack() {
        return magicalAttack;
    }
    public int protection(){
        return protection;
    }

    public int getHeight1() {
        return height1;
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(String voice,int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    public String getInfo() {
        return "Anti-Mage = " +
                "\nMagicalAttack = " + getMagicalAttack() +
                "\nProtection = " + protection() +
                "\nHeight = " + getHeight1() +
                "\nHealth = " + getHealth() +
                "\nDamage = " + getDamage();
    }
}
