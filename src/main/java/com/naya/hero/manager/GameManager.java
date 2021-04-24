package com.naya.hero.manager;

import com.naya.hero.hero.Hero;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameManager {

    public void poster(List<Hero> fighters) {
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>LIST OF BATTLES>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        sleepRun();
        for (int i = 0; i < fighters.size() - 1; i++) {
            Hero hero1 = fighters.get(i);

            if (i + 1 < fighters.size() - 2) {
                Hero hero2 = fighters.get(i + 1);
                System.out.println(hero1.toString() + " VS " + hero2.toString());
                fight(hero1, hero2);
            }
            sleepRun();
        }
    }

    public void fight(Hero c1, Hero c2) {
        System.out.println("Fight: I didn't have time to add the code");
        // while (c1.isAlive() && c2.isAlive()) {
//
        //}

    }

    @SneakyThrows
    private void sleepRun() {
        Thread.sleep(2000);
    }
}
