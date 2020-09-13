package behaviour.visitor;

import java.util.Iterator;

public class ListVisitor implements Visitor {

    // 訪問先の部署名を表示するための変数

    private String currentDepartment = "";

    @Override
    public void visit(Groups groups) {
        // グループ名の表示
        System.out.println(currentDepartment + "/" + groups);
    }

    @Override
    public void visit(Departments departments) {

        // 部署名の表示
        System.out.println(currentDepartment + "/" + departments);

        // 訪問先部署名の一時保存
        String saveDepartment = currentDepartment;

        // 表示用部署名の更新
        currentDepartment = currentDepartment + "/" + departments.getName();

        // イテレーター取得
        Iterator<Units> it = departments.iterator();

        // 再帰的処理
        while (it.hasNext()) {

            // Unit取得
            Units units = it.next();

            // 訪問者の受け入れ
            units.accept(this);
        }

        // 表示用部署名の更新
        currentDepartment = saveDepartment;
    }
}
