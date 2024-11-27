package jp.ac.uryukyu.ie.e245750;

import org.junit.jupiter.api.Test;
public class WarriorTest {
    @Test
    public void testWithWeaponSkill(){
        Warrior warrior = new Warrior("勇者", 100, 10);
        Enemy enemy = new Enemy("モンスター", 100, 10);
        
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%d回目の攻撃:", i);
            warrior.attackWithWeaponSkill(enemy);
        }
    }
}


