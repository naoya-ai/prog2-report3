package jp.ac.uryukyu.ie.e245750;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class WarriorTest {
    @Test
    public void testWithWeaponSkill(){
        int defaultEnemyHp = 100;
        Warrior warrior = new Warrior("勇者", 100, 20);
        Enemy enemy = new Enemy("モンスター", defaultEnemyHp, 10);
        
        for (int i = 1; i <= 3; i++) {
            int expectedHp = (int) (defaultEnemyHp - warrior.getAttack() * 1.5 * i);
            warrior.attackWithWeaponSkill(enemy);
            assertEquals(expectedHp,enemy.getHitPoint());
        }
    }
}


