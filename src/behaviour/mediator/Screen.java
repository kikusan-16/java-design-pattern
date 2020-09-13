package behaviour.mediator;

public class Screen implements Mediator {

    // ホームボタン
    private Button homeButton;

    // アプリケーションボタン
    private Button applicationButton;

    // コンストラクタ
    public Screen() {
        super();

        // インスタンス生成
        // ホームボタンから先に押せる
        homeButton = new HomeButton(false, this);
        applicationButton = new ApplicationButton(true, this);

    }

    // 各ボタンからの相談を受けるメソッド
    @Override
    public void consulting(int code) {

        switch (code) {
            //ホームボタン
            case Mediator.HOME_PRESS:

                System.out.println("ホーム画面に戻ります");

                // ホームボタンを無効化
                homeButton.setEnable(false);

                // アプリケーションボタンを有効化
                applicationButton.setEnable(true);

                break;

            // アプリケーションボタン
            case Mediator.APPLICATION_PRESS:

                System.out.println("アプリケーションを起動します");

                // アプリケーションボタンを無効化
                applicationButton.setEnable(false);

                // ホームボタンを有効化
                homeButton.setEnable(true);

                break;

            // 上記以外
            default:
                break;
        }

    }

    // ホームボタンのgetter
    public Button getHomeButton() {
        return homeButton;
    }

    // アプリケーションボタンのsetter
    public Button getApplicationButton() {
        return applicationButton;
    }

    @Override
    public String toString() {

        String result = null;

        if(homeButton.isEnable() == false) {

            result = "ホーム画面表示中です";

        } else if(applicationButton.isEnable() == false) {

            result = "アプリケーション画面表示中です";

        }

        return result;
    }
}
