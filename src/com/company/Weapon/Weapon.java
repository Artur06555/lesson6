package com.company.Weapon;

public class Weapon {
    private String typeWeapon , nameWeapon;

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public Weapon(String typeWeapon, String nameWeapon) {
        this.typeWeapon = typeWeapon;
        this.nameWeapon = nameWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }
}
