package com.company;

import com.company.Weapon.Weapon;

public class Sceleton extends Boss  {
    private int putron;



    public int getPutron() {
        return putron;
    }

    public void setPutron(int putron) {
        this.putron = putron;
    }

    public Sceleton(int health, int damage, Weapon weapon , int putron) {
        super(health, damage, weapon);
        this.putron = putron;

    }

    @Override
    public void printInfo() {
        System.err.println( "Называние оружие:"+
                getWeapon().getNameWeapon() + ", тИп Оружие: " +
                getWeapon().getTypeWeapon() + ", Жизнь: " + getHealth() +
                ", Урон: " + getDamage()+ ", патрон" +getPutron());
    }
}
