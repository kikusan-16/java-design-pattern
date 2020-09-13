package event;

import main.Data;

public class SendEvent extends Event {

    // コンストラクタ
    public SendEvent(String eventName) {
        super(eventName);
    }

    @Override
    public void execute(Data data) {

        // 送信データのチェック
        System.out.println("送信データ: " + data);

        // Observerに通知
        noticeObserver(data);
    }
}
