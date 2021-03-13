package com.company;

import com.company.GameEntity.GameEntity;
import com.company.Weapon.Weapon;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(int health, int damage , Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }



    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void printInfo() {
        System.err.println( "Называние оружие:"+getWeapon().getNameWeapon() + ", тИп Оружие: " + getWeapon().getTypeWeapon() + ", Жизнь: " + getHealth() + ", Урон: " + getDamage());
    }
}
