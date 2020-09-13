package behaviour.visitor;


public class Main {

    public static void main(String[] args) {

        try {
            // 営業１部
            Units salesDepartment1 = new Departments("営業１部");
            Units salesGroup1_1 = new Groups("１課");
            Units salesGroup1_2 = new Groups("２課");

            salesDepartment1.add(salesGroup1_1);
            salesDepartment1.add(salesGroup1_2);

            // 営業２部
            Units salesDepartment2 = new Departments("営業２部");
            Units salesGroup2_1 = new Groups("１課");
            Units salesGroup2_2 = new Groups("２課");

            salesDepartment2.add(salesGroup2_1);
            salesDepartment2.add(salesGroup2_2);

            // 営業部
            Units department = new Departments("営業部");
            department.add(salesDepartment1);
            department.add(salesDepartment2);

            department.accept(new ListVisitor());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
