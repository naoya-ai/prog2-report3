package jp.ac.uryukyu.ie.e245750;

public class LivingThing {
    private String name;       
    private int hitPoint;      
    private int attack;        
    private boolean dead;     

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    protected void setHitPoint(int hitPoint) { 
        this.hitPoint = hitPoint;
    }

    protected void setDead(boolean dead) { 
        this.dead = dead;
    }

    public void attack(LivingThing opponent) {
        if(getHitPoint() > 0){
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", getName());
            return;
        }
    }
}

