package construction.adapter.adapter2;

public class PrintAdapter implements Print {

    Show show;

    // コンストラクタ
    public PrintAdapter() {
        super();
        show = new Show();
    }

    // 画面に文字を表示するメソッド
    public void printStr(String str) {

        System.out.println("==========");
        show.showStr(str);
        System.out.println("==========");

    }

    // 画面に数値を表示するメソッド
    public void printNumber(int value) {

        System.out.println("----------");
        show.showNumber(value);
        System.out.println("----------");
    }
}
