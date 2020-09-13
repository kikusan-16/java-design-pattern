package construction.composite;

public class Main {

    public static void main(String[] args) {

        // 営業１部
        Unit salesDepartment1 = new Department("営業１部");
        Unit salesGroup1_1 = new Group("１課");
        Unit salesGroup1_2 = new Group("２課");
        salesDepartment1.add(salesGroup1_1);
        salesDepartment1.add(salesGroup1_2);

        // 営業２部
        Unit salesDepartment2 = new Department("営業２部");
        Unit salesGroup2_1 = new Group("１課");
        Unit salesGroup2_2 = new Group("２課");
        salesDepartment2.add(salesGroup2_1);
        salesDepartment2.add(salesGroup2_2);

        // 営業部へ追加
        Unit department = new Department("営業部");
        department.add(salesDepartment1);
        department.add(salesDepartment2);

        // 部署の表示
        department.printList("");
    }
}
