package dz;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 20;
        enemy.takeDamage(damage);
        System.out.println(getName() + " запускает огненный шар!");
    }
}