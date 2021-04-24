package com.naya.hero.hero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Hero {
    private String name;
    private int power;
    private int hp;

    public Hero() {
    }

    public Hero(String name, int power, int hp) {
        this.name = name;
        this.power = power;
        this.hp = hp;
    }

    abstract int kick(Hero enemy);

   public boolean isAlive() {
        return hp <= 0 ? false : true;
    }


    public String toString() {
        return this.getName() + " (power=" + this.getPower() + ", hp=" + this.getHp() + ")";
    }
}
