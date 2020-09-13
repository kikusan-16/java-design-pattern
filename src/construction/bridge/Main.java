package construction.bridge;

public class Main {

    public static void main(String[] args) {

        // 従業員一覧を取得して表示(その１)
        Display d1 = new Display(new MysqlDbImpl());
        d1.showEmployeeList();

        // 従業員一覧を取得して表示(その２)
        Display d2 = new CustomDisplay(new PostgreDbImpl());
        d2.showEmployeeList();

        // 25歳以下の従業員一覧を取得して表示(その３)
        CustomDisplay d3 = new CustomDisplay(new MysqlDbImpl());
        d3.filterAge(25);

    }

}
