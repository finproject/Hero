package com.naya.hero;


import com.naya.hero.fabric.HeroFactory;
import com.naya.hero.hero.Fighter;
import com.naya.hero.hero.Hero;
import com.naya.hero.manager.GameManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class HeroApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.naya.hero");

        HeroFactory heroFactory = context.getBean(HeroFactory.class);
        List<Hero> hero = heroFactory.createHero(6);

        GameManager gameManager = context.getBean(GameManager.class);
        gameManager.poster(hero);


    }
}
