package behaviour.mediator;

public interface Mediator {

    // ==========================
    // ボタン押下時の判定用変数
    // ==========================
    // ホームボタン押す
    public static final int HOME_PRESS = 1;

    // アプリケーションボタンを押す
    public static final int APPLICATION_PRESS = 2;


    // 各ボタンからの相談を受けるメソッド
    public void consulting(int code);

}
