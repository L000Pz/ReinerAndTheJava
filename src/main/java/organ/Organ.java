package organ;

import armor.Armor;
import interfaces.Damageable;

/**
 * The organ class that has health
 */
public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    /**
     * This is the constructor of organ
     * @param hp this is the hp
     * @param armor this is the armor
     */
    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    /**
     * This is the getter of hp
     * @return Returns hp
     */
    public double getHp() {
        return hp;
    }

    /**
     * This is the getter of hp
     * @return Returns armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     *<p>Getting a double and calculating remaining hp.</p>
     *<p>Consider there's a durability so the given force will be reduced.</p>
     * @param force the amount of force
     * @return remaining hp
     */
    @Override
    public boolean takeDamage(double force) {
        double dmg = (force * calcResist(getArmor().getDurability()))/100;//
        hp -= dmg;
        double NewHP = Math.round(hp * 100.0) / 100.0;
        if (NewHP <=0){
            NewHP = 0;
        }
        return NewHP <= 0;
    }

    /**
     * calculates the true resistance of an organ against force (durability)
     * @param x The durability of an organ
     * @return The final durability
     */
    public static double calcResist(double x) {
        return 100-x/2;
    }
}
