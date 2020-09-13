package construction.composite;

public class Group extends Unit {

    // グループ名
    private String name;

    // コンストラクタ
    public Group(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
