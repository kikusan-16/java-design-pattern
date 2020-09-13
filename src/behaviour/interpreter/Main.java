package behaviour.interpreter;

public class Main {

    public static void main(String[] args) {

        String json = "{name: \"山田太郎\","
                + " age: 30,"
                + " prefecture: \"東京都\"}";

        Context context = new Context(json);

        Node objectNode = new ObjectNode();
        try {

            Employee employee = (Employee) objectNode.parse(context);
            System.out.println(employee);

        } catch (JsonParseException e) {
            e.printStackTrace();
        }
    }
}
