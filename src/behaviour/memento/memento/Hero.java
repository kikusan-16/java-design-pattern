package behaviour.memento.memento;

public class Hero {

    // 最大HP
    private int maxHp;

    // 現在のHP
    private int hp;

    // 攻撃力
    private int attack;

    // コンストラクタ
    public Hero(int maxHp, int hp, int attack) {
        super();
        this.maxHp = maxHp;
        this.hp = hp;
        this.attack = attack;
    }

    // 最大HPのgetter
    public int getMaxHp() {
        return maxHp;
    }

    // 最大HPのsetter
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    // HPのgetter
    public int getHp() {
        return hp;
    }

    // HPのsetter
    public void setHp(int hp) {
        this.hp = hp;
    }

    // 攻撃力のgetter
    public int getAttack() {
        return attack;
    }

    // 攻撃力のsetter
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "最大HP=" + maxHp + ", 現在のHP=" + hp + ", 攻撃力=" + attack;
    }
}
