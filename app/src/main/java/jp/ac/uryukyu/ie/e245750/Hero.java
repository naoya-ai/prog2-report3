package jp.ac.uryukyu.ie.e245750;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param hitPoint ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

}