package Hero;

import Hero.Hero;

public class Game {

    Hero hero1;
    Hero hero2;

    void start() throws Exception {
        HeroCreator hCreator =  new HeroCreator();

        hero1 = hCreator.createHero();
        hero2 = hCreator.createHero();

        GameManager gManager = new GameManager();
        gManager.fight(hero1, hero2);
    }
}
