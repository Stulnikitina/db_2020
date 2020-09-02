package Hero;

public abstract class Hero {

    protected int hp;
    protected int power;

    public abstract void kick(Hero enemy);

    public int getHp() {
        return this.hp;
    }

    public int getPower() {
        return this.power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
