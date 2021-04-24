package com.naya.hero.hero;

import com.naya.hero.fabric.RangeParameters;
import org.springframework.stereotype.Component;

import static com.naya.hero.fabric.Generator.generatorName;
import static com.naya.hero.fabric.Generator.generatorNumbers;

@Component
public class Knight extends King implements Fighter {

    public Knight() {
    }

    public Knight(String name, int power, int hp) {
        super(name, power, hp);
    }

    @Override
    int kick(Hero enemy) {
        return super.kick(enemy);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void addInformationToObject() {
        this.setName("Knight name: " + generatorName());
        this.setPower(generatorNumbers(new RangeParameters(2, 12)));
        this.setHp(generatorNumbers(new RangeParameters(2, 12)));
    }
}
