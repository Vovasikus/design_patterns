package strategyexercise;

class Main {
    public static void main(String[] args) {
        King king = new King();
        king.performFight();
        king.setWeaponBehavior(new KnifeBehavior());
        king.performFight();
    }
}
