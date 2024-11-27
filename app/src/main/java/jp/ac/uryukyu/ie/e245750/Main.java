package jp.ac.uryukyu.ie.e245750;
public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("勇者", 100,10);
        Enemy enemy = new Enemy("スライム", 100, 30);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while(warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeaponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}
