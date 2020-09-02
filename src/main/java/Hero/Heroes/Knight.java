package Hero.Heroes;

import Hero.CastleWarrior;
import Hero.Hero;

import java.util.Random;

public class Knight  extends CastleWarrior {

    private final Random random = new Random();

    public Knight() {
        this.hp = random.nextInt(10) + 2;
        this.power = random.nextInt(10) + 2;
    }

    @Override
    public void kick(Hero enemy) {
        System.out.println("Knight kick");
        super.kick(enemy);
    }
}
