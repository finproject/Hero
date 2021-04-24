package com.naya.hero.hero;

import com.naya.hero.fabric.RangeParameters;
import org.springframework.stereotype.Component;

import static com.naya.hero.fabric.Generator.*;

@Component
public class King extends Hero implements Fighter {

    public King() {
    }

    public King(String name, int power, int hp) {
        super(name, power, hp);
    }

    @Override
    int kick(Hero enemy) {
        System.out.println("Hay " + enemy.getName() + "I kill you!!!");
        return enemy.getHp() - getPower();
    }

    @Override
  public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void addInformationToObject() {
        this.setName("King name: " + generatorName());
        this.setPower(generatorNumbers(new RangeParameters(5, 15)));
        this.setHp(generatorNumbers(new RangeParameters(5, 15)));
    }
}
