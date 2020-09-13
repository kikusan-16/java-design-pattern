package behaviour.memento.memento;

import java.util.Random;

public class Gamer {

    // 主人公
    private Hero hero;

    // 所持金
    private int money;

    // 乱数
    private Random random = new Random();

    // コンストラクタ
    public Gamer(Hero hero, int money) {
        super();
        this.hero = hero;
        this.money = money;
    }

    // 主人公のgetter
    public Hero getHero() {
        return hero;
    }

    // 敵と戦うメソッド
    public void fight() {

        // 敵のHP（1～10）
        int enemyHp = random.nextInt(10) + 1;

        boolean result = true;

        while (result) {

            // 敵からの攻撃（1～10）
            int enemyAttack = random.nextInt(10) + 1;

            // 主人公のHPを減らす
            hero.setHp(hero.getHp() - enemyAttack);
            System.out.println("敵から攻撃を受けました。");
            System.out.println(enemyAttack + "のダメージ");

            if (hero.getHp() < 1) {
                hero.setHp(0);
                System.out.println("敵にやられました");
                break;
            }

            System.out.println(hero);

            // 主人公の攻撃
            enemyHp = enemyHp - hero.getAttack();

            if (enemyHp < 1) {

                System.out.println("敵を倒しました。");

                // お金を獲得（10～20G）
                int getMoney = random.nextInt(10) + 11;
                System.out.println("敵が" + getMoney + "Gを落としました。");
                money = money + getMoney;

                // 現在の状態を表示
                System.out.println(this);

                break;
            }
        }
    }

    // メメントを作成するメソッド（セーブ用）
    public Memento createMemento() {

        Hero saveHero =
                new Hero(this.hero.getMaxHp(), this.hero.getHp(), this.getHero().getAttack());
        Memento memento = new Memento(this.money, saveHero);

        return memento;
    }

    // メメントから戻すメソッド（復帰用）
    public void restoreMemento(Memento memento) {

        this.money = memento.money;
        this.hero = memento.hero;

    }

    @Override
    public String toString() {
        return "現在の状態 [" + hero + ", 所持金=" + money + "G]";
    }
}
