package observer;

import event.Event;
import main.Data;

public class EventDisplayObserver implements Observer {

    @Override
    public void update(Event event, Data data) {

        // イベント名を表示
        System.out.println("イベント:" + event.getEventName());

        // 受信データを表示
        System.out.println("受信データ: " + data);
    }
}
