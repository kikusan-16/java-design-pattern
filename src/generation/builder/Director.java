package generation.builder;

import java.util.List;

public class Director {

    private Builder builder;

    // コンストラクタ
    public Director(Builder builder) {
        super();
        this.builder = builder;
    }

    // インスタンスを組み立てる
    public void construct(List<Employee> employeeList) {

        // ヘッダー作成
        builder.makeHeader();

        // 一覧作成
        builder.makeEmployeeList(employeeList);
    }
}
