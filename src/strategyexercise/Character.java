package strategyexercise;

abstract class Character {
    WeaponBehavior weaponBehavior;


    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

    public void performFight() {
        weaponBehavior.useWeapon();
    }
}

