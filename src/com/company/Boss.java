package com.company;

public class Boss {
    private int health;
    private int damage;
    private String defenceAttackType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Wrong health");
        } else {
            this.health = health;
        }

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            System.out.println("Wrong damage");
        } else {
            this.damage = damage;
        }
    }

    public String getDefenceAttackType() {
        return defenceAttackType;
    }

    public void setDefenceAttackType(String defenceAttackType) {
        this.defenceAttackType = defenceAttackType;
    }
}
