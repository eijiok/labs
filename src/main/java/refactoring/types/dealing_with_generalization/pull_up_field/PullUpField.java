package refactoring.types.dealing_with_generalization.pull_up_field;

public class PullUpField {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        Tank tank = new Tank();

        System.out.println(soldier.getHealth());
        System.out.println(tank.getHealth());
    }
}
