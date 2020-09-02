package Hero.Heroes;

import Hero.CastleWarrior;
import Hero.Hero;

import java.util.Random;

public class King  extends CastleWarrior {

    private final Random random = new Random();

    public King() {
        this.hp = random.nextInt(10) + 5;
        this.power = random.nextInt(10) + 5;
    }

    @Override
    public void kick(Hero enemy) {
        System.out.println("King kick");
        super.kick(enemy);
    }
}
