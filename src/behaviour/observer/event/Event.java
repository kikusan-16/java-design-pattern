package event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.Data;
import observer.Observer;

public abstract class Event {

    // イベント名
    private String eventName;

    // Observerのリスト
    private List<Observer> observerList = new ArrayList<>();

    // コンストラクタ
    public Event(String eventName) {
        super();
        this.eventName = eventName;
    }

    // イベント名のgetter
    public String getEventName() {
        return this.eventName;
    }

    // Observerを追加するメソッド
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    // Observerを削除するメソッド
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    // Observerに通知するメソッド
    public void noticeObserver(Data data) {

        Iterator it = observerList.iterator();

        // 全てのObserverに通知
        while(it.hasNext()) {
            Observer observer = (Observer)it.next();
            observer.update(this, data);
        }
    }

    // 処理を実行するメソッド
    public abstract void execute(Data data);
}
