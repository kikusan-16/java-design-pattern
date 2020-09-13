package construction.bridge;

import java.util.List;

public class Display {

    // DB関連処理クラスのフィールド
    DbImpl impl;

    // コンストラクタ
    public Display(DbImpl impl) {
        super();
        this.impl = impl;
    }

    // 従業員一覧を取得するメソッド
    public List<Employee> getEmployeeList() {

        impl.connect();
        List<Employee> employeeList = impl.findAllEmployee();
        impl.close();

        return employeeList;
    }

    // 従業員一覧を表示するメソッド
    public void showEmployeeList() {

        // 従業員一覧を取得
        List<Employee> employeeList = getEmployeeList();

        // 従業員一覧を表示
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        // 最後に改行
        System.out.println();
    }
}
