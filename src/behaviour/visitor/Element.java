package behaviour.visitor;

public interface Element {

    // 訪問者を受け入れるメソッド
    public void accept(Visitor visitor);
}
