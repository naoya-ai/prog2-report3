package jp.ac.uryukyu.ie.e245750;

public class Warrior extends LivingThing {
    public Warrior(String name, int hitPoint,  int attack){
        super(name, hitPoint, attack);
    }
    public void attackWithWeaponSkill(LivingThing target){
        int damage = (int) (getAttack() * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",getName(),target.getName(),damage);
        target.wounded(damage);
    }
}
