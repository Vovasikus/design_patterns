package strategy;

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<  Silence  >>");
    }
}
