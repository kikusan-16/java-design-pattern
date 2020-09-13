package construction.bridge;

public class Employee {

    // 名前
    private String name;

    // 年齢
    private int age;

    // コンストラクタ
    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // 名前のgetter
    public String getName() {
        return name;
    }

    // 名前のsetter
    public void setName(String name) {
        this.name = name;
    }

    // 年齢のgetter
    public int getAge() {
        return age;
    }

    // 年齢のsetter
    public void setAge(int age) {
        this.age = age;
    }

    // toStringメソッド
    @Override
    public String toString() {
        return "behaviour.strategy.Employee [name=" + name + ", age=" + age + "]";
    }
}
