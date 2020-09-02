package Hero;

import java.util.Random;

public abstract class CastleWarrior extends Hero{

    private final Random random = new Random();

    @Override
    public void kick(Hero enemy) {
        int hit = random.nextInt(this.power);
        enemy.setHp(enemy.getHp() - hit);
    }
}
