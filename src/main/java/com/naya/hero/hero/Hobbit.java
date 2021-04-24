package com.naya.hero.hero;

import com.naya.hero.fabric.Generator;
import org.springframework.stereotype.Component;

@Component
public class Hobbit extends Hero implements Fighter {

    public Hobbit() {
    }

    public Hobbit(String name, int power, int hp) {
    }

    @Override
    int kick(Hero enemy) {
        System.out.println("Oh " + enemy.getName() + "... don't hit me, I'll cry!");
        cry();
        return 0;
    }

    private void cry() {
        System.out.println(" The hobbit " + getName() + " cries and begs for mercy");
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void addInformationToObject() {
        this.setName("Hobbit name: " + Generator.generatorName());
        this.setPower(0);
        this.setHp(3);
    }
}
