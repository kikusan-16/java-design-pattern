package behaviour.interpreter;

public class Employee {

    // 名前
    private String name;

    // 年齢
    private Integer age;

    // 都道府県
    private String prefecture;

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
    public void setAge(Integer age) {
        this.age = age;
    }

    // 都道府県のgetter
    public String getPrefecture() {
        return prefecture;
    }

    // 都道府県のsetter
    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    @Override
    public String toString() {
        return "behaviour.strategy.Employee [name=" + name + ", age=" + age + ", prefecture=" + prefecture + "]";
    }
}
