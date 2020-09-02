package Hero;

import Hero.Hero;

public class GameManager {
    public void fight(Hero hero1, Hero hero2) {
        System.out.println("Fighter 1: " + hero1.getClass().getSimpleName() + "\n hp: " + hero1.getHp() +  "\n power: " + hero1.getPower());
        System.out.println("Fighter 2: " + hero2.getClass().getSimpleName() + "\n hp: " + hero2.getHp() +  "\n power: " + hero2.getPower());

        while (hero1.isAlive() && hero1.isAlive()){
            if( hero1.getClass().getSimpleName().equals(hero2.getClass().getSimpleName()) && hero1.getClass().getSimpleName().equals("Hobbit")) {
                System.out.println("Это 2 хоббита, что с них взять");
                break;
            }
            if( hero1.getClass().getSimpleName().equals(hero2.getClass().getSimpleName()) && hero1.getClass().getSimpleName().equals("Elf")) {
                System.out.println("Это 2 эльфа, это надолго");
                break;
            }
            hero1.kick(hero2);
            hero2.kick(hero1);
        }

        if (hero1.isAlive() && !hero2.isAlive()){
            System.out.println("Hero1 Победил");
        }
        else if (!hero1.isAlive() && hero2.isAlive()){
            System.out.println("Hero2 Победил");
        }
        else if (!hero1.isAlive() && !hero2.isAlive()){
            System.out.println("Оба проиграли");
        }
    }
}
