package generation.builder;

public class Employee {

    // 名前
    private String name;

    // 年齢
    private int age;

    // 部署名
    private String departmentName;

    // コンストラクタ
    public Employee(String name, int age, String departmentName) {
        super();
        this.name = name;
        this.age = age;
        this.departmentName = departmentName;
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

    // 部署名のgetter
    public String getDepartmentName() {
        return departmentName;
    }

    // 部署名のsetter
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
