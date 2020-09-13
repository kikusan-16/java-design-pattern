package construction.adapter.adapter2;

public class Show {

    // 画面に文字を表示するメソッド
    public void showStr(String str) {
        System.out.println("★" + str + "★");
    }

    // 画面に数値を表示するメソッド
    public void showNumber(int value) {
        System.out.println("入力された数値 = " + value);
    }
}
