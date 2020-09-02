package Hero.Heroes;

import Hero.Hero;

public class Elf extends Hero{

    public Elf() {
        hp = 10;
        power = 10;
    }

    @Override
    public void kick(Hero enemy) {
        System.out.println("Elf kick");
        if (enemy.getPower() < power) enemy.setHp(0);
        else enemy.setPower(enemy.getPower() - 1);
    }
}
