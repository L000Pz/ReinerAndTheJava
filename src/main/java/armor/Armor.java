package armor;

import interfaces.Damageable;

public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;

    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability() {
        this.durability = durability;
    }

    public double getK() {
        return k;
    }

    @Override
    public boolean takeDamage(double force) {
        double NewForce = force/k;
        double NewNewForce = Math.round(NewForce * 100.0) / 100.0;
        durability -= NewNewForce;
        return durability <= 0;
    }
}
