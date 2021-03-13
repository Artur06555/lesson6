package com.company;

import com.company.Weapon.Weapon;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss( 500 , 100 , new Weapon("Автомат", "Калаш"));
        boss.printInfo();
        Sceleton skeleton =new Sceleton(300,55,new Weapon("Pistolet","makarov"),20);
        skeleton.printInfo();

    }
}
