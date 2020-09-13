package behaviour.mediator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 画面生成
        Screen screen = new Screen();

        // ループ用変数
        boolean play = true;

        // コンソール表示メッセージ
        String message = "h:ホームボタン, a:アプリケーションボタン, e:終了";

        while (play) {

            System.out.println(screen);
            System.out.println(message);

            // コンソール入力
            Scanner sc = new Scanner(System.in);

            // 入力された文字列
            String line = sc.nextLine();

            // 入力文字による判定
            if("h".equals(line)) {

                // ホームボタンを押す
                screen.getHomeButton().press();

            } else if("a".equals(line)) {

                // アプリケーションボタンを押す
                screen.getApplicationButton().press();

            } else if("e".equals(line)) {

                // 終了する
                play = false;
                System.out.println("終了します");

            } else {
                // 上記以外
                System.out.println("入力に誤りがあります");
            }

            // 改行
            System.out.println();
        }
    }
}
