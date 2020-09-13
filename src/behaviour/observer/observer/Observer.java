package observer;

import event.Event;
import main.Data;

public interface Observer {

    // Eventから通知があったときの処理
    public void update(Event event, Data data);
}
