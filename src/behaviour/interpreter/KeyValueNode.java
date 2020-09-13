package behaviour.interpreter;

import java.lang.reflect.Method;

public class KeyValueNode extends Node {

    // オブジェクト
    private Object object;

    // Classクラス
    private Class<?> clazz;

    // コンストラクタ
    public KeyValueNode(Object object, Class<?> clazz) {
        super();
        this.object = object;
        this.clazz = clazz;
    }

    @Override
    public String parse(Context context) throws JsonParseException {

        String result = null;

        try {
            // token取得
            String token = context.getCurrentToken();

            // keyとvalueに分割
            String[] keyValue = token.split(":");

            // keyとvalueを取得
            // ・前後の空白除去
            // ・{}の文字列を除去
            String key = keyValue[0]
                    .trim()
                    .replace("{", "");
            String value = keyValue[1]
                    .trim()
                    .replace("}", "");

            // setterのメソッド名
            String methodName = "set" // 接頭辞(set)
                    + key.substring(0, 1).toUpperCase() // keyの頭文字
                    + key.substring(1, key.length()); // 残りの文字
            System.out.println("methodName: " + methodName);

            Method setter = null;

            // valueの値によって、メソッドの引数を変える
            if (value.contains("\"")) {

                // 引数が文字列のsetterを取得
                setter = clazz.getMethod(methodName, String.class);

                // メソッド実行
                setter.invoke(object, value);

            } else {

                // 引数が整数のsetterを取得
                setter = clazz.getMethod(methodName, Integer.class);

                // メソッド実行
                setter.invoke(object, Integer.parseInt(value));
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new JsonParseException(e.getLocalizedMessage());
        }

        return result;
    }
}
