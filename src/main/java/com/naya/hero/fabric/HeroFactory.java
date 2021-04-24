package com.naya.hero.fabric;

import com.naya.hero.hero.Fighter;
import com.naya.hero.hero.Hero;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.naya.hero.fabric.Generator.*;

@Slf4j
@Component
public class HeroFactory {
    @Autowired
    private final List<Fighter> list = new ArrayList<>();
    private final List<Hero> cache = new ArrayList<>();

    public HeroFactory() {
    }

    @SneakyThrows
    public List<Hero> createHero(int countOfHeroes) {
        log.info("Count of fighters in list: " + countOfHeroes);

        for (int i = 0; i < countOfHeroes; i++) {
            Fighter fighter = list.get(generatorNumbers(new RangeParameters(0, list.size())));
            fighter.addInformationToObject();
            cache.add((Hero) fighter);
            log.info("In the Cache added fighter: " + fighter);
        }
        return cache;
    }
}
