package behaviour.interpreter;

public abstract class Node {

    // 構文解析のメソッド
    public abstract Object parse(Context context) throws JsonParseException;

}
