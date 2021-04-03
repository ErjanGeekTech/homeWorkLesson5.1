package com.company;

public class Main {

    public static void main(String[] args) {
        createHeroes();
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenceAttackType("Magical");
        System.out.println("Boss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage() + "\nBoss defenceAttackType: " + boss.getDefenceAttackType());
    }

    public static Hero[] createHeroes() {
        Hero heroMagical = new Hero(220, 25, "Magical");
        Hero heroPhysical = new Hero(250, 15, "Physical");
        Hero heroLucky = new Hero(200, 20, "Lucky");
        Hero[] hero = {heroMagical, heroPhysical, heroLucky};
        for (int i = 0; i < hero.length; i++) {
            System.out.println("Health: " + hero[i].getHealth() + " Damage: {" + hero[i].getDamage() + "} " + "Type defence: " + hero[i].getAbility());
        }
        return hero;
    }
}
