package behaviour.visitor;


public class Groups extends Units {

    // グループ名
    private String name;

    // コンストラクタ
    public Groups(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
