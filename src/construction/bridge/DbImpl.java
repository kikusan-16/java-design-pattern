package construction.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class DbImpl {

    // DB接続メソッド
    public abstract void connect();

    // 従業員一覧(全件)を取得するメソッド
    public List<Employee> findAllEmployee() {

        // DBに接続せずに、生成した一覧を返却します
        List<Employee> employeeList = new ArrayList<>();

        Employee yamada = new Employee("山田", 30);
        employeeList.add(yamada);
        Employee tanaka = new Employee("田中", 23);
        employeeList.add(tanaka);

        return employeeList;
    }

    // DBクローズメソッド
    public abstract void close();
}
