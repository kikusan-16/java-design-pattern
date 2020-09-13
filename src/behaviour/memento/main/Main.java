package behaviour.memento.main;

import behaviour.memento.memento.Gamer;
import behaviour.memento.memento.Hero;
import behaviour.memento.memento.Memento;

import java.util.Scanner;

public class Main {

    // ゲームを続けるかどうか
    static boolean play = true;

    public static void main(String[] args) {

        System.out.println("ゲームを始めます");

        // 主人公とゲーマーを作成
        Hero hero = new Hero(30, 30, 10);
        Gamer gamer = new Gamer(hero, 100);
        System.out.println(gamer);

        // セーブデータ作成
        Memento memento = gamer.createMemento();

        String message = "コマンドを入力してください。[f: 敵と戦う, s: セーブ, e:終了]";

        while (play) {

            if (gamer.getHero().getHp() > 0) {

                System.out.println(message);

                // コンソール入力
                Scanner sc = new Scanner(System.in);

                // 入力された文字列
                String line = sc.nextLine();

                if ("f".equals(line)) {

                    // 敵と戦う場合の処理
                    System.out.println("敵と戦います");
                    gamer.fight();

                } else if ("s".equals(line)) {

                    // セーブの場合の処理
                    System.out.println("セーブします");
                    memento = gamer.createMemento();
                    System.out.println(memento);
                    System.out.println("セーブしました");

                } else if ("e".equals(line)) {

                    // ゲーム終了の場合の処理
                    System.out.println("ゲームを終了します");
                    break;

                } else {
                    System.out.println("正しい入力を行ってください");
                }

            } else {

                System.out.println("復帰しますか？[y: 復帰する, n:ゲームを終了する]");

                // コンソール入力
                Scanner sc = new Scanner(System.in);

                // 入力された文字列
                String line = sc.nextLine();

                if ("y".equals(line)) {

                    // 復帰の場合の処理
                    // ゲーマーの状態を戻す
                    gamer.restoreMemento(memento);
                    System.out.println(gamer);

                } else if ("n".equals(line)) {

                    // ゲーム終了の場合の処理
                    break;

                } else {
                    System.out.println("正しい入力を行ってください");
                }
            }
        }
    }

}
