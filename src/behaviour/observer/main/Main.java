package main;

import java.util.List;

import event.Event;
import event.SendEvent;
import observer.DbInsertObserver;
import observer.EventDisplayObserver;
import observer.Observer;

public class Main {

    public static void main(String[] args) {

        // Observer生成
        Observer displayObserver = new EventDisplayObserver();
        Observer dbInsertObserver = new DbInsertObserver();

        // イベント生成
        Event event = new SendEvent("送信イベント");
        event.addObserver(displayObserver);
        event.addObserver(dbInsertObserver);

        // データ生成
        Data data1 = new Data("key1", 1);
        Data data2 = new Data("key2", 2);
        Data data3 = new Data("key3", 3);

        // イベント実行
        event.execute(data1);
        System.out.println(); //改行

        event.execute(data2);
        System.out.println(); //改行

        event.execute(data3);
        System.out.println(); //改行

        // データベースを確認
        List<Data> list = DataBase.findAll();
        System.out.println("データベースの中身");
        System.out.println(list);
    }
}
