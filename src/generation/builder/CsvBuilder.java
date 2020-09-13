package generation.builder;

import java.util.List;

public class CsvBuilder extends Builder {

    StringBuffer sb = new StringBuffer();

    @Override
    public void makeHeader() {

        sb.append("氏名,年齢,部署名\n");

    }

    @Override
    public void makeEmployeeList(List<Employee> employeeList) {

        // CSV一覧の文字列を生成
        for(Employee employee : employeeList) {
            sb.append(employee.getName() + ",");
            sb.append(employee.getAge() + ",");
            sb.append(employee.getDepartmentName() + "\n");
        }

        // 最後の改行コードを取り除く
        sb.substring(0, sb.length() - 1);
    }

    // 結果を取得するメソッド
    public String getResult() {
        return sb.toString();
    }
}
