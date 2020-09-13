package construction.bridge;

// Postgres用クラス
public class PostgreDbImpl extends DbImpl {

    @Override
    public void connect() {
        System.out.println("Postgresに接続しました");
    }

    @Override
    public void close() {
        System.out.println("Postgresをクローズしました");
    }
}
