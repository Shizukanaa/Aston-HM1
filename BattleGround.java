package dz;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Воин");
        Hero mage = new Mage("Маг");
        Hero archer = new Archer("Лучник");
        Enemy enemy = new Enemy(100);

        while (enemy.isAlive()) {
            warrior.attackEnemy(enemy);
            mage.attackEnemy(enemy);
            archer.attackEnemy(enemy);
        }

        System.out.println("Враг повержен");
    }
}