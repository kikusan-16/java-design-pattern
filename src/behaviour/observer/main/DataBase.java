package main;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    // データ格納用のList
    private static List<Data> list = new ArrayList<>();

    // 登録メソッド
    public static void insert(Data data) {
        list.add(data);
    }

    // 全件取得メソッド
    public static List<Data> findAll() {
        return list;
    }
}
