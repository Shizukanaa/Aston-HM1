package dz;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 19;
        enemy.takeDamage(damage);
        System.out.println(getName() + " стреляет из лука!");
    }
}