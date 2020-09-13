package observer;

import event.Event;
import main.Data;
import main.DataBase;

public class DbInsertObserver implements Observer {

    @Override
    public void update(Event event, Data data) {
        // データベースにinsert
        DataBase.insert(data);
        System.out.println("データベースに登録完了");
    }

}
