package Hero.Heroes;

import Hero.Hero;

public class Hobbit extends Hero{

    public Hobbit() {
        hp = 3;
        power = 0;
    }

    @Override
    public void kick(Hero enemy) {
        System.out.println("Hobbit kick");
        System.out.println("Plak plak");
    }
}
