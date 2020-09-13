package behaviour.interpreter;

public class ObjectNode extends Node {

    @Override
    public Object parse(Context context) throws JsonParseException {

        // Classクラス生成
        Class<Employee> employeeClass = Employee.class;

        // 結果格納用オブジェクト
        Object employee = null;

        try {
            // インスタンス生成
            employee = employeeClass.newInstance();

            // ループ
            while (context.hasMoreTokens()) {

                // 次のトークンへ移行
                context.nextToken();

                // keyValueNode生成
                Node keyValueNode = new KeyValueNode(employee, employeeClass);
                keyValueNode.parse(context);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new JsonParseException(e.getLocalizedMessage());
        }

        return employee;
    }
}
