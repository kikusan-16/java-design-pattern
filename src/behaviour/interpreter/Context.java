package behaviour.interpreter;

public class Context {

    // トークン配列
    private String[] tokenArray;

    // 配列のインデックス(-1からスタート)
    private int index = -1;

    // 現在のトークン
    private String currentToken;

    // コンストラクタ
    public Context(String json) {
        super();

        // ,(カンマ)で文字列を分割
        tokenArray = json.split(",");
    }

    // 現在のトークンを取得するメソッド
    public String getCurrentToken() {
        return this.currentToken;
    }

    // 次のトークンが存在するかどうか判定するメソッド
    public boolean hasMoreTokens() {

        boolean result = false;

        // 判定
        if ((index + 1) < tokenArray.length) {
            result = true;
        }

        return result;
    }

    // 次のトークンを取得するメソッド
    public String nextToken() {

        currentToken = tokenArray[++index];

        return currentToken;
    }
}
