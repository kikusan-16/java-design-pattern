package generation.prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        //雛形の登録
        Potion redPotion = new Potion("赤のポーション");
        manager.register("redPotion", redPotion);

        Potion bluePotion = new Potion("青のポーション");
        manager.register("bluePotion", bluePotion);

        Sword copperSword = new Sword("銅の剣");
        manager.register("copperSword", copperSword);

        //クローン生成
        Item sword1 = manager.create("copperSword");
        sword1.get();
        sword1.use();

        Item potion1 = manager.create("redPotion");
        potion1.get();
        potion1.use();

        Item potion2 = manager.create("bluePotion");
        potion2.get();
        potion2.use();
    }
}
