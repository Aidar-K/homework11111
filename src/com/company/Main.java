package com.company;

public class Main {

    public static void main(String[] args) {
        AntiMage antiMage = new AntiMage(100,50,MagicalAttack.Expelliarmus,50, 200);
        Healer healer = new Healer(50,15,MagicalAttack.ExpectoPatronum,20,165);
        Healer healer1 = new Healer(100,30,MagicalAttack.Akcio,5,175);

        System.out.println(antiMage.getInfo());
        System.out.println("----------------------------------------");
        System.out.println(healer.getInfo());
        System.out.println("----------------------------------------");
        System.out.println(healer1.getInfo());
        System.out.println("----------------------------------------");

        antiMage.makeVoice(1,"Meow");

        antiMage.makeVoice("Hello",1);
    }
}