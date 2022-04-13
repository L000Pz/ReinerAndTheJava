package armor;

import interfaces.Damageable;

/**
 * The armor class that uses durability and k
 */
public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;

    /**
     * The armor constructor
     * @param durability Is the durability
     * @param k Is the K
     */
    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    /**
     * Durability getter
     * @return durability
     */
    public double getDurability() {
        return durability;
    }

    public void setDurability() {
        this.durability = durability;
    }

    /**
     * The K getter
     * @return The K
     */
    public double getK() {
        return k;
    }

    /**
     * Calculates the armor durability;
     * In which the given force is divided by a K-factor;
     * Each K-force will reduce durability by one.
     * @param force The amount of power given
     * @return The new durability after K-factor has subtracted.
     */
    @Override
    public boolean takeDamage(double force) {
        double NewForce = force/k;
        double NewNewForce = Math.round(NewForce * 100.0) / 100.0;
        durability -= NewNewForce;
        return durability <= 0;
    }
}
