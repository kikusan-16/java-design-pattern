package construction.bridge;

// MySQL用クラス
public class MysqlDbImpl extends DbImpl {

    @Override
    public void connect() {
        System.out.println("MySQLに接続しました");
    }

    @Override
    public void close() {
        System.out.println("MySQLとの接続をクローズしました");
    }
}
