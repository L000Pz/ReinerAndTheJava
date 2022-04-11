package organ;

import armor.Armor;
import interfaces.Damageable;

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    public double getHp() {
        return hp;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean takeDamage(double force) {
        double dmg = (force * calcResist(getArmor().getDurability()))/100;
        hp -= dmg;
        double NewHP = Math.round(hp * 100.0) / 100.0;
        return NewHP<=0;
    }

    public static double calcResist(double x) {
        return 100-x/2;
    }
}
