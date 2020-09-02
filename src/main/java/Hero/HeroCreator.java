package Hero;

import Hero.Hero;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HeroCreator {
    private final List<String> heroTypes = Arrays.asList("Hobbit", "Elf", "King", "Knight");
    private final Random random = new Random();

    public Hero createHero() throws Exception {
        String randomHeroType = heroTypes.get(random.nextInt(heroTypes.size()));

        String pack = "Hero.Heroes." + randomHeroType;
        return (Hero) Class.forName(pack).getConstructor().newInstance();
    }

}
