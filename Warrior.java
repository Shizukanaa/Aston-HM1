package dz;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 18;
        enemy.takeDamage(damage);
        System.out.println(getName() + " бьет мечом!");
    }
}