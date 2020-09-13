package construction.composite;

public abstract class Unit {

    // 名前を取得するメソッド
    public abstract String getName();

    // 一覧を表示するメソッド
    public abstract void printList(String prefix);

    // Unitを追加するメソッド
    protected void add(Unit units) {}

    // 一覧表示の際に使用する
    @Override
    public String toString() {
        // 名前を表示する
        return getName();
    }
}
