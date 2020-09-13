package behaviour.visitor;

import java.util.Iterator;

public abstract class Units implements Element {

    // 名前を取得するメソッド
    public abstract String getName();

    // Unitを追加するメソッド
    protected Units add(Units units) throws Exception {
        throw new Exception();
    }

    // イテレーター取得メソッド
    public Iterator<Units> iterator() throws Exception {
        throw new Exception();
    }

    // 一覧表示の際に使用する
    @Override
    public String toString() {
        // 名前を表示する
        return getName();
    }
}
