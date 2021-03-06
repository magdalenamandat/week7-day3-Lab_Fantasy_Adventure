package Dungeon.Player;

import Dungeon.Behaviours.iAttack;
import Dungeon.Behaviours.iDamage;
import Dungeon.Equipment.Weapon;

public class Fighter extends Character implements iAttack {
    Weapon weapon;

    public Fighter(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(iDamage target) {
        target.damage(weapon.getDamage());
    }
}
