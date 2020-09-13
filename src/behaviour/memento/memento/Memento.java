package behaviour.memento.memento;

public class Memento {

    // 所持金
    int money;

    // 主人公
    Hero hero;

    // コンストラクタ
    Memento(int money, Hero hero) {
        super();
        this.money = money;
        this.hero = hero;
    }

    // 所持金のgetter
    int getMoney() {
        return money;
    }

    // 主人公のgetter
    Hero getHero() {
        return hero;
    }

    @Override
    public String toString() {
        return "セーブデータ [" + hero + ", 所持金=" + money + "G]";
    }
}
