package com.naya.hero.hero;

import com.naya.hero.fabric.Generator;
import org.springframework.stereotype.Component;

@Component
public class Elf extends Hero implements Fighter {

    public Elf() {
    }

    public Elf(String name, int power, int hp) {
    }

    @Override
    int kick(Hero enemy) {
        if (getPower() > enemy.getPower()) {
            System.out.println("Die baby !!!! Ha ha ha ha");
            return 0;
        } else {
            enemy.setPower(enemy.getPower() - 1);
            System.out.println("Don't be happy !!! I will kill you anyway !!!");
            return enemy.getHp();
        }
    }

    @Override
   public boolean isAlive() {
        return super.isAlive();
    }


    @Override
    public void addInformationToObject() {
        this.setName("Elf name: " + Generator.generatorName());
        this.setPower(10);
        this.setHp(10);
    }

}
